import java.util.*;

interface calculation
{
	public int sqr(int x);
	public int multiply(int x,int y);
}
class op implements calculation
{
	public int sqr(int a)
	{
		return a*a;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
}
public class Interface_operations
{
	public static void main(String args[])
	{
		op ob1 = new op();
		Scanner input= new Scanner(System.in);

		System.out.println("enter c");
		int c=input.nextInt();

		System.out.println("enter d");
		int d=input.nextInt();

		System.out.println(ob1.sqr(c));
		System.out.println(ob1.multiply(c,d));
		
		//input.close();
	}
}