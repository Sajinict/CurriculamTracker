package org.ictak.testcase;

import java.io.IOException;

import org.ictak.base.BaseClass;
import org.ictak.constants.AutomationConstants;
import org.ictak.pages.HomePage;
import org.ictak.utilities.ExcelUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC extends BaseClass{

	HomePage hm;
	
	
	@Test
	public void LOGIN_A01() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert1);
		
		Thread.sleep(2000);
		driver.quit();
		
}

	@Test
	public void LOGIN_A02() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		
		String inp= ExcelUtilities.getData(2, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(3, 1);
		hm.Log3(inp2);
		
		//hm.Log4();
		//hm.Logok();
		
		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert2);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void LOGIN_A03() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		
		String inp= ExcelUtilities.getData(4, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(5, 1);
		hm.Log3(inp2);
		
		
		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert2);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void LOGIN_A04() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert3);
		
		Thread.sleep(2000);
		driver.quit();
		
}
	
	@Test
	public void LOGIN_A05() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		
		String inp= ExcelUtilities.getData(8, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(9, 1);
		hm.Log3(inp2);
		
		
		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert2);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
    }