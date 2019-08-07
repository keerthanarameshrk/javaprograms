package A;

public class Calculator {
	  static String brand="casio";//field-> scope of variable //instance variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Calculator calc=new Calculator();
		calc.add();//method calling statement
	}
	private void add() //method signature
	{
		// TODO Auto-generated method stub
		// method body or method definition
		String brand="abc";//local variable
		Calculator cal=new Calculator();
		System.out.println(this.brand);
		System.out.println(brand);
		
	}
}
