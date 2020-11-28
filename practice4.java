package practice4;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=5,n=5;
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(n+1-i);
				j=j+1;
			}
			System.out.print("\n");
			i=i+1;
		}
	}

}
