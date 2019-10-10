package testPack;

public class Methods {

	public static void main(String[] args) {
		Methods x = new Methods();
		int i = x.m1();
		System.out.println("m1 method result:" + i);
		
		float f = x.m2();
		System.out.println("Method m2:" + f);
		
		char ch = Methods.m3();
		System.out.println("method m3:" +ch);

	}
	
	public int m1()
	{
		//System.out.println("method m1");
		
		return 10;
	}
	
	public float m2()
	{
		//System.out.println("Method m2");
		return 10.50f;
	}
	
	static char m3()
	{
		//System.out.println("Method m3");
		return 'c';
		
	}

}
