import  java.util.*;
class lab1
{
public static void main(String args[])
{
int a,b,c;
double r1,r2,d;
Scanner S=new Scanner(System.in);
System.out.println("enter a value");
a=S.nextInt();
System.out.println("enter b value");
b=S.nextInt();
System.out.println("enter c value");
c=S.nextInt();
System.out.println("given quadratic eg is:"+a+"x^2"+"x+"+c);
d=b*b-4*a*c;
if(d>0)
{
System.out.println("roots are real and unequal");
r1=(-b+math.sqrt(d))/(2*a);
r2=(-b-math.sqrt(d))/(2*a);
System.out.println("first root is"+r1);
System.out.println("second root is"+r2);
}
else if(d==0)
{
System.out.println("roots are real and equal");
r1=(-b+math.sqrt(d))/(2*a);
System.out.println("root is"+r1);
}
else
{
System.out.println("roots are imaginary");
}
}
} 
