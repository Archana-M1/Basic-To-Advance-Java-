package BasicExample;

//Java Program to Print the Right Arrow Star Pattern 
import java.util.Scanner;
public class Example4
{
    public static void main(String[] args)
    {
        //Take input from the user
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	    int n=sc.nextInt();	
	    for(int i=0;i<n;i++)
        {
	        for(int j=0;j<n;j++)
            {
                if(j<i)
                System.out.print("  ");
		        else
                System.out.print("*");
            }
	        System.out.println();
        }            
        for(int i=2;i<=n;i++)
        {
	        for(int j=0;j<n;j++)
            {
                if(j<n-i)
                System.out.print("  ");
		        else
                System.out.print("*");
            }
	        System.out.println();
        }
    }
}
