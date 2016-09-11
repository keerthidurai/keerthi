class Notwo
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int count=0;
    int[] no=new int[n];
    for(int i=0;i<n;i++)
    {
      no[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(no[i]==2)
      {
        count++;
      }
    }
    System.out.println("No of 2's"+count);
  }
}
    
