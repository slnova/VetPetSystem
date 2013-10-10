package VetPet.Menu.MenuCommands;


/*==========================================================================*/
/** \file ListAllAnimals.java
    \brief 
    \author Jordan James Kidney
    \date Sept 25, 2005

    
*/
/* 
   Location: University of Calgary, Alberta, Canada
   Created on:    Sept 25, 2005
   Last Updated   Sept 25, 2005
========================================================================*/





import VetPet.*;
import VetPet.Menu.*;

public class ListAllAnimals extends MenuCommand
{
	public ListAllAnimals()
	{
		super("List All Animals");
	}

	public boolean executeImpl(Console input) throws Exception
	{
	    VetPetSystem sys = VetPetSystem.getSystem();
	    String animals =sys.getManager().list_all_animals();
	  
	    System.out.println(animals + "\n");
  
	    return true;
	}
}
