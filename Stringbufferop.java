package guesstheoutput;

public class Stringbufferop {

	public void foo(String s)
	{
		System.out.println("String");
	}
	public void foo(StringBuffer sb)
	{
		System.out.print("Stringbuffer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stringbufferop().foo(null);

	}

}
