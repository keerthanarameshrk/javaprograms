package softsuave;

import java.util.Scanner;

public class soft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int cpy=n,d=0,sum=0;
		String s=Integer.toString(n);
		int l=s.length();
		while(cpy>0)
		{
			d=cpy%10;
			sum=sum+(int)Math.pow(d, l);
			l--;
			cpy=cpy/10;
			
		}
		if(sum==n)
		{
			System.out.println("gavl");
		}
		else
		{
			System.out.println("no");
		}
		
		
		

	}

}
