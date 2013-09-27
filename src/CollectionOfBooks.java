/**
 * This class will do all the ordering and have the methods for finding books.
 * @author Kebre
 */
import java.io.FileInputStream;
import java.io.*;
import java.util.ArrayList;

public class CollectionOfBooks {

	private ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book){
		
	}
	public void serializeToFile(String filename) throws IOException {
		
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(
			new FileOutputStream(filename));
			out.writeObject(books);
		}
		finally {
			try {
				if(out != null)	out.close();
			} catch(Exception e) {}
		}
	}
	public void deSerializeFromFile(String filename) throws IOException, ClassNotFoundException {
		
		ObjectInputStream in = null;
		
		try {
			in = new ObjectInputStream(
			new FileInputStream(filename));
			// readObject returns a reference of type Object, hence the down-cast
			books = (ArrayList<Book>) in.readObject(); 
		}
		finally {
			try {
				if(in != null)	in.close();
			} catch(Exception e) {}			
		}
	}
}
