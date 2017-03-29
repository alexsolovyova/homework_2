package by.htp.library.homeTask;

public abstract class PrintedEdition {

	private double price; 
	private String title;	
	private String type;
	
	public PrintedEdition(String type, double newPrice, String title) {
		this.price = newPrice;
		this.title = title;
		this.type = type;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
