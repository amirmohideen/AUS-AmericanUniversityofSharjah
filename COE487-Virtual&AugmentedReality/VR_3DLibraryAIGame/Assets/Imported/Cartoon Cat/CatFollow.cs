using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;
public class CatFollow : MonoBehaviour
{
    // Start is called before the first frame update

    public NavMeshAgent Cat;
    public Transform FirstPersonAIO;

    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        Cat.SetDestination(FirstPersonAIO.position);
    }
}
