package test;

import org.testng.annotations.Test;

import main.BasePage;
import main.HomePage;
import main.SecondHomePage;

public class HomePageTest extends BasePage {
	HomePage homepage;
	SecondHomePage secondhomepage;
	
	public HomePageTest()
	{
		super();
		homepage=new HomePage();
		secondhomepage=new SecondHomePage();
	}
	
	@Test
	public void test1() /*throws InterruptedException*/
	{
		//Thread.sleep(10000);
		homepage.fortypeofcustomer();
		//Thread.sleep(20000);
		homepage.fortypeoffixeddeposit();
		//Thread.sleep(20000);
		homepage.foramountofdeposit1();
		//Thread.sleep(20000);
		homepage.foramountofdeposit("20000");
		//Thread.sleep(20000);
		homepage.forselectdays();
		//Thread.sleep(20000);
		homepage.forcleardaysbox("500");
		//Thread.sleep(20000);
		homepage.forselectdays();
		//Thread.sleep(20000);
		homepage.forcleardaysbox1();
		//Thread.sleep(20000);
		homepage.forcleardaysbox("500");
	
	}

}
