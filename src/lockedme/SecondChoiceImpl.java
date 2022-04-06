package lockedme;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SecondChoiceImpl implements SecondChoice {
	
	private FirstChoice firstChoice = new FirstChoiceImpl();
	public static Scanner sc = new Scanner(System.in);

	public void createFile(String fileLocation) {
		File files = new File(fileLocation);
		System.out.println("Please enter the name of the file you want to create: \n");
		String filename = sc.next();

		File file = new File(files, filename);
		try {
			if (file.createNewFile()) {
				System.out.println("A new file : " + file.getName() + " is created.\n");
			} else {
				System.out.println("File with name : " + file.getName() + " already exists. Please try again.\n");
				createFile(fileLocation);
			}
		} catch (IOException e) {
			System.err.println("File couldn't be created due to an unexpected error.");
			e.printStackTrace();
		}
	}

	public void deleteFile(String fileLocation) {
		File files = new File(fileLocation);
		ArrayList<String> listOfFiles = new ArrayList<>();
		listOfFiles = firstChoice.ascendingOrderSort(fileLocation);
		System.out.println("Please enter the file you want to delete : \n");
		String filename = sc.next();
		File file = new File(files, filename);
		if(listOfFiles.contains(filename)) {
			file.delete();
			System.out.println("File : " + file.getName() + " is deleted.\n");
		}
		else {
			System.err.println("File with name : " + file.getName() + " does not exist. Please try again\n");
			deleteFile(fileLocation);
		}
	}

	
	public void searchFile(String fileLocation) { 
		ArrayList<String> listOfFiles = new ArrayList<>();
		System.out.println("Please enter the name of the file you want to search : "); 
		String filename = sc.next(); 
		listOfFiles = firstChoice.ascendingOrderSort(fileLocation); 
		if(listOfFiles.contains(filename)) {
			System.out.println("File : " + filename + " is present in the directory."); 
		}
		else { 
			System.err.println("Sorry, file : " + filename + " is not found in the directory. Please try again!"); 
			searchFile(fileLocation);
			}
		}
	 
}
