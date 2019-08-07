class Work
{
int day;
void disp(int day)
{
this.day=day++;
}
int get()
{
return day;
}
public static void main(String args[])
{
Work mon=new Work();
mon.disp(5);
mon.day=mon.get();
System.out.println(mon.day);
}}