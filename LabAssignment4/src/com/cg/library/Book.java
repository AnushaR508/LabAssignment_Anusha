/**  Author name : ANUSHA R
     date: 29/10/2020
     desc: testing compliation and running inheritance extending writtenItem from Book
*/
package com.cg.library;

public class Book extends WrittenItem{
	public void getBook()
	{
	setTotal_copies(50);
	getDetails();
    displayDetails();
    AvailableCopies();
	}
}
