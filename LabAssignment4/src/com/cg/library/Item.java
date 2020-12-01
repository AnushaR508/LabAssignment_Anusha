/**  Author name : ANUSHA R
     date: 29/10/2020
     desc: testing compliation and running abstract class
*/
package com.cg.library;

public abstract class Item {
	private long id;
	private String title;
	private int number_of_copies;
	private int total_copies;

	public int getTotal_copies() {
		return total_copies;
	}

	public void setTotal_copies(int total_copies) {
		this.total_copies = total_copies;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumber_of_copies() {
		return number_of_copies;
	}
	public void setNumber_of_copies(int number_of_copies) {
		this.number_of_copies = number_of_copies;
	}
	public abstract void getDetails();
	public abstract void displayDetails();
	public abstract void AvailableCopies();
	
}