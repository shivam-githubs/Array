package Arrays;

public class FindTheCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"shivam", "harshal", "Sabaat", "Prajyot"};
		String arr1[]= {"bishal", "shivam","harshal"};
		
		for(int i=0; i<arr1.length;i++)
		{
			for(int j=0; j<arr.length; j++)
			{
			if(arr1[i]==arr[j]);
			{
				System.out.println(arr1[j]);
			}
			}
		}
	}

}
