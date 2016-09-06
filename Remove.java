class Remove
{
    public static void main(String args[])
    {
       Scanner s= new Scanner(System.in);
	String str = s.next();	
	char[] arr = str.toCharArray();
	for(int i =0 ;i < arr.length;i++){
		for(int j =0;j<arr.length;j++){
			if(i!=j && arr[i] == arr[j]){
				arr[j] = ' ';
			}
		}
	}
	for(int i = 0;i<arr.length;i++){
		if(arr[i]!=' ')
			System.out.print(arr[i]);
	}
    }
}
        
        
        
        
