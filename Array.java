class Array
{
    publis ststic void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the no to entered");
      int n=s.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      Arrays.sort(a);
      for(int i=0;i<n;i++)
      {
          if(a[i]==a[i+1])
          {
            continue;
          }
          else
          {
            System.out.println("unique number"+a[i]);
          }
      }
    }
  }
      
      
      
