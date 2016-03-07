package test.java;

import main.java.PhoneDirectory;
import java.util.Scanner;
public class Driver extends PhoneDirectory{
	public static void main(String[] s) {
		//create a instance of a phone book
	   PhoneDirectory book = new PhoneDirectory();
	   
	   System.out.println("This is the updated Phone Directory");
	   //prints the current phone directory
	   book.print();
	   
	   int choice = 0;
	   Scanner in = new Scanner(System.in);
	   String name, number;
	  
	   do{ 
		   System.out.println("Press 1 to add an entry");
		   System.out.println("Press 2 to delete an entry");
		   System.out.println("Press 3 to change an entry");
		   System.out.println("Press 4 to get a number from an entry");
		   System.out.println("Press 5 to print new directory");
		   System.out.println("Press 0 to exit program");
		   
		   choice = in.nextInt();
		   in.nextLine();
		   switch(choice){
		   case 1: //adds
		    //shows functionality of the add function
			   System.out.println("Enter the name you want to add and press enter");
			   name = in.nextLine();
			   name.trim();
			   System.out.println("Enter the number and press enter");
			   number = in.nextLine();
			   book.addEntry(name, number);
			   break;
	   
		   case 2: //deletes
			   //shows functionality of the delete function
			   System.out.println("Enter the name you want to delete and press enter");
			   name = in.nextLine();
			   name.trim();
			   book.deleteEntry("John Doe");
			   break;
		   case 3: //changes
			   //shows functionality of the change function
			   System.out.println("Enter the name you wish to change and press enter");
			   name = in.nextLine();
			   name.trim();
			   System.out.println("Enter the number and press enter");
			   number = in.nextLine();
			   book.changeEntry(name, number);
			   break;
		   case 4: //gets number
			   //	shows funcitonality of getNumber function
			   System.out.println("Enter the name you wish to recieve a number for and press enter");
			   name = in.nextLine();
			   name.trim();
			   System.out.println(book.getNumber(name));
			   break;
		   case 5: //prints out the new directory
			   //prints the new list after all the changes
			   book.print();
			   break;
		   default:
			   break;
	   }
	   }while(choice != 0);	   
	   
	   in.close();
	}
}

