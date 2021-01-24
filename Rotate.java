
public class Rotate {
	 void leftRotate(int arr[],int d,int n)
	{
		int temp[]=new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++)
		{
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++)
		{
			arr[i+n-d]=temp[i];
		}
	}
	static void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5};
		Rotate r=new Rotate();
		r.leftRotate(arr,2,arr.length);
		printArray(arr,arr.length);
		
	}

}
