package VetPet.Animals;



/*==========================================================================*/
/** \file Cat.java
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
 \class Cat
 \brief holds information on a single cat

*/


public class Cat
{
    public String ID;
    public String type;
 
    public void setN(String N, int N2) { Name=N; }
    public String getN() { return Name; }

    public void setFav_cat_toy( String toy) { fav_cat_toy=toy; }
    public String getFav_cat_toy() { return fav_cat_toy; } 

    private String Name;
    private String fav_cat_toy; 
}
