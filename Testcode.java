package C;

public class Testcode {
	 
	static void div()throws Exception
	{
		int a=10;
		 int b=0;
		 
		try
		{
			System.out.println(a/b);
			
	    }
	
	catch(ArithmeticException e)
	{
		throw e;
	}
	}
	static void stringtonumber()throws Exception
	{
		String s="java";
		try
		{
			System.out.println(s.charAt(7));
			
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	public static void main(String args[]) throws Exception
	{
		try
		{
			div();
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero excpetion");
		}
		try
		{
			stringtonumber();
		}
		catch(Exception ex)
		{
			System.out.println("String index out of bound");
		}
	}

}
