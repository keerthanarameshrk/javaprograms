package p4;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class InnerTest
		{
			public String name;
			public InnerTest(String s)
			{
				name=s;
			}
		}
		Object obj=new InnerTest("Innertest");
		InnerTest t=(InnerTest)obj;
		System.out.print(t.name);

	}

}
