//factorial 
import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
long fact=1,n,i;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
for(n=1;n<=i;++n)
{
fact=fact*n;}
System.out.println("the factorial is "+fact);
}}