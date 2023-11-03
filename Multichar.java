package javaprograms225f8;

public class Multichar {

	public static void main(String[] args) 
	{
		String s1="this is the last hour";
		char[] ch=new char [16];
		s1.getChars(1,15,ch,0);
		System.out.println(ch);
	}

}
