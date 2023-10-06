package org.ictak.testcase;

import java.io.IOException;

import org.ictak.base.BaseClass;
import org.ictak.constants.AutomationConstants;
import org.ictak.pages.AdminPage;
import org.ictak.pages.HomePage;
import org.ictak.utilities.ExcelUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTC2 extends BaseClass {

	
	HomePage hm;
	AdminPage adm;
	
	
	@Test
	public void Admin_AP_01() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Pending();
		adm.Pending1();
		adm.Pending2();
		
		String actualResult=adm.AssertAD();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin3);
		
		Thread.sleep(2000);
	    driver.close();

		
		
	}
	
	
	@Test
	public void Admin_AP_02() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Pending();
		adm.Pending1();
		
		adm.Edit();
		
		String REQ=ExcelUtilities.getData(35, 1);
		adm.EditFIELD(REQ);
		adm.Save();
		
		//adm.Pending2();
		adm.POPUP();
		
		String actualResult=adm.AssertED();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin4);
		
		Thread.sleep(2000);
	    driver.close();

		
		
	}
	
	@Test
	public void Admin_AP_03() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Pending();
		adm.Pending1();
		adm.Descp();
		adm.EditD();
		
		String TX=ExcelUtilities.getData(36, 1);
		adm.TEXT(TX);
		adm.SV();
		
		boolean actualResult=adm.DescA();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, false);
		
		Thread.sleep(2000);
	    driver.close();

		
		
	}

	@Test
	public void Admin_AP_04() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.Pending();
		adm.Pending1();
		
		adm.MSG();
	    
		String MSGING=ExcelUtilities.getData(37, 1);
		adm.TxtMSG(MSGING);
		
		adm.Sending();
		
		String actualResult=adm.ADMINMSG();
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, AutomationConstants.Admin5);
		
		Thread.sleep(2000);
	    driver.close();

		
		
	}
	@Test
	public void Admin_AP_05() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		
		adm.AllCurriculam();
		adm.DELETEB();
		
		boolean actualResult=adm.ASDLT();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();
		
	}
	
	
	@Test
	public void Admin_SR_01() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		String SRCHB=ExcelUtilities.getData(38, 1);
		adm.SRC1(SRCHB);
		
	    boolean actualResult=adm.SRCHAS();
	    
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();


		
	}
	@Test
	public void Admin_SR_02() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		String SRCHB=ExcelUtilities.getData(39, 1);
		adm.SRC1(SRCHB);
		
	    boolean actualResult=adm.SRCHAS();
	    
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();


		
	}
	
	@Test
	public void Admin_SR_03() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		String SRCHB=ExcelUtilities.getData(40, 1);
		adm.SRC1(SRCHB);
		
	    boolean actualResult=adm.SRCHAS();
	    
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();


		
	}
	
	
	@Test
	public void Admin_SR_04() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		String SRCHB=ExcelUtilities.getData(41, 1);
		adm.SRC1(SRCHB);
		
	    boolean actualResult=adm.SRCHAS();
	    
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();


		
	}
	
	@Test
	public void Admin_SR_05() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		String SRCHB=ExcelUtilities.getData(42, 1);
		adm.SRC1(SRCHB);
		
	    boolean actualResult=adm.SRCHAS();
	    
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();


		
	}
	
	@Test
	public void Admin_SR_06() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		String SRCHB=ExcelUtilities.getData(43, 1);
		adm.SRC1(SRCHB);
		
	    boolean actualResult=adm.SRCHAS();
	    
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();


		
	}
	
	
	@Test
	public void Admin_SR_07() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		String SRCHB=ExcelUtilities.getData(44, 1);
		adm.SRC1(SRCHB);
		
	    boolean actualResult=adm.SRCHAS();
	    
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();


		
	}
	
	@Test
	public void Admin_SR_08() throws IOException, InterruptedException {
		hm=new HomePage(driver);
		adm=new AdminPage(driver);
		
        hm.Log1();
		
		String inp= ExcelUtilities.getData(6, 1);
		hm.Log2(inp);
		
		String inp2= ExcelUtilities.getData(7, 1);
		hm.Log3(inp2);
		
		hm.Log4();
		hm.Logok();
		
		String SRCHB=ExcelUtilities.getData(45, 1);
		adm.SRC1(SRCHB);
		
	    boolean actualResult=adm.SRCHAS();
	    
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, true);
		
		Thread.sleep(2000);
	    driver.close();


		
	}
}