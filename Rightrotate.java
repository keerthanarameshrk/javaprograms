
public class Rightrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="keerthana";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
		char temp;
		for(int i=0;i<6;i++)
		{
			temp=c[0];
			c[0]=c[c.length-1];
			c[c.length-1]=temp;
			for(int j=1;j<c.length;j++)
			{
				temp=c[j];
				c[j]=c[c.length-1];
				c[c.length-1]=temp;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.print(c[i]);
		}
	}

}
