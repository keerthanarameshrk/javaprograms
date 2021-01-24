import java.util.HashMap;
import java.util.Scanner;

public class Input2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Integer> hashmap=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!hashmap.containsKey(c))
			{
				int counter=0;
				for(int j=i;j<s.length();j++)
				{
					if(c==s.charAt(j))
					{
						counter++;
					}
				}
				if(counter>0)
				{
					hashmap.put(c, counter);
					
				}
			}
		}
		for(char c:hashmap.keySet())
		{
			System.out.print(c);
			System.out.print(hashmap.get(c));
		}
	}

}
