public class Powereg 
{
	public static void main(String args[])
	{
		int n=1,exp=1,b=1,res=1;
		
			while(exp!=0)
			{
				res=res*b;
				exp--;
				
				if(exp==0)
				{
					b++;
					exp=b;n++;
					if(n>5) break;
					
					System.out.println(res);
				}
			
			
			}
			
					
	}
}
