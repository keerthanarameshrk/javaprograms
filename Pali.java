class Pali
{
public static void main(String args[])
{
int b=0,a=234,s=0,temp;
temp=a;
while(a>0)
{
b=a%10;
s=(s*10)+b;
a=a/10;
}
System.out.println(s);
if(temp==s)
System.out.println("pali");
else
System.out.println("not pali");
}}