package VetPet;
/*==========================================================================*/
/** \file VetPetSystem.java
    \brief main start file for program 
    \author Jordan James Kidney
    \date Sept 25, 2005

    
*/
/* 
   Location: University of Calgary, Alberta, Canada
   Created on:    Sept 25, 2005
   Last Updated   Sept 25, 2005
========================================================================*/

/**
 \class VetPetSystem
 \brief main class that represents the system

 instatiated by using the singlton design pattern
*/




import VetPet.Menu.*;
import VetPet.Menu.MenuCommands.*;

public class VetPetSystem
{
    private VetPetSystem()
    {
	sysMenu.addMenuCommand( new AddClinic() );
	sysMenu.addMenuCommand( new ListAllVet() );
	sysMenu.addMenuCommand( new ListAllAnimals() );
	sysMenu.addMenuCommand( new AddDog() );
	sysMenu.addMenuCommand( new AddCat() );
	sysMenu.addMenuCommand( new Quit() );
    }
    //------------------------------------------------------------------------
    /** 
	
    */
    public void run()
    {
	sysMenu.run();
    }

    public VetManager getManager() { return Manager; }

    //-------------- private fields ------------------------------------------
    private VetManager Manager = new VetManager();/**< \brief manager of all vets  */
    private Menu sysMenu = new Menu(); /**< \brief used to run the menu system */

    //------------------------------------------------------------------------
    /**
       \brief method that should be called to get the reference to the system object
     */
    public static VetPetSystem getSystem()
    {
	if(sys == null) sys = new VetPetSystem();
	return sys;
    }
    private static VetPetSystem sys = null; /**< \brief used to store ref for singtopn design patter setup */

    //====================== MAIN FUNCTION ===================================
    public static void main(String[] args)
    {
	VetPetSystem sys = VetPetSystem.getSystem();
	sys.run();
    }

}
