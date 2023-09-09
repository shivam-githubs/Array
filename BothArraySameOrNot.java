package Arrays;

public class BothArraySameOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40};
		int arr2[]= {10,20,20,40};
		boolean a1= true;
		for(int a=0; a<arr1.length; a++)
		{
			if(arr1[a]!=arr2[a])
			{
				a1 =false;
			}
		}
		if(a1== true)
		{
			System.out.println("same");
		}
		else
			System.out.println("Not");
	}

}
