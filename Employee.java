package test;

public class Employee {
	int empid;
	String name;
	float basic;
	void print()
	{
		float k=salary(10);
		System.out.println(k);
	}
	float salary(int day)
	{
		return basic*day;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(100,"ram",2000);
		e1.salary(5);
		e1.print();
	}
	Employee(int id,String n,float b)
	{
		empid=id;
		name=n;
		basic=b;
	}

}
