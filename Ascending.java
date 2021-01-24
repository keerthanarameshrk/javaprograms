
public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,8,21,5,16};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int k=i+1;k<a.length;k++)
			{
				if(a[i]>a[k])
				{
					temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
