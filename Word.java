class Word
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String st=str.split(" ");
    for(int i=st.length-1;i>=0;i++)
    {
      String string+=st[i]+" ";
    }
    System.out.println("Reverse string"+string);
  }
}
    
