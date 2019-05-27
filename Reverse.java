class Reverse
{
public static void main(String args[])
{
int b=0,a=368;
b=b+(a%10);
b=b*10;
a=a/10;
b=b+(a%10);
b=b*10;
a=a/10;
b=b+(a%10);
System.out.println(b);
}}