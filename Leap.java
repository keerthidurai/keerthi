import java.util.Scanner;

class Test
{
	
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	if(n%4==0 )
		System.out.println("it is leap year");
	else
		System.out.println("it is not a leap year");
	

}
}
