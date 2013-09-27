import java.awt.Menu;
import java.util.Scanner;

/**
 * This class should be the class to communicate with the user
 * 
 * @author KebreZ
 *
 */

public class UserInterface {
	private Scanner scan;
	
	public UserInterface(){
		scan = new Scanner(System.in);
	}
	public void addBook(){
		
	}
	public void removeBook(){
		
	}
	public void searchBook(){
		
	}
	public void getBooksByTitle(String title){
		
	}
	public void printMenu(){
		System.out.println("...::: Program Books:::...");
		System.out.println("1. Add book");
		System.out.println("2. Remove book");
		System.out.println("3. Search for book");
		System.out.println("4. Get book by title.");
		System.out.println("5. Exit");
		System.out.print("Val: ");
	}	
	public void menu(){	
		int val = 0;
		
		while(val != 5){
			printMenu();
			val = scan.nextInt();
			switch(val){
			case 1: addBook(); break;
			case 2: removeBook(); break;
			case 3: searchBook(); break;
			case 4: ; break;
			case 5:  System.out.println("Bye..");break;
			default: System.out.println("Unknown command..");
			}
		}
	}	


	
	public static void main(String args[]){
		UserInterface menu = new UserInterface();
		menu.menu();
	}

}
