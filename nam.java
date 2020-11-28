package sort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class nam {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		//System.out.println("HI");
		Scanner sc=new Scanner(System.in);
		StringBuilder file=new StringBuilder();
		FileReader fr=new FileReader("F:\\file.html");
		List<String> li=new ArrayList<String>();
		try(BufferedReader br=new BufferedReader(fr))
		{
			li=br.lines().collect(Collectors.toList());
		    //String val;
			//while((val=br.readLine())!=null)
			/*{
				file.append(val);
			}
			br.close();*/
			//System.out.println(li.subList(1, 4));
			//String res=file.toString();
			//System.out.println(res);
			//System.out.print("enter char");
			String input=sc.nextLine();	
			
			if(input.equals("1") ||input.equals("parent1"))
			{
				System.out.print(li.subList(1, 2).toString());
				System.out.print(li.subList(7, 8).toString());
		    }
			if(input.equals("2") ||input.equals("parent2"))
			{
				System.out.print(li.subList(3, 6).toString());
			}
			if(input.equals("8") ||input.equals("parent3"))
			{
				System.out.print(li.subList(8, 11).toString());
			}
			if(input.equals("11") ||input.equals("child33"))
			{
				System.out.print(li.subList(11, 12).toString());
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
		
	}

}
