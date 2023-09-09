package Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		int arr1[]= {50,60,70};	
		int add= arr.length+arr1.length;
		int temp[]= new int[add];int k =0;
		for(int i =0 ; i<add; i++)
		{
			if(i<arr.length)
			{
				temp[i]=arr[i];
			}
			else
			{
				
				temp[i]=arr1[k];
				k++;
			}
		}
		for(int j : temp)
		{
			System.out.println(j);
		}
	}

}
