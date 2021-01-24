
public class Vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "find vowels";
		int vowelCount=0,consonent = 0;
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		    {
		        vowelCount++;
		    }
		    else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
		    {
		        consonent++;
		    }
		}
		System.out.println("number of vowels "+vowelCount);
		System.out.println("number of consonent "+consonent);
	}

}
