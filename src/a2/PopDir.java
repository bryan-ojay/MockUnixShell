// **********************************************************
// Assignment2:
// Student1:
// UTORID user_name: oladejib
// UT Student #: 1004112738
// Author: Bryan Ifeoluwapo Oladeji
//
// Student2:
// UTORID user_name: singhd51
// UT Student #: 1004322280
// Author: Divneet Singh
//
// Student3:
// UTORID user_name: khulla18
// UT Student #: 1004325893
// Author: Jayesh Khullar
//
// Student4:
// UTORID user_name: mendezve
// UT Student #: 1004353479
// Author: Daniel Mendez Velarde
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// I have also read the plagiarism section in the course info
// sheet of CSC B07 and understand the consequences.
// *********************************************************
package a2;

import driver.JShell;

/**
 * Represents the popd command. Users may remove the top entry from 
 * the directory stack, and cd into it
 */
public class PopDir extends Command {

	/**
	 * Validates parameters for and executes the popd command.
	 * @param input String for syntax correctness
	 */
	public String execute(String input) {
		// check if the input is not empty
		if (!(input.equals(""))) {
			// let the user know the commands syntax is wrong
			System.out.println("The syntax of the command is incorrect.");
		}
		else {
			try {
				// set the <curr> to the path after you pop from the dir stack
				JShell.curr = findPath(JShell.directoryStack.pop());
			}
			catch(Exception emptyException) {
				/*
				 * if there are no saved directories, catch the error and
				 * give an appropriate error message
				 */
				System.out.println("There are no saved directories.");
			}
		}
		return null;
	}
}
