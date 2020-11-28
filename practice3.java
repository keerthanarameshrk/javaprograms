package practice3;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int c[]={1};
			System.out.print(c.length);
			c[1]=142;
			System.out.print("c="+c[1]);
			int a=args.length;
			System.out.print("a="+a);
			//int b=8/a;
		}
		catch(ArithmeticException e)
		{
			System.out.print("divide by 0:"+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Array index oob:"+e);
			
		}
		System.out.print("After try/catch block");
	}

}
