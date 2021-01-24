
public class Palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=545,n1,temp;
		int sum=0;
		temp=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
			
		}
		if(temp==sum)
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print("not palindrome");
		}

	}

}
