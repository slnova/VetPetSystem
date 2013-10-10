package VetPet;


/*==========================================================================*/
/** \file VetClinic.java
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
 \class VetClinic
 \brief main class for a single vet clinic

*/



import VetPet.Animals.*;

public class VetClinic
{
    //---------------------------------------------------------------------------
    /**
       \brief constructor
       \param[in] Name the name of the vet clinic
     */
    public VetClinic(String Name)
    {
	this.Name = Name;
    }
    
    public boolean validID(String ID)
	{
		if(ID.length() != 6 ) return false;

		for(int i=0; i < ID.length(); i++ )
			if( !Character.isDigit(ID.charAt(i))) return false; 
		
		return true;		
	}
    
    //---------------------------------------------------------------------------
    /**
       \brief adds a dog to the clinic 
       \param[in] name the name of the dog
       \param[in] ID identification number of the dog (MUST be exactly 6 digits long)
       \param[in] K9_family family branch the dog is from
       \param[in] type the classification of the dog
       
       \return true is dog has been added, false if the ID number is inncorect
     */
    //---------------------------------------------------------------------------
    public boolean addDog(String ID,String type, String name,  String K9_family )
	{

		if(!validID(ID))
			return false;
		
		Dog doggy = new Dog(ID, type, name, K9_family);
		
		Doglist[numDogs] = doggy;
		numDogs++;
		
		return true;
			
	}
    
    
    //---------------------------------------------------------------------------
    /**
       \brief adds a cat to the clinic 
       \param[in] name the name of the cat
       \param[in] ID identification number of the cat (MUST be exactly 6 digits long)
       \param[in] toy fav toy of the cat
       \param[in] type the classification of the cat
       
       \return true is cat has been added, false if the ID number is inncorect
     */
    public boolean addCat(String name, String ID, String toy, String type )
    {
    	if(!validID(ID))
    		return false;

    	Cat kitty = new Cat(ID, type, name, toy);

    	Catlist[numCats] = kitty;
    	numCats++;
	
    	return true;
    }
    //---------------------------------------------------------------------------
    public int numAnimals() { return numDogs + numCats; }
    public String getName() { return Name; }
    //---------------------------------------------------------------------------
    /**
       \brief lists all the animalsin the clinic
       \return the list of animals
     */
    public String listAll_animals()
    {
	String ret = "";
	int i=0;
	
	ret="Animal: Cats\n";
	for(i=0;i< numCats; i++)
	    {
		Cat c = Catlist[i];
		ret += "\t ID: "+ c.ID +" Name: " + Animal.c.getName() + " Type: " + c.type 
		    +" Toy: " + c.toy() +"\n";
	    }

	ret+="\nAnimal: Dogs\n";
	for(i=0;i< numDogs; i++)
	    {
		Dog d = Doglist[i];
		ret += "\t ID: "+ d.ID +" Name: " + d.getName() + " Type: " + d.type 
		    +" K9_family: " + d.getK9_family() +"\n";
	    }

	return ret;
    }
    //---------------------------------------------------------------------------
    /**
       \brief returns the information on a single animal
       \return null if the animal could not be found,otherwise a string with the animals information
     */
    public String getAnimalInformation(String ID)
    {
	int i=0;
	if(ID.length() != 6 ) return null;
	
	for(i=0; i < ID.length(); i++ )
	    if( !Character.isDigit(ID.charAt(i))) return null; 


	
	for(i=0;i< numCats; i++)
	    {
		Cat c = Catlist[i];

		if(c.ID.equals(ID))
		    return "(CAT) ID: "+ c.ID +" Name: " + c.getName() + " Type: " + c.type 
		               +" Toy: " + c.getFav_cat_toy() +"\n";
	    }
		

	for(i=0;i< numDogs; i++)
	    {
		Dog d = Doglist[i];
		
		if(d.ID.equals(ID))
		    return "(DOG) ID: "+ d.ID +" Name: " + d.getName() + " Type: " + d.type 
			+" K9_family: " + d.getK9_family() +"\n";
	    }

	return null;
    }
    //---------------------------------------------------------------------------
    private Cat Catlist[] = new Cat[10]; /**< \brief list of all cats in the clinic */
    private Dog Doglist[] = new Dog[10]; /**< \brief list of all dogs in the clinic */
    private int numDogs = 0; /**< \brief number of dogs */
    private int numCats = 0; /**< \brief numberof cats */
    private String Name = ""; /**< \brief name of the clinic */
}
