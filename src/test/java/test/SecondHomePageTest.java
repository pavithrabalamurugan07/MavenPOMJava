package test;

import org.testng.annotations.Test;

import main.BasePage;
import main.HomePage;
import main.SecondHomePage;

public class SecondHomePageTest extends BasePage {
	
	HomePage homepage;
	SecondHomePage secondhomepage;
	
	public SecondHomePageTest()
	{
		homepage=new HomePage();
		secondhomepage=new SecondHomePage();
	}
	
	@Test
	public void test2()
	{
		//secondhomepage.forselectdays();
		//secondhomepage.forcleardaysbox("500");
		secondhomepage.formaturitydetails1();
		secondhomepage.formaturitydetails2();
		secondhomepage.formaturitydetails3();
		secondhomepage.formaturitydetails4();
		
	}

}
