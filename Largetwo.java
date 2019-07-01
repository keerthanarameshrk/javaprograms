//2nd largest number
class Largetwo
{
public static void main(String args[])
{
int n1=1,n2=2,n3=3,l=0,sl;
if(n1>n2 && n1>n3)
{
sl=n1;
l=n1;
System.out.println(sl);}
if(n2>n3){
sl=l;
l=n2;
System.out.println(sl);}
else{
sl=l;
l=n3;
System.out.println(sl);}
}}