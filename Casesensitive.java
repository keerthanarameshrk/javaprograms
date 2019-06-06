import java.util.Scanner;
class Casesensitive
{
public static void main(String args[])
{
char alpha;
int num;
Scanner sc=new Scanner(System.in);
alpha=sc.next().charAt(0);
num=sc.nextInt();
if(alpha==alpha)
System.out.println("Upper case");
else
System.out.println("Lower case");
if(num==num)
System.out.println("number");
else
System.out.println("spl case");
}}