/**  Author name : ANUSHA R
     date: 23/10/2020
     desc: testing compliation and running to reverse and sort integer array
*/




import java.util.Scanner;

public class ReverseSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
	    int num[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	num[i]=sc.nextInt();
	    }
	    int res[]=getSorted(num);
	    System.out.print("\n Sorted array ");
	    for(int i=0;i<res.length;i++)
		
	    System.out.print(res[i]+ " ");

	     
	}
   public static int[] getSorted(int num[] )
   {
	   int len=num.length;
	   int[] temp=new int[len];
	   int j=len;
	   for(int i=0;i<len;i++)
	   {
		       temp[j-1]=num[i];
			   j=j-1;
		   
	   }
	   System.out.print("Reversed array ");
	   for(int k=0;k<num.length;k++)
	   System.out.print(temp[k]+" ");
	   int temp1;
   	   for(int i=0;i<len;i++)
   	   {
   		for(int l=i+1;l<len;l++)
   		{
   			if(temp[i]>temp[l])
   			{
   				temp1=temp[i];
   				temp[i]=temp[l];
   				temp[l]=temp1;
   			}
   		}
   	  }
   	   return temp;
	   
   }
}
