package winorlose;

import java.util.Arrays;
import java.util.Scanner;

class Winorlosecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of testcases");
		int numberOfTestCases=sc.nextInt();
		for(int i=0;i<numberOfTestCases;i++)
		{
			System.out.println("enter number");
			int number=sc.nextInt();
			//System.out.println(number+"is the number");
			int[] players_energy=new int[number];
			int[] villian_strength=new int[number];
			for(int k=0;k<villian_strength.length;k++)
			{
				System.out.println("please enter villian strength");
				villian_strength[k]=sc.nextInt();
			}
			for(int j=0;j<players_energy.length;j++)
			{
				System.out.println("please enter players energy");
				players_energy[j]=sc.nextInt();
			}
			Arrays.sort(players_energy);
			Arrays.sort(villian_strength);
			
			boolean result=true;
			for(int c=0;c<number;c++)
			{
				if(players_energy[c]>villian_strength[c])
				{
					result=true;
				}
				else
				{
					result=false;
				}
			}
			if(result)
			{
				System.out.println("win");
			}
			else
			{
				System.out.println("lose");
			}
		}

	}

}
