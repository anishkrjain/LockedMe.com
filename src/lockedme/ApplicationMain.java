package lockedme;

public class ApplicationMain {

  public static void main(String[] args) {
	System.out.println("******************************************************************");
    System.out.println("                            Locked.com                            ");
    System.out.println("******************************************************************");
    System.out.println("\n");
    System.out.println("******************************************************************");
    System.out.println("DEVELOPED BY  \n             - Anish Kumar Jain \n             - MS FSD Mar 2022 Cohort 2");
    System.out.println("******************************************************************");

    final FileOperations fileOperations = new FileOperationsImpl();

    new Menu(fileOperations);

  }
}
