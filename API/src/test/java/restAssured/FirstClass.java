package restAssured;

import org.testng.annotations.Test;

public class FirstClass{

	/**
	 * @deprecated Use {@link #test(Object)} instead
	 */
	@Test
	public void test23()
	{
		test("this is main test");
	}

	public String test(String newParam) {
	// TODO Auto-generated method stub
	System.out.println("AMAR");
	return newParam;
}

}

