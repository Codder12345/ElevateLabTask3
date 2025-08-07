package org.elevateLab;

import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
	
		  Library lib = new Library();
	    
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n===== Library Menu =====");
	            System.out.println("1. Add new Book");
	            System.out.println("2. Display Books");
	            System.out.println("3. Issue Book");
	            System.out.println("4. Return Book");
	            System.out.println("5. Exit");
	 
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                 
	            case 1:
                    //ID integer , title string   author string    
            	System.out.println("Enter  Book ID  Title  author ");
            	 int id=sc.nextInt();
            	 sc.nextLine();
            	 String title=sc.nextLine();
            	 String author =sc.nextLine();
            	 
    	        lib.addBook(new Book(id ,title,author));
    	       
            	
            	break;
	               
	                case 2:
	                	System.out.println("BookID   Title    Author    statusIssued ");
	                    lib.displayBooks();//here displya book details 
	                    break;
	                case 3:
	                    System.out.print("Enter Book ID to issue: ");
	                    int idToIssue = sc.nextInt();
	                    lib.issueBook(idToIssue);
	                    break;
	                case 4:
	                    System.out.print("Enter Book ID to return: ");
	                    int idToReturn = sc.nextInt();
	                    lib.returnBook(idToReturn);
	                    break;
	                case 5:
	                    System.out.println("Exiting system.");
	                    break;
	                    
	               
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 5);

	       
	    
	

		
		
		

	}

}
