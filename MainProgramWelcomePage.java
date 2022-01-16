package ProjectPhase1;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * 
 * @author Nandini Gorkal
 *
 */
public class MainProgramWelcomePage {

	public static void main(String[] args) {
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	
	/*
	 * This function is used to display the welcome screen on the console
	 */
	private static void welcomeScreen() {
		System.out.println("-------------------File OPerations Program--------------------- \n");
		
		System.out.println("--------------------Using Java------------- \n");
		
		System.out.println("***************** Developed by Nandini ****************** \n");
	}

	/*
	 * This function is used for keep the menu for user interaction
	 * @throws FileNotFoundException 
	 */
	private static void menuDriven() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		 FileOperationsinJava obj = new FileOperationsinJava();
		int option;
		do {
		System.out.println("Enter your choice which you want to select: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. File operation menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.DisplayAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Enter your choice for File Operations operation");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file from a directory");
			System.out.println("\t3. Searching a file and showing its content");
			System.out.println("\t4. Exit from File operation menu");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.AddingFile();
				break;
			case 2:
				obj.DeletingFile();
				break;
			case 3:
				obj.SearchingFile();
				break;
			case 4:
				System.out.println("Exited from the File  operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");
		}

		
		}while(option!=3);

	}
}