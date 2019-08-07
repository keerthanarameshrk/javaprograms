package A;

public class Calcu {
	String brand="casio";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu c=new Calcu();
		Stude s=new Stude();
		s.name="keer";
		s.yr=1009;
		s.dep="mca";
		c.publishResult(s);
		long result=c.add();
		System.out.println("result is "+result);
		c.caclculateAvg(result);
		

	}

	private void publishResult(Stude s) {
		// TODO Auto-generated method stub
		
		
	}

	private void caclculateAvg(long r) {
		// TODO Auto-generated method stub
		System.out.println(r/2);
	}

	private long add() {
		// TODO Auto-generated method stub
		int n1=10,n2=20;
		int tot=n1+n2;
		System.out.println(tot);
		return tot;
		
	}

}
