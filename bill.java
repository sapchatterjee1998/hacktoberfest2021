import java.util.*;
public class bill{

public static void main (String [] args)
{

double unit,domes,indst,total;

System.out.println("Enter the no of units consumed");
Scanner sc=new Scanner(System.in);
unit=sc.nextDouble();

domes=unit-50;
indst=unit-100;

{
double totald,totali,extd,exti;
int type;
System.out.println("enter that type of connection you have press 0 If domestic press 1 if Industrial");

type=sc.nextInt();


if(type==0)
{

totald=250+(domes*5);
System.out.println("Your ammount"+totald);

if(totald>2000)
{
extd=totald+((totald-2000)*0.05);
System.out.println("the total bill of your Domestic connection is:"+extd);
}
}
else if(type==1)
{

totali=500+(indst*10);
System.out.println("Your ammount"+totali);

if(totali>10000)
{
exti=totald+((totald-10000)*0.10);
System.out.println("the total bill of your Domestic connection is:"+exti);
}
}


else
{
System.out.println("INVAILD TYPE CHOOSE");
}


}
}
}