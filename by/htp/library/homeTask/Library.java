package by.htp.library.homeTask;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<PrintedEdition> libraryList;	
	
	public Library() {
		libraryList = new ArrayList<PrintedEdition>();		
	}
	
	public void addPrintEdition(PrintedEdition pr) {
		libraryList.add(pr);		
	}		
	
	public ArrayList<PrintedEdition> getList() {
		return this.libraryList;
	}
		
	public void display(int num) {		
		System.out.println("Title: " + libraryList.get(num).getTitle() + " price: " + libraryList.get(num).getPrice());		
	}
}
