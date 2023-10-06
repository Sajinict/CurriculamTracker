package org.ictak.pages;

import org.ictak.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacultyPage extends BaseClass {

	public FacultyPage(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class=\"card-body\"][1]")
	WebElement rq;
	
	public void Fac1 () {
		rq.click();
	}
	
	@FindBy(xpath="//li[@routerlink=\"/faculty-dashboard/Rformfaculty\"]")
	WebElement rq1;
	
	public void Back () {
		rq1.click();
	}
	
	@FindBy(xpath="//a[@href=\"/faculty-dashboard/curriculum-create/details\"][1]")
	WebElement rq2;
	
	public void Detail () {
		rq2.click();
	}
	
	@FindBy(id="curriculum_id")
	WebElement rq3;
	
	public void SL(String NUM) {
		rq3.sendKeys(NUM);
	}
	
	@FindBy(id="description")
	WebElement rq4;
	
	public void Desc(String DESC) {
		rq4.sendKeys(DESC);
	}
	
	@FindBy(xpath="//div[@class=\"d-flex justify-content-end\"]")
	WebElement rq5;
	
	public void sub() {
		rq4.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement rq0;
	
	public void accept() {
	
		driver.switchTo().alert().accept();
	}
	
	@FindBy(xpath="//a[@routerlink=\"/faculty-dashboard/my-curriculums\"]")
	WebElement rq6;
	
	public void Mycur() {
		rq6.click();
	}
	@FindBy(xpath="//a[@class=\"list-group-item-action d-flex justify-content-between\"][1]")
	WebElement rq7;
	
	public void ClickFirst() {
		rq7.click();
	}
	
	@FindBy(xpath="//input[@placeholder=\"Search \"]")
	WebElement srch1;
	
	
	public void src(String SRCH) {
		srch1.sendKeys(SRCH);
	}
	
	@FindBy(xpath="//div[@class=\"card-body\"][1]")
	WebElement srch3;
	
	public boolean srchr1() {
		return srch3.isDisplayed();
	}
    
	
	
	
	
	//assertion
	
	public String GetLink() {
		return driver.getCurrentUrl();
	}
	
	public boolean ChechB() {
		return driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
	}
	
	public String GetT() {
		return driver.findElement(By.xpath("//label[@class=\"text-lg-start\"][1]")).getText();
	}
	public String GetT2() {
		return driver.findElement(By.xpath("//h6[@class=\"card-text\"][1]")).getText();
	}
	
	public String GetT3() {
		return driver.findElement(By.xpath("//h6[@class=\"card-text\"][1]")).getText();
	}
	
	public String GetT4() {
		return driver.findElement(By.xpath("//h5[@class=\"card-title text-center\"][1]")).getText();
	}
	
	public String GetT5() {
		return driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-rform-faculty/div[2]/div/div[1]/div/a/div/h6[3]")).getText();
	}
	
	
}
