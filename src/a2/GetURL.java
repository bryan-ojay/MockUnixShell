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

import java.net.*;
import java.util.*;
import driver.*;

/** 
 * Represents the'get' command. File from URL is downloaded to the current 
 * directory.
 */
public class GetURL extends Command {
	/**
	 * executes the move command and checks if the inputted URL is correct.
	 * @param URL is the source URL inputted in the shell as a string
	 */

	public String execute(String URL) {

		try {
			// get the contents from the URL as a String
			String contents = new Scanner(new URL(URL).openStream(), "UTF-8")
					.useDelimiter("\\A").next();
			/* split the array at the forward slash (/) so we can get the name
			 * from the end of the URL
			 */
			String[] splitURL = URL.split("/");
			/* create a String for the name of the file, using the last element
			 * of the earlier String array
			 */
			String name = splitURL[splitURL.length - 1];
			/* name of the file is a substring of name, without the extension
			 * by taking the name up to the dot (.)
			 */
			String fName = name.substring(0, name.indexOf('.'));
			/*
			 * Create a new file by using the findFile method, using fName as
			 * the file name and setting createFile to true
			 */
			File file = findFile(fName, true);
			// set the contents of the created file to the URL contents
			file.setContents(contents);
		} catch (Exception e) {
			// if the URL is invalid, catch the error and do nothing
			System.out.println("Invalid URL");
		}
		return null;
	}
}