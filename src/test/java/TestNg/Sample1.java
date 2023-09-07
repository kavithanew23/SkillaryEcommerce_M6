package TestNg;

import org.testng.annotations.*;

public class Sample1 {
		
	@Test
	public void demo1() {
		System.out.println("Hi Demo1");
	
			}
	@Test(groups="smoke")
	public void demo2() {
		System.out.println("Hi Demo2");
	
			}


}
