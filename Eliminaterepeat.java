
public class Eliminaterepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="keerthana";
		String s2="arvindh";
		char[] ch1=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		//String s3=s1+s2;
		for(int i=0;i<ch1.length;i++)
		{
			boolean bmatch=false;
			for(int j=0;j<ch2.length;j++)
			{
				if((String.valueOf(ch1[i]).toLowerCase().equals((String.valueOf(ch2[j]).toLowerCase()))))
				{
					bmatch=true;
					break;
				}
			}
			if(bmatch)
			{
				s1=s1.replaceAll(String.valueOf(ch1[i]).toUpperCase(), " ");
				s1=s1.replaceAll(String.valueOf(ch1[i]).toLowerCase(), " ");
				s2=s2.replaceAll(String.valueOf(ch1[i]).toUpperCase(), " ");
				s2=s2.replaceAll(String.valueOf(ch1[i]).toLowerCase(), " ");
				
			}
		}
		System.out.println(s1+""+s2);
	}

}
