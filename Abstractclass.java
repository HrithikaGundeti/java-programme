abstract class nothing
{
	public int sqr(int a)
	{
		return (a*a);
	}
}

public class Abstractclass extends nothing {
	public static void main(String args[]){
		Abstractclass ob1 = new Abstractclass();
		System.out.println("square of the number is");
		System.out.println(ob1.sqr(8));
}}