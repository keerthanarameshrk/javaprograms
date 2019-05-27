//character conversion from upper to lower and lower to upper
import java.io.*;
import java.util.Scanner;
class Strconvert
{
public static void main(String args[])
{
char upper,lower;
Scanner sc=new Scanner(System.in);
upper=sc.next().charAt(0);
lower=sc.next().charAt(0);
char ch1=Character.toLowerCase(upper);
char ch2=Character.toUpperCase(lower);
System.out.println(lower+"converted to"+ch2);
System.out.println(upper+"converted to"+ch1);
}
}