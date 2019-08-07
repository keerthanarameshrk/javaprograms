package A;
import java.util.*;

import org.omg.CORBA.Object;

public class Arrayprgm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//System.out.print("enter the number");
		//int n1=s.nextInt();
		System.out.println("enter the String");
		String n=s.nextLine();
		String q="q";
		String array[]=new String[5];
		for(int arr=0;arr<=5;arr++)
		{
		if(n==q)
		{
			break; 
		}
		System.out.println(n);
		}
	}

}
