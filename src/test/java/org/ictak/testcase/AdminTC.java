package org.ictak.testcase;

import java.io.IOException;
import java.time.Duration;

import org.ictak.base.BaseClass;
import org.ictak.constants.AutomationConstants;
import org.ictak.pages.AdminPage;
import org.ictak.pages.HomePage;
import org.ictak.utilities.ExcelUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTC extends BaseClass{

	
	HomePage hm;
	AdminPage adm;
	
	
	@Test
	public void AdminA_01() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.FormT();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCat1F();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}

	@Test
	public void AdminA_02() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.ML();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCat1F();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	
	@Test
	public void AdminA_03() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.DSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCat1F();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	
	@Test
	public void AdminA_04() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.RPA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCat1F();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	
	@Test
	public void AdminA_05() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.ST();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCat1F();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	@Test
	public void AdminA_06() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.CSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCat1F();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	
	@Test
	public void AdminA_07() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.CSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCata2();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	@Test
	public void AdminA_08() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.CSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCata3();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	
	@Test
	public void AdminA_09() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.CSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCata4();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin1);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	
	@Test
	public void AdminA_10() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 2);
        adm.FormN(NAMER);
        
        adm.CSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCata4();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin2);
		
		Thread.sleep(2000);
	    driver.close();

		
}
	
	@Test
	public void AdminA_11() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 3);
        adm.FormN(NAMER);
        
        adm.CSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCata4();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult,AutomationConstants.Admin2 );
		
		Thread.sleep(2000);
	    driver.close();

		}
	
	@Test
	public void AdminA_12() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 4);
        adm.FormN(NAMER);
        
        adm.CSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCata4();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult,AutomationConstants.Admin2 );
		
		Thread.sleep(2000);
	    driver.close();

		}
	
	
	@Test
	public void AdminA_13() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 5);
        adm.FormN(NAMER);
        
        adm.CSA();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCata4();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult,AutomationConstants.Admin2 );
		
		Thread.sleep(2000);
	    driver.close();

		}
	
	@Test
	public void AdminA_14() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
       
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCat1F();
		
		String TIMER=ExcelUtilities.getData(34, 1);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		//adm.POPUP();	
		boolean actualResult=adm.AssertAD2();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult,false );
		
		Thread.sleep(2000);
	    driver.close();


		
}

	@Test
	public void AdminA_15() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
	
		

		hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Form1();
		
        String NAMER=ExcelUtilities.getData(32, 1);
        adm.FormN(NAMER);
        
        adm.FormT();
        Thread.sleep(2000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        adm.FormT1();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
       
    
        String INSTR=ExcelUtilities.getData(33, 1);
		adm.FormINS(INSTR);
		
		adm.FormCatF();
		adm.FormCat1F();
		
		String TIMER=ExcelUtilities.getData(34, 2);
		adm.FormTime(TIMER);
		
		adm.FormSub();
		adm.POPUP();	
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin2);
		
		Thread.sleep(2000);
	    driver.close();


		
        }
	
	
	
	
}