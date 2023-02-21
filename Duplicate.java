class Duplicate
{
	public static void main(String[] args)
	{
	int [] arr = new int [] {1, 2, 2, 4, 5, 6, 6, 8, 7, 9};
	System.out.println("Duplicate elements in given Array : ");
	for ( int i=0; i<arr.length; i++ )
	{
		for (int j = i+1; j<arr.length; j++)
		{
			if ( arr[i] == arr[j] )
			System.out.println(arr[j]);
	
		}
	}
	}
}