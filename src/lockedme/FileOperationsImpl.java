package lockedme;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileOperationsImpl implements FileOperations {
	
  private FirstChoice firstChoice = new FirstChoiceImpl();	
  private SecondChoice secondChoice = new SecondChoiceImpl();
  private Scanner sc = new Scanner(System.in); 
  private int choice = 0;
  
  @Override
  public void getAllFiles() {
	  String fileLocation = new String();
	do {	
		System.out.println("\n-----ALL FILES IN ASCENDING ORDER-----\n");
		System.out.println("\n1. Sort files in Ascending Order");
		System.out.println("2. Go back to main menu");
		System.out.println("Please enter your choice - \n");
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Invalid Option. Please enter valid option.\n");
				getAllFiles();
			}
			if(choice == 1) {
				System.out.println("Please enter the path of the locker folder - \n");
			    fileLocation = sc.next(); //
			}
				switch(choice) {
				case 1: firstChoice.ascendingOrderSort(fileLocation);
						break;
				case 2: new Menu(new FileOperationsImpl());
						break;
				default:
						System.err.println("Sorry, this option isn't available. Please try again!\n");
						break;
				}
			}
	while(choice != 2);
  }

  @Override
  public void displayDetails() {
	System.out.println("Please enter the file path - \n");
	String fileLocation = sc.next();
	do {
		System.out.println("\n-----DISPLAY FILE DETAILS-----\n");
		System.out.println("\n1. Add file to the existing directory");
		System.out.println("2. Delete a file");
		System.out.println("3. Search a file");
		System.out.println("4. Go back to main menu");
		System.out.println("Please enter your choice - \n");
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.\n");
			}
			switch (choice) {
			case 1: secondChoice.createFile(fileLocation);
					break;
			case 2: secondChoice.deleteFile(fileLocation); 
					break; 
			case 3: secondChoice.searchFile(fileLocation); 
					break;
			case 4: new Menu(new FileOperationsImpl());
					break;
			default:
				System.err.println("Sorry, this option isn't available. Please try again!\n");
				break;
			}
		}
	while(choice != 4);
  }

}
