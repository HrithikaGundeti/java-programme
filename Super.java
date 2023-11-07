class parent
{
	public void method(){
		System.out.println("Did you complete your work?");
		//super.method();
		}
}
class child extends parent{

	 public void method() {
		System.out.println("I completed my work");
		super.method();
		}

 	 void printmessage(){
		method();
	}
}
public class Super{
	public static void main(String args[])
	{
	child ob1=new child();
	ob1.method();
	}
}