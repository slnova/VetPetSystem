package VetPet.Menu.MenuCommands;


/*==========================================================================*/
/** \file Quit.java
    \brief 
    \author Jordan James Kidney
    \date Sept 25, 2005

    
*/
/* 
   Location: University of Calgary, Alberta, Canada
   Created on:    Sept 25, 2005
   Last Updated   Sept 25, 2005
========================================================================*/


import VetPet.Menu.*;

public class Quit extends MenuCommand
{
	public Quit()
	{
		super("Quit");
	}

	/** This method contains the code which implements the Quit 
	    functionality.  Always returns false.
	 */
	public boolean executeImpl(Console input)  throws Exception
	{
		return false;
	}
}
