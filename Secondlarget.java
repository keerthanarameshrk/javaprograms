
public class Secondlarget {
	static int temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={6,5,4,3,2,1};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("the 2nd largest number is:"+(arr.length-1));
	}

}
