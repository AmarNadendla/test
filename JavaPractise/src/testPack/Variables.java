package testPack;

public class Variables {

	int a = 10;
	int b = 20;
static int c = 30;
static int d = 40;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables t = new Variables();
		
		Variables.m2();
		
	}
	
	void m1()
	{
		System.out.println(a);
		System.out.println(c);
	}
	
	static void m2()
	{
	Variables t = new Variables();
	System.out.println(t.a);
	System.out.println(c);
		
	}

}
