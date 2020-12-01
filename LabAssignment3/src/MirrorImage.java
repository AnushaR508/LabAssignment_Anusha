/**  Author name : ANUSHA R

     date: 23/10/2020
     desc: testing compliation and running to print mirror image of the string 
*/


import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String input=sc.next();
	    System.out.println(input+"|"+getImage(input));
	}
	    public static String getImage(String input) {
		StringBuffer sb=new StringBuffer(input);
	    String result=sb.reverse().toString();
		return result;
		

	}

}
