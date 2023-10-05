package org.ictak.testcase;

import java.io.IOException;
import java.time.Duration;

import org.ictak.base.BaseClass;
import org.ictak.constants.AutomationConstants;
import org.ictak.pages.HomePage;
import org.ictak.utilities.ExcelUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTC extends BaseClass{

	HomePage hm;
	
	@Test
	public void SIGNUP_A01() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 1);
	    String EML=ExcelUtilities.getData(12, 1);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 1);
	    String PASS2=ExcelUtilities.getData(14, 1);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    hm.SIGNUP();
	    hm.Logok();
	    

		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert2);
		
		Thread.sleep(2000);
		driver.quit();
}

	@Test
	public void SIGNUP_A02() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 2);
	    String EML=ExcelUtilities.getData(12, 1);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 1);
	    String PASS2=ExcelUtilities.getData(14, 1);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    hm.SIGNUP();
	    hm.Logok();
	    

		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.SignAssert1);
		
		Thread.sleep(2000);
		driver.quit();
}
	
	@Test
	public void SIGNUP_A03() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 3);
	    String EML=ExcelUtilities.getData(12, 1);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 1);
	    String PASS2=ExcelUtilities.getData(14, 1);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    hm.SIGNUP();
	    hm.Logok();
	    

		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.SignAssert1);
		
		Thread.sleep(2000);
		driver.quit();
}
	
	@Test
	public void SIGNUP_A04() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 1);
	    String EML=ExcelUtilities.getData(12, 2);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 1);
	    String PASS2=ExcelUtilities.getData(14, 1);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    //hm.SIGNUP();
	    //hm.Logok();
	    

		String actualResult=hm.Ptext2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.SignAssert2);
		
		Thread.sleep(2000);
		driver.quit();
}
	
	@Test
	public void SIGNUP_A05() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 1);
	    String EML=ExcelUtilities.getData(12, 3);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 1);
	    String PASS2=ExcelUtilities.getData(14, 1);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    //hm.SIGNUP();
	    //hm.Logok();
	    

		String actualResult=hm.Ptext2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.SignAssert2);
		
		Thread.sleep(2000);
		driver.quit();
}
	@Test
	public void SIGNUP_A06() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 1);
	    String EML=ExcelUtilities.getData(12, 1);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 2);
	    String PASS2=ExcelUtilities.getData(15, 2);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    Thread.sleep(3000);
	    
	    

		String actualResult=hm.Ptext3();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.SignAssert3);
		
		Thread.sleep(2000);
		driver.quit();
}
	@Test
	public void SIGNUP_A07() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 1);
	    String EML=ExcelUtilities.getData(12, 1);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 3);
	    String PASS2=ExcelUtilities.getData(15, 3);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    Thread.sleep(3000);
	    
	    

		String actualResult=hm.Ptext3();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.SignAssert3);
		
		Thread.sleep(2000);
		driver.quit();
}
	
	@Test
	public void SIGNUP_A08() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 1);
	    String EML=ExcelUtilities.getData(12, 1);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 4);
	    String PASS2=ExcelUtilities.getData(15, 4);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    Thread.sleep(3000);
	    
	    

		String actualResult=hm.Ptext4();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.SignAssert4);
		
		Thread.sleep(2000);
		driver.quit();
}
	
	@Test
	public void SIGNUP_A10() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 1);
	    String EML=ExcelUtilities.getData(12, 1);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 5);
	    String PASS2=ExcelUtilities.getData(15, 5);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    Thread.sleep(3000);
	    
	    

		String actualResult=hm.Ptext3();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.LoginAssert2);
		
		Thread.sleep(2000);
		driver.quit();
}
	@Test
	public void SIGNUP_A09() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		
		
		hm.Log1();
		hm.create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    String NAME=ExcelUtilities.getData(11, 1);
	    String EML=ExcelUtilities.getData(12, 4);
	    String NUMB=ExcelUtilities.getData(13, 1);
	    String PASS=ExcelUtilities.getData(14, 1);
	    String PASS2=ExcelUtilities.getData(14, 1);
	    
	    hm.Name(NAME);
	    hm.EMAIL(EML);
	    hm.NUM(NUMB);
	    hm.PAS(PASS);
	    hm.PAS2(PASS2);
	    
	    hm.SIGNUP();
	    hm.Logok();
	    

		String actualResult=hm.Asslog();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.SignAssert5);
		
		Thread.sleep(2000);
		driver.quit();
}

	
}