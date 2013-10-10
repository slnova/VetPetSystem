package VetPet.Menu;

import java.io.*;



/*==========================================================================*/
/** \file Console.java
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
 \class Console
 \brief 

  The purpose of this class is to make it easier to read input from the keyboard.
  At this point, we haven't covered files or any type of I/O.  Using this class, you
  can read input from the keyboard a line at a time.

*/





// Note: this code has been provided by Prof Craig Schock

public class Console
{
	private BufferedReader in;

	public Console()
	{
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public String nextLine()
	{
		return nextLine(null);
	}

/** Call this method to read in the next line of text from the keyboard.  If an error
    occurs, this method will return a null reference. */

	public String nextLine(String prompt)
	{
		if (prompt!=null)
			printPrompt(prompt);
		try
		{
			return in.readLine();
		}
		catch(Exception x)
		{
			// can ignore
		}
		return null;
	}

	public int nextLineInt()
	{
		return nextLineInt(null);
	}

	public int nextLineInt(String prompt)
	{
		if (prompt!=null)
			printPrompt(prompt);
		try
		{
			return Integer.parseInt(in.readLine());
		}
		catch(Exception x)
		{
			// can ignore
		}
		return -1;
	}

	private void printPrompt(String prompt)
	{
		System.out.print(prompt);
		System.out.flush();
	}
		 
}
