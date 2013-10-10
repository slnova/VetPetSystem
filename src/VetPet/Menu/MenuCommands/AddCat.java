package VetPet.Menu.MenuCommands;



/*==========================================================================*/
/** \file AddCat.java
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

public class AddCat extends MenuCommand
{
	public AddCat()
	{
		super("Add Cat");
	}

	public boolean executeImpl(Console input) throws Exception
	{
	    VetPetSystem sys = VetPetSystem.getSystem();
	    String name = input.nextLine("Enter vet name: ");
	    VetClinic vet = sys.getManager().getVetClinic(name);
	    
	    String ID = input.nextLine("Enter ID: ");
	    String dname = input.nextLine("Enter Name: ");
	    String type = input.nextLine("Enter Type: ");
	    String toy = input.nextLine("Enter toy: ");

	    if( vet.addCat(dname,ID,toy,type) == false)
		throw new Exception("inncorrect ID number");

	    System.out.println("The cat has been added to the system\n");
	     
	    return true;
	}
}
