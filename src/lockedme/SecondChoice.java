package lockedme;

public interface SecondChoice {
	
	/*
	 * Method to create a file in a given location
	 * 
	 * @param fileLocation location to create the new file
	 */
	
	void createFile(String fileLocation);
	
	/*
	 * Method to delete a file from a given location
	 * 
	 * @param fileLocation location to delete the existing file
	 */
	
	void deleteFile(String fileLocation);
	
	/*
	 * Method to search a file from a given location
	 * 
	 * @param fileLocation location to search the file
	 */
	
	void searchFile(String fileLocation);

}
