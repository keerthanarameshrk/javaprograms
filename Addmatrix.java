import java.util.Scanner;

public class Addmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,cols;
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		cols=sc.nextInt();
		int arr[][]=new int[row][cols];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();	
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		int i=0,sum = 0;
		try{
		while(i<=row)
		{
			for(int j=0;j<=cols;j++)
			{
				
				if(j!=cols-1)
				{
    					sum=arr[i][j]+arr[i][j+1];
    					System.out.print(sum+" ");
    					
			   }
				else if(j==cols-1)
				{
					int k=0;
				  sum=arr[i][j]+arr[i+1][k];
				  System.out.print(sum+" ");
				  //i++;
				}
			}
			i++;}}
		catch(Exception e)
		{
			
		}
//		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//		
//		System.out.print(arr[0][0]+arr[0][1]);
//		System.out.print(arr[0][1]+arr[0][2]);
//		System.out.println(arr[0][2]+arr[1][0]);
//		
//		System.out.print(arr[1][0]+arr[1][1]);
//		System.out.print(arr[1][1]+arr[1][2]);
//		System.out.println(arr[1][2]+arr[2][0]);
//		System.out.print(arr[2][0]+arr[2][1]);
//		
			
		}}
//		for(int k=0;k<row;k++)
//		{
//			for(int j=0;j<cols;j++)
//			{
//				System.out.print(arr[i][j]);
//			}
//			System.out.print("\n");
//		}
	


