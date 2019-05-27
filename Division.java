//find the given number is divisible by 3,5
import java.util.Scanner;
class Division
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a%3==0)
{
System.out.println(a+" is divisible by 3");
if(a%5==0)
{
System.out.println(a+" is divisible by 5");
}}
else
{
System.out.println(a+" is not divisible by 3 and 5");
}}}