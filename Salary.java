class Salary
{
public static void main(String args[])
{
String days="fri";
int b=1000;
switch(days)
{
case "mon":
case "wed":
case "thur":
b=b*120/100;
System.out.println(b);
break;
case "tues":
case "fri":
b=b*110/100;
System.out.println(b);
break;
}}}