class Encrypt
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length()-1;i++)
		{
			char d=str.charAt(i);
			 if(d=='a')
			{
				sb.append('z');
			}
			else
			{
			int e=d-1;
			sb.append((char)e);
			}
			
		}
		sb.append(str.charAt(str.length()-1));
		System.out.println(sb.toString());
		
	}

}
