class Sum
{
public static void main(String args[])
{
int a=368,b=0;
b=b+(a%10);
a=a/10;
b=b+(a%10);
a=a/10;
b=b+(a%10);
System.out.println(b);
}}