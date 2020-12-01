/**  Author name : ANUSHA R
     date: 29/10/2020
     desc: testing compliation and running inheritance extending Video from MediaItem
*/
package com.cg.library;

public class Video extends MediaItem {
     private String director;
     private int release_year;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
		
		public void getDetails()
	    {
	    	super.getDetails();
	    	System.out.println("Enter the director name");
	    	setDirector(sc.next());
	    	System.out.println("Enter the release year:");
	    	 setRelease_year(sc.nextInt());
	    }
	    public void displayDetails() {
	    	super.displayDetails();
	    	System.out.println("Director Name: "+getDirector());
	    	System.out.println("Release year: "+getRelease_year());
	    	setTotal_copies(100);
			 AvailableCopies();
	    }
}