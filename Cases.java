//dispaly the number,letter,spl cases.
import java.util.Scanner;
class Cases
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
ch=sc.next().charAt(0);
if((ch>=65)&&(ch<=90))
System.out.println("Upper case");
else if((ch>=48)&&(ch<=59))
System.out.println("number");
else if((ch<=97)&&(ch>=122))
System.out.println("Lower case");
else
System.out.println("special cases");
}}