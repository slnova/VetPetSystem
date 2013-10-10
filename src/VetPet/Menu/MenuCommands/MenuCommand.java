package VetPet.Menu.MenuCommands;


/*==========================================================================*/
/** \file MenuCommand.java
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
 \class MenuCommand
 \brief 

 This class is the abstract super class for the menu system.  It maintains the name of the command
    and a reference to the next command in the list of commands.  This class forms the basis for 
    the "chain of responsibility" pattern.  

    <p> Programmers are expected to subclass this class to provide their own menu functionality.
    To execute a menu command, the execute method must be invoked with the number of the
    menu item to be executed and a reference to the console input object which is to be used for
    reading keyboard input.

*/




import VetPet.Menu.*;

public abstract class MenuCommand
{
	private MenuCommand next;			// successor in the chain
	private String name;

	public MenuCommand(String menuText)
	{
		name = menuText;
	}

	/** Invoke this method to add a menu command to the menu chain.  The menu will be 
	    added to the end of the chain */

	public void addCommand(MenuCommand aCommand)
	{
		if (next!=null)
			next.addCommand(aCommand);
		else
			next = aCommand;
	}

	/** Invoke this method to execute a menu command.  The count represents which command in the
	    chain is to be executed.
	    <p><b>Note:</b> This method returns false if the application is to terminate as a result of this menu command.
	*/

	public boolean execute(int count, Console input) throws Exception
	{
		count--;
		if (count == 0)
			return executeImpl(input);
		else
		{
			if (next == null)
			{
				System.out.println("Unknown command");
			}
			else
				return next.execute(count, input);
		}
		return true;
	}

	/** This method returns a reference to the next command in the chain */
	public MenuCommand getNext()
	{
		return next;
	}

	/** This method returns the name of the command */
	public String getName()
	{
		return name;
	}

	/** This is the abstract method which is invoked on the menu command which has been requested.  
	    Any concrete menu command class must override this method and provide the necessary functionality
	    for the command.
	 */
	public abstract boolean executeImpl(Console input)  throws Exception;
}
