package D;

public class Printng {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		Tree t=new Tree();
		Animals a=new Animals();
		t.start();
		t.join();
		t.sleep(1000);
		a.start();
		a.join();
		a.sleep(1000);
	
		
		System.out.println("tq");
		

	}

}
