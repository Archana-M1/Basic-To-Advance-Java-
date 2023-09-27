package BasicExample;
import java.util.Scanner;
public class Example5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=sc.nextInt();
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<n;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("*");
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

when we change the i loop then we will get the output like
for(int i=0;i<n;i++)
*****
 ****
  ***
   **
    *

*/