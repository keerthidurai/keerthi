class Length
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String[] st=str.split(" ");
    if(st==null)
    System.out.println("no word");
    else
    System.out.println(st.length);

  }
}
