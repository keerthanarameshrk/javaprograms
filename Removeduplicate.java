import java.util.Arrays;

public class Removeduplicate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,2,1,5};
		Arrays.sort(arr);
		int len=arr.length;
		len=removedupli(arr,len);
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	private static int removedupli(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1)
		{
		return n;	
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		return j;
	}
}
