import java.util.Scanner;
class Test
{
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	int n=0,target=0;
	n=s.nextInt();
	System.out.println("enter the target");
	target=s.nextInt();
	int[] arr=new int[n];
	for(int i =0 ;i < n;i++)
	{
		arr[i]=s.nextInt();
	}	
	for(int i =0 ;i <n;i++)
	{
		for(int j =i+1;j<n;j++)
		{
			if(target==(arr[i]+arr[j]))
			{
				
			System.out.print(arr[i]+""+arr[j]);
			}
		}
	}
}
}
