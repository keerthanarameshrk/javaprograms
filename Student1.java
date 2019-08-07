package A;

public class Student1 {
String name,dep;
int yr;
	public Student1(String string, String string2, int i) {
	// TODO Auto-generated constructor stub
		// System.out.println("hi");
		name=string;
		dep=string2;
		yr=i;
}
	/**
	 * @param args
	 */
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student1 s1=new Student1("abc","xyz",10);
			Student1 s2=new Student1("jkl","ihg",20);
			//Student1 s3=new Student1();
			System.out.println(s1.name+" "+ s2.name);
	}

}
