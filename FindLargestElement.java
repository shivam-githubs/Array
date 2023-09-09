package Arrays;

public class FindLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,26,35};
		int la = arr[0];
		for(int i =0 ; i<arr.length; i++)
		{
				if(la <= arr[i])
				{
					la = arr[i];
				}
		}System.out.println(la);
	}

}
