class Upper
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str="";
    str=s.nextLine();
    String[] str1=str.split(" ");
    int n=str1.length;
    for(int i=0;i<n;i++)
    {
      char a[]=str1[i].toCharArray();
    	String str2=new StringBuilder(str1[i]).reverse().toString();
      char b[]=str2.toCharArray();
      for(int j=0;j<1;j++)
    	{
    		if(Character.isLowerCase(a[j]))
    		{
    			b[j]=Character.toUpperCase(b[j]);
    		}
    		else
    			b[j]=Character.toLowerCase(b[j]);
    	   	System.out.print(b[j]);
    	}
    	System.out.print(" ");
    }
  }
}
