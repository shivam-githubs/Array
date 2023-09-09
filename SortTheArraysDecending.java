package Arrays;

public class SortTheArraysDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,70,35,78,25};
		for(int i = 0;i<arr.length-1; i++)
		{
			for(int j=i; j<arr.length; j++ )
			{
				if(arr[i]<=arr[j])
				{
					int temp = arr[i];
					arr[i] =arr[j];
					arr[j]=temp;
				}
			}
		}for(int a : arr)
		{
			System.out.println(a);
		}
	 		
	}

}

