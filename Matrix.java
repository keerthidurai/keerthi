import java.util.Scanner;
public class matrix 
{
public static void main(String[] args) 
{
			Scanner in = new Scanner(System.in);
			int array[][];
			int sum = 0;
			System.out.println("Enter the Number of Rows");
			int r = in.nextInt();
			System.out.println("Enter the Number of Columns");
			int c = in.nextInt();
			if (r == c) 
			{
				array = new int[r][c];
				for (int i = 0; i < r; i++)
				{
					for (int j = 0; j < c; j++)
					{
						array[i][j] = in.nextInt();
					}
				}
				for (int i = 1; i < r - 1; i++) 
				{
					for (int j = 1; j < c - 1; j++) 
					{
						sum += array[i][j];
					}
				}
				System.out.println("The Middle Sum is : " + sum);
			} else
			  {
			  	System.out.println("Enter Same number of Rows and Columns");
	      }
	}

}
