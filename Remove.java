class Remove
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j++)
          {
            if(arr[i]==arr[j+1])
            {
                arr[i]=" ";
            }
          }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=" ")
            System.out.println(arr[i]);
        }
    }
}
        
        
        
        
