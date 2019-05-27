//swapping of 4 variables
import java.util.Scanner;
class Swapping
{
public static void main(String Args[])
{
int n1,n2,n3,n4,temp;
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
n4=sc.nextInt();
System.out.println("before Swapping "+n1+" "+n2+" "+n3+" "+n4);
temp=n1;
n1=n2;
n2=n3;
n3=n4;
n4=temp;
System.out.println("after Swapping "+n1+" "+n2+" "+n3+" "+n4);		
}}