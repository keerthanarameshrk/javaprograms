
public class Secondlargeeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={20,12,43,22,26,76,54,89};
		int large=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				if(arr[i]>large)
				{
					second=large;
					large=arr[i];
				}
				else if(arr[i]>second)
				{
					second=arr[i];
				}
				
			}
			
		}
		System.out.println(second);
		
	}

}
