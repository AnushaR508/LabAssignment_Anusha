/**  Author name : ANUSHA R
     date: 23/10/2020
     desc: testing compliation and running to remove duplicates and sort integer array
*/


import java.util.Scanner;

public class DuplicateSort {

	static int k=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
	    int num[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	num[i]=sc.nextInt();
	    }
	    int res[]=modifyArray(num);
	    System.out.print("\n Sorted array ");
	    for(int i=0;i<k;i++)
		
	    System.out.print(res[i]+ " ");

		

	}
	public static int[] modifyArray(int num[])
	{     
		   int len=num.length;
		   int temp1;
		   int temp[]=new int[len];
	   	   for(int i=0;i<len;i++) //for sorting
	   	   {
	   		for(int l=i+1;l<len;l++)
	   		{
	   			if(num[i]<num[l])
	   			{
	   				temp1=num[i];
	   				num[i]=num[l];
	   				num[l]=temp1;
	   			}
	   		}
	   	  }
	   	   
	   	   for(int j=0;j<len-1;j++)//for removing duplicates
	   		   if(num[j]!=num[j+1])
	   			   temp[k++]=num[j];
	   	   
	   		   
	   	   temp[k++]=num[len-1];//for placing last element
	   	   return temp;
	 
	   	   }
	
	}


