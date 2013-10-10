package VetPet.Menu;

/*==========================================================================*/
/** \file Menu.java
    \brief 
    \author Prof Craig Schock ( modified by Jordan James Kidney )
    \date Sept 25, 2005

    
*/
/* 
   Location: University of Calgary, Alberta, Canada
   Created on:    Sept 25, 2005
   Last Updated   Sept 25, 2005
========================================================================*/

/**
 \class Menu
 \brief top class for running the menu system

*/



import VetPet.Menu.MenuCommands.*;

// Note: this code has been provided by Prof Craig Schock

public class Menu
{
    private MenuCommand head = null;
    private Console aConsole = new Console();

    public Menu()
    {
	
    }
    
    public void addMenuCommand(MenuCommand cmd)
    {
	if(head==null) head=cmd;
	else head.addCommand( cmd );
    }
    
    public void run()
    {
	String line;
	do
	    {
		printMenu();
		line = aConsole.nextLine();
		if (line == null)
			    break;
		
	    } while (parseCommand(line));
    }
    
    private boolean parseCommand(String line)
    {
	
	try
	    {
		return head.execute(Integer.parseInt(line), aConsole);
	    }
	catch(Exception x)
	    {
		System.out.println("\nERROR: " + x.getMessage() + "\n");
		aConsole.nextLine("press enter to continue");
		return true;
	    }
	
    }
    
    private void printMenu()
    {
	printMenuTitle();
	printMenuEntries();
	printPrompt();
    }
    
    private void printMenuTitle()
    {
	System.out.println("\n========================\n");
	System.out.println("Main Menu");
	System.out.println("\n========================\n");
	
    }
    
    private void printMenuEntries()
    {
		int count = 1;
		MenuCommand current = head;
		while(current!=null)
		    {
			System.out.println(count + ". " + current.getName());
			current = current.getNext();
			count++;
		    }
		
	}
    
    private void printPrompt()
    {
	System.out.print("\nCommand: ");
	System.out.flush();
    }
}
