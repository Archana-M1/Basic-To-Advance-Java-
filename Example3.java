package BasicExample;
import java.util.Scanner;
public class Example3 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int r=sc.nextInt();
		for(int i=r;i>=1;i--) 
		{
			for(int j=i-1;j<r;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				System.out.print("");
			}
				System.out.println();	
		}		
	}
}
