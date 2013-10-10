package VetPet.Menu.MenuCommands;

/*==========================================================================*/
/** \file AddClinic.java
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

public class AddClinic extends MenuCommand
{
	public AddClinic()
	{
		super("Add Clinic");
	}

	public boolean executeImpl(Console input) throws Exception
	{
	    VetPetSystem sys = VetPetSystem.getSystem();
	    String name = input.nextLine("Enter vet name: ");
	    sys.getManager().addVetClinic(name);
	  
	    System.out.println("The vet has been added\n");
  
	    return true;
	}
}
