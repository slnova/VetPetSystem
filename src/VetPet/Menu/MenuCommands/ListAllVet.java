package VetPet.Menu.MenuCommands;


/*==========================================================================*/
/** \file ListAllVet.java
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

public class ListAllVet extends MenuCommand
{
	public ListAllVet()
	{
		super("List All Vet Clinic");
	}

	public boolean executeImpl(Console input) throws Exception
	{
	    VetPetSystem sys = VetPetSystem.getSystem();
	    String vets =sys.getManager().list_all_vet_clinics();
	  
	    System.out.println(vets + "\n");
  
	    return true;
	}
}
