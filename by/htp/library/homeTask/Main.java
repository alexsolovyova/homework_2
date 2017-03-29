package by.htp.library.homeTask;

public class Main {	

	public static void main(String[] args) {
		
		Library libr = new Library(); 
		libr.addPrintEdition(new Book("book", 3.4, "Book1")); 
		libr.addPrintEdition(new Magazine("magazine", 1.2, "Mag1"));
		libr.addPrintEdition(new Book("book", 3.7, "Book2"));
		libr.addPrintEdition(new Magazine("magazine", 2.4, "Mag2"));
		//...
		
		for (int i = 0; i < libr.getList().size(); i++) { 
			libr.display(i);
		}
		
		System.out.println("\nNumber of publications: " + libr.getList().size());
	}
}
