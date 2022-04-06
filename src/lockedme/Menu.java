package lockedme;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

  public Menu(FileOperations fileOperations){
    Scanner sc = new Scanner(System.in);
    int choice = -1;
    do {
    	  System.out.println("\n----------MENU----------");
    	  System.out.println("1. Display all files in Ascending Order");
    	  System.out.println("2. File Operations");
    	  System.out.println("3. Close application");

    	  System.out.println("Please enter your choice : \n");
	      try {
	        choice = sc.nextInt(); //Asking input
	      }
	      catch (InputMismatchException ex){
	    	  System.err.println("Error! Please enter a valid option.\n");
	        new Menu(fileOperations);
	      }

	      switch (choice){
	        case 1: fileOperations.getAllFiles();
	          break;
	        case 2: fileOperations.displayDetails();
	          break;
	        case 3:
	        	System.out.println("Thank you for using LockedMe.com!");
	          System.exit(1);
	          break;
	        default:
	        	System.err.println("Sorry, this option isn't available. Please try again!\n");
	      }
    }
    while (choice != 3);
    sc.close();
  }
}
