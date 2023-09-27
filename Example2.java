package BasicExample;
import java.util.Scanner;
public class Example2 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of rows and col");
	int row=sc.nextInt();
	int col=sc.nextInt();
	for(int i=0;i<=row;i++)
	{
		for(int j=0;j<=col;j++)
		{
			if(i<j )
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("");
			}
		}
		System.out.println();
	}
  }
}


/*
 		*
 		**
 		***
 		****
 		*****
 		
in case we change the condition in if statement as i<j then the same program converted into another one example that is of below pattern
		*****
		****
		***
		**
		*

Method-2:

for(int i=1;i<=r;i++)
		{
			for(int j=i-1;j<c;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
*****
****
***
**
*



 */
