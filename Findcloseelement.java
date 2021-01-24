
public class Findcloseelement {
	public static  int closeElement(int arr[],int target)
	{
		int n=arr.length;
		if(target<=arr[0])
			return arr[0];
		if(target>=arr[n-1])
			return arr[n-1];
//		int i=0,j=n,mid=0;
//		while(i<j)
//		{
//			mid=(i+j)/2;
//		}
		int mid=arr.length/2;
		if(arr[mid]==target)
		{
			return arr[mid];
		}
		if(target<arr[mid])
		{
			if(mid>0 && target>arr[mid-1])
			{
				return getClose(arr[mid-1],arr[mid],target);
				
			}
			//int j=mid;
		}
			else{
				if(mid<n-1 && target<arr[mid+1])
					return getClose(arr[mid],arr[mid+1],target);
				//int i=mid+1;
			}
		
		return arr[mid];
	}
	public static int getClose(int v1,int v2,int target)
	{
		if(target-v1>=v2-target)
			return v2;
		else
			return v1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,67,43,80};
		int target=10;
		System.out.print(closeElement(arr,target));

	}

}
