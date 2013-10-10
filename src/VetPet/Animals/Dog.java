package VetPet.Animals;



/*==========================================================================*/
/** \file Dog.java
    \brief 
    \author Jordan James Kidney
    \date Sept 25, 2005

    
*/
/* 
   Location: University of Calgary, Alberta, Canada
   Created on:    Sept 25, 2005
   Last Updated   Sept 25, 2005
========================================================================*/

/**
 \class Dog
 \brief holds information on a single dog

*/



public class Dog
{
    public String ID;
    public String type;
 
    public void setN(String N, int N2) { Name=N; }
    public String getN() { return Name; }

    public void setK9_family( String fam ) { K9_family=fam; }
    public String getK9_family() { return K9_family; }

    private String Name;
    private String K9_family;
}
