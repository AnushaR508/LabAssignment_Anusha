/**  Author name : ANUSHA R

     date: 23/10/2020
     desc: testing compliation and running to display number of lines and characters in a text 
*/


import java.util.*;

public class DisplayText {

	public static void main(String[] args) {
		System.out.println("Enter the text");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		int countWord=0;
		int countLines=0;
		int countCharacter=0;
		String[] listWord=text.split("\\s+");
		countWord+=listWord.length;
		String[] LineList=text.split("[!?.:]+");
		countLines+=LineList.length;
	    countCharacter+=text.length();
	    System.out.println("Number of words:"+countWord+"\nNumber of Lines:"+ countLines+"\nNumber of  characters:"+countCharacter);			
	}
}