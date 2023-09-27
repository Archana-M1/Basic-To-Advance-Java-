package BasicExample;
import java.util.Scanner;

public class Example1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sc.nextInt();
		System.out.println("enter number of columns");
		int columns=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}
/* 
 	 *  *  *  *  * 
 	 *  *  *  *  * 
 	 *  *  *  *  * 
 	 *  *  *  *  * 
 	 *  *  *  *  *   
 */