class Swap
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int temp=0;
	System.out.println("before swap");
	System.out.println(a+"and"+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swap");
	System.out.println(a+"and"+b);
}
}
