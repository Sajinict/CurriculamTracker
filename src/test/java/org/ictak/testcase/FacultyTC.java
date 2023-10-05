package org.ictak.testcase;

import java.io.IOException;
import java.time.Duration;

import org.ictak.base.BaseClass;
import org.ictak.constants.AutomationConstants;
import org.ictak.pages.FacultyPage;
import org.ictak.pages.HomePage;
import org.ictak.utilities.ExcelUtilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacultyTC extends BaseClass {

	
	HomePage hm;
	FacultyPage fc;
	
	@Test
	public void FACULTY_A01() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		fc.Fac1();
		fc.Back();
		
		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert1);
		
		Thread.sleep(2000);
		driver.quit();
}

	
	@Test
	public void FACULTY_A02() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		fc.Fac1();
		
		fc.Detail();
		String NUM=ExcelUtilities.getData(18, 1);
		String DESC=ExcelUtilities.getData(19, 1);
		
		fc.SL(NUM);
		fc.Desc(DESC);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10,500)");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Thread.sleep(2000);
		fc.sub();
		
		//fc.accept();
		
		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert1);
		
		Thread.sleep(2000);
		driver.quit();
}

	@Test
	public void FACULTY_A03() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		fc.Fac1();
		
		fc.Detail();
		
		String DESC=ExcelUtilities.getData(19, 1);
		
		
		fc.Desc(DESC);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Thread.sleep(2000);
		
		//fc.accept();
		
		boolean actualResult=fc.ChechB();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, false);
		
		Thread.sleep(2000);
		driver.quit();
}
	@Test
	public void FACULTY_A04() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		fc.Fac1();
		
		fc.Detail();
		String NUM=ExcelUtilities.getData(18, 2);
		String DESC=ExcelUtilities.getData(19, 1);
		
		fc.SL(NUM);
		fc.Desc(DESC);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10,500)");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Thread.sleep(2000);
		fc.sub();
		
		//fc.accept();
		
     	boolean actualResult=fc.ChechB();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, false);
		
		Thread.sleep(2000);
		driver.quit();
}
	
	
	@Test
	public void FACULTY_A05() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		fc.Fac1();
		
		fc.Detail();
		String NUM=ExcelUtilities.getData(18, 1);
		String DESC=ExcelUtilities.getData(19, 1);
		
		fc.SL(NUM);
		fc.Desc(DESC);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10,500)");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Thread.sleep(2000);
		fc.sub();
		
		//fc.accept();
		
     	boolean actualResult=fc.ChechB();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, false);
		
		Thread.sleep(2000);
		driver.quit();
}
	@Test
	public void FACULTY_A06() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
        fc.Mycur();
        
        fc.ClickFirst();
        String actualResult=fc.GetT();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty1);
		
		Thread.sleep(2000);
		driver.quit();
        
}
	
	@Test
	public void FACULTY_A07() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(20, 1);
		fc.src(SRCH);
		
		String actualResult=fc.GetT2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty2);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	@Test
	public void FACULTY_A08() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(21, 1);
		fc.src(SRCH);
		
		boolean actualResult=fc.srchr1();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	public void FACULTY_A09() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(22, 1);
		fc.src(SRCH);
		
		String actualResult=fc.GetT2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty3);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	public void FACULTY_A10() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(23, 1);
		fc.src(SRCH);
		
		String actualResult=fc.GetT2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty4);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	public void FACULTY_A11() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(24, 1);
		fc.src(SRCH);
		
		String actualResult=fc.GetT2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty5);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	public void FACULTY_A12() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(25, 1);
		fc.src(SRCH);
		
		String actualResult=fc.GetT2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty6);
		
		Thread.sleep(2000);
		driver.quit();
	
	}
	

	@Test
	public void FACULTY_A13() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(27, 1);
		fc.src(SRCH);
		
		String actualResult=fc.GetT4();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty7);
		
		Thread.sleep(2000);
		driver.quit();
	
	}
	@Test
	public void FACULTY_A14() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(28, 1);
		fc.src(SRCH);
		
		String actualResult=fc.GetT5();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty8);
		
		Thread.sleep(2000);
		driver.quit();
	
	}
	
	
	@Test
	public void FACULTY_A15() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		fc=new FacultyPage(driver);
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(0, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(1, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
	    
		String SRCH=ExcelUtilities.getData(29, 1);
		fc.src(SRCH);
		
		String actualResult=fc.GetT5();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Faculty9);
		
		Thread.sleep(2000);
		driver.quit();
	
	}
	
}