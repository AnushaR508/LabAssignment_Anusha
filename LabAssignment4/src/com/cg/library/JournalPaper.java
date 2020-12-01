/**  Author name : ANUSHA R
     date: 29/10/2020
     desc: testing compliation and running inheritance extending JournalPaper from WrittenBook
*/
package com.cg.library;

public class JournalPaper extends WrittenItem{
  private int publish_year;

public int getPublish_year() {
	return publish_year;
}

public void setPublish_year(int publish_year) {
	this.publish_year = publish_year;
}

    public void getDetails()
    {
    	super.getDetails();
    	System.out.println("Enter the publish year:");
    	setPublish_year(sc.nextInt());
    }
    public void displayDetails() {
    	super.displayDetails();
    	System.out.println("Publish year:"+getPublish_year());
    	setTotal_copies(100);	
        AvailableCopies();
    	
    	
    }


}