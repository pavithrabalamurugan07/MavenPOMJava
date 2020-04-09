package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SecondHomePage extends BasePage {
	
	
	
	public WebElement maturitydetails1()
	{
		return driver.findElement(By.xpath("//span[@id='spnRateOfInterest']"));
	}
	
	public WebElement maturitydetails2()
	{
		return driver.findElement(By.xpath("//span[@id='spnMaturityDate']"));
	}
	
	public WebElement maturitydetails3()
	{
		return driver.findElement(By.xpath("//span[@id='spnMaturityValue']"));
	}
	public WebElement maturitydetails4()
	{
		return driver.findElement(By.xpath("//span[@id='spnAIAmount']"));
	}
	
	//Actions
	
	public void formaturitydetails1()
	{
		String t1=maturitydetails1().getText();
		System.out.println(t1);
	}
	public void formaturitydetails2()
	{
		String t2=maturitydetails2().getText();
		System.out.println(t2);
	}
	public void formaturitydetails3()
	{
		String t3=maturitydetails3().getText();
		System.out.println(t3);
	}
	public void formaturitydetails4()
	{
		String t4=maturitydetails4().getText();
		System.out.println(t4);
	}

}
