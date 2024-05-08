using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PickUpController : MonoBehaviour
{
    
    public Rigidbody rb;
    public BoxCollider coll;
    public Transform FirstPersonAIO, BookFolder, PlayerCamera;

    public float pickUpRange;
    public float dropForwardForce, dropUpwardForce;

    public bool equipped;
    public static bool slotFull;

    private void Start()
    {
        //Setup
        if (!equipped)
        {
            
            rb.isKinematic = false;
            coll.isTrigger = false;
        }
        if (equipped)
        {
            
            rb.isKinematic = true;
            coll.isTrigger = true;
            slotFull = true;
        }
    }

    private void Update()
    {
        //Check if FirstPersonAIO is in range and "E" is pressed
        Vector3 distanceToFirstPersonAIO = FirstPersonAIO.position - transform.position;
        if (!equipped && distanceToFirstPersonAIO.magnitude <= pickUpRange && Input.GetKeyDown(KeyCode.E) && !slotFull) PickUp();

        //Drop if equipped and "Q" is pressed
        if (equipped && Input.GetKeyDown(KeyCode.Q)) Drop();
    }

    private void PickUp()
    {
        equipped = true;
        slotFull = true;

        //Make weapon a child of the camera and move it to default position
        transform.SetParent(BookFolder);
        transform.localPosition = Vector3.zero;
        transform.localRotation = Quaternion.Euler(Vector3.zero);
        transform.localScale = Vector3.one;

        //Make Rigidbody kinematic and BoxCollider a trigger
        rb.isKinematic = true;
        coll.isTrigger = true;

        
    }

    private void Drop()
    {
        equipped = false;
        slotFull = false;

        //Set parent to null
        transform.SetParent(null);

        //Make Rigidbody not kinematic and BoxCollider normal
        rb.isKinematic = false;
        coll.isTrigger = false;

        //Gun carries momentum of FirstPersonAIO
        rb.velocity = FirstPersonAIO.GetComponent<Rigidbody>().velocity;

        //AddForce
        rb.AddForce(PlayerCamera.forward * dropForwardForce, ForceMode.Impulse);
        rb.AddForce(PlayerCamera.up * dropUpwardForce, ForceMode.Impulse);
        
    }
}
