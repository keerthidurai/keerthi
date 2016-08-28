class Reverse
{
public static void main(String args[])
{
   String reverse="";
   Scanner s=new Scanner(System.in);
   String str=s.nextLine();
   int n=str.length();
   for(int i=n-1;i>=0;i--)
   {
      reverse=reverse+str.charAt(i);
   }
   System.out.println(reverse);
  
}
}
