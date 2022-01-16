package ProjectPhase1;
/**
 * 
 */
/**
 * @author Nandini_Gorkal
 *
 */

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperationsinJava implements FileDiscription  {
	List<String> retrieve= new ArrayList<String>();
	File[] files = new File("C:\\Users\\Nandini\\OneDrive\\Desktop\\Mphasis files\\Java programs\\javabasic").listFiles();
	@Override
	public void DisplayAllFiles() {
		// TODO Auto-generated method stub
		for(File file : files) {
			if(file.isFile()) {
				retrieve.add(file.getName());
				//System.out.println(file.getName());
			}
		}
		retrieve.forEach(System.out::println);

	}

	@Override
	public void AddingFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file which you want to add:");
		//sc.next();
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		
		File F= new File(filename);
		try {
			if(F.createNewFile()) {
				System.out.println(filename+" file is added to the directory");
				Desktop.getDesktop().edit(F);
			}
			else {
				System.out.println("This file is already there");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

	@Override
	public void DeletingFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file which you want to delete:");
		//sc.next();
		Scanner scan=new Scanner(System.in);
		File directory = new File("C:\\Users\\Nandini\\OneDrive\\Desktop\\Mphasis files\\Java programs\\javabasic");
		String filename=scan.nextLine();
		 File[] files=directory.listFiles();
         int flag=0;
         for (File file : files) {
             String name = file.getName();
             //System.out.println(name);
             if(name.equalsIgnoreCase(filename))
            	 
            	System.out.println(name.toUpperCase()+" got Deleted");
                file.delete();
                flag=1;
         }
		if(flag==0) {
			System.out.println("file not found");
			}
		}
	
	
	
	@Override
	public void SearchingFile() {
		// TODO Auto-generated method stub
		try {	
			Scanner scan= new Scanner(System.in);
			File directory = new File("C:\\Users\\Nandini\\OneDrive\\Desktop\\Mphasis files\\Java programs\\javabasic");
			System.out.println("Enter the file name which you want to search:");
			String fileName=scan.nextLine();
            File[] files=directory.listFiles();
            int flag=0;
            for (File file : files) {
                String name = file.getName();
                //System.out.println(name);
                if(name.equalsIgnoreCase(fileName)) {
                        System.out.println("The filename "+fileName+" is present in the directory");
        				File f= new File(fileName);
        				Scanner sc1 = new Scanner(f);
        				while(sc1.hasNextLine()) {
        				System.out.println(sc1.nextLine()+" file is present in the directory");
        				}
        			flag=1;	
                }
			}
        if(flag==0) {
        	System.out.println("File not found");
        }

		}catch(FileNotFoundException ex) {
			System.out.println("file not found");
		}

	}
}


