package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
	
	public WebElement typeofcustomer()
	{
		
		return driver.findElement(By.xpath("//input[@name='radioCust' and @value='3']"));
	}
	
	public WebElement typeoffixeddeposit()
	{
		
		return driver.findElement(By.xpath("//select[@id='ddlTypeOfFixedDeposit']"));
	}
	
	public WebElement amountofdeposit()
	{
		
		return driver.findElement(By.xpath("//input[@id='loanAmount']"));
	}
	public WebElement selectdays()
	{
		return driver.findElement(By.xpath("//input[@id='idDays']"));
	}	
	
	public WebElement cleardaysbox()
	{
		return driver.findElement(By.xpath("//input[@id='tenureDay']"));
	}
	
	//Actions
	public void fortypeofcustomer()
	{
		typeofcustomer().click();
	}
	
	public void fortypeoffixeddeposit()
	{
		Select select=new Select(typeoffixeddeposit());
		select.selectByIndex(2);
	}
	public void foramountofdeposit1()
	{
		amountofdeposit().clear();
	}
	
	public void foramountofdeposit(String a)
	{
		//amountofdeposit().click();
		//amountofdeposit().clear();
		amountofdeposit().sendKeys(a);
		robot();
	}
	public void forselectdays()
	{
		selectdays().click();
	}
	public void forcleardaysbox1()
	{
		cleardaysbox().clear();
	}
	public void forcleardaysbox(String b)
	{
		
		cleardaysbox().sendKeys(b);
	}

}
