package Arrays;

public class CheckValuePresentOrNot {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int a=40;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==a)
			{
				System.out.println("Its present is "+(i+1)+"Location");
			}
		}
	}

}
