import java.util.Arrays;

public class Sortedmatrix {
	//aint size=10;
	static void printMat(int mat[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	static void sortMat(int mat[][],int n)
	{
		int temp[]=new int[n*n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[k++]=mat[i][j];
				
			}
		}
		Arrays.sort(temp);
		k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=temp[k++];
			}
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]={{5,4,3},{2,5,4},{1,7,8}};
		int n=3;
		System.out.println("original matrix");
		//int mat[][] = null;
		printMat(mat,n);
		sortMat(mat,n);
		System.out.println("after sort");
		printMat(mat,n);
	}
	}
