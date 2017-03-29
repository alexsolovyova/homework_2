package by.htp.library;

public class Book extends PrintedEdition{

	/*public Book(double price, String title) {
		this.setPrice(price);
		this.setTitle(title);		
	}*/
	
	public Book() {
		super();//обращ. к констрк. PrintedEdition
	}
	
	public Book(double price, String title) {
		super(price, title);				
	}
	
}
