package lockedme;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class FirstChoiceImpl implements FirstChoice {
		
	public ArrayList<String> ascendingOrderSort(String fileLocation) {
		File files = new File (fileLocation);
		ArrayList<String> listOfFiles = new ArrayList<>();
		String[] contentInFilePath = files.list();
		if(contentInFilePath != null) {
			for(int i = 0; i < contentInFilePath.length; i++) {
				String fileName = contentInFilePath[i];
				listOfFiles.add(fileName);
			}
		}
		Collections.sort(listOfFiles);
		System.out.println(listOfFiles);
		return listOfFiles;
	}

}
