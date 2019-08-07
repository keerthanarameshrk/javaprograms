package test;
 public class pay implements A,B{
int x=10;
	/**
	 * @param args
	 */
public void play()
{
	System.out.println("play");
	
}
	public void day()
	{
		System.out.println("daytime");
		
	}
	public void nigh()
	{
		System.out.println("night time");
	}
	public static void main(String args[])
	{
		pay p=new pay();
		p.play();
		p.day();
		p.nigh();
		//System.out.println(A.x);
		//System.out.println(B.x);
System.out.println(p.x);		}
}

