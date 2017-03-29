package by.htp.library;

public abstract class PrintedEdition {
	//���� ������
	private double price; 
	private String title;
	
	public PrintedEdition() {
		super();//���������� � ������. ������ Object
	}
	
	public PrintedEdition(double newPrice, String title) {
		this.price = newPrice;
		this.title = title;
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
