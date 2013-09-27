import java.util.Scanner;

/**
 * This class should be the class to communicate with the user
 * 
 * @author Kebre
 *
 */

public class UserInterface {
	private Scanner scan;
	
	public void menu(){
		
	}
	
	public void addBook(){
		
	}
	public void getBooksByTitle(String title){
		
	}
	public void printMenu(){
		System.out.println("...::: Program Books:::...");
		System.out.println("1. Add book");
		System.out.println("2. Remove book");
		System.out.println("3. Search for book");
		System.out.println("4. Exit.");
	}
	public void run(){
		int val = 0;
		
		while(val != 4){
			printMenu();
			val = scan.nextInt();
			switch(val){
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			}
		}
	}
	
	public static void main(String args[]){
		
	}

}
