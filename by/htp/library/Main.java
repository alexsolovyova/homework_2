package by.htp.library;

public class Main {	

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setPrice(15.3);
		book.setTitle("First Book");
		//book.price = 15.3;
		
		Book book2 = new Book(18.6, "Second book");
		System.out.println("Book1: price= " + book.getPrice() + " title= " + book.getTitle());
		
		System.out.println("Book2: price= " + book2.getPrice() + " title= " + book2.getTitle());
		Magazine magazine = new Magazine(2, "Cool magazine");
		magazine.setPrice(10);
		magazine.setTitle("Cool magazine");
		//magazine.price = 14.2;
		
		PrintedEdition pe = new Book();
		Object obj = new Book();
		
		
	}

}
