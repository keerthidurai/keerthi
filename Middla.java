import java.util.*;
class Midle
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sum=0;
    int[][] arr=new int[n][n];
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		arr[i][j]=s.nextInt();
    		if(i==j)
    		{
    			sum=sum+arr[i][j];
    		}
    	}
    }
    System.out.print(sum);
  }
}
