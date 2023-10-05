package org.ictak.pages;

import java.time.Duration;

import org.ictak.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
    @FindBy(xpath="//a[@routerlink=\"login\"]")
	WebElement ab;
	
	public void Log1() {	
		ab.click();
    }

	
	 @FindBy(id="exampleInputEmail1")
	 WebElement a1;
		
	 public void Log2(String inp) {
			
	 a1.sendKeys(inp);
	    }

      @FindBy(id="exampleInputPassword1")
	  WebElement a2;
      
			
	  public void Log3(String inp2) {
	  a2.sendKeys(inp2);
		    
	  }

	  @FindBy(xpath="//button[@type=\"submit\"]")
	  WebElement a3;
	  
	  public void Log4() {
		  a3.click();
	  }
	  
	  
	  
	  @FindBy(xpath="")//button[@class="swal2-confirm swal2-styled"]
	  WebElement ab1;
	 		
	  public void Logok() {			
	      driver.findElement(By.xpath("//button[@class=\"swal2-confirm swal2-styled\"]")).sendKeys(Keys.ENTER);
	 	}
	
	
	  @FindBy(xpath="//a[@class=\"create-account\"]")
	  WebElement sgn1 ;
	 		
	  public void create  () {	
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

	  sgn1.sendKeys(Keys.ENTER);
	 	}
	  
	  @FindBy(xpath="//input[@name=\"Name\"]")
	  WebElement sgn2;
	  
	  public void Name(String NAME) {
	  sgn2.sendKeys(NAME);
	  }
	  
	  @FindBy(xpath="//input[@name=\"Email\"]")
	  WebElement sgn3;
	  
      public void EMAIL(String EML) {
	  sgn3.sendKeys(EML);
	  }
	  
      @FindBy(xpath="//input[@name=\"Contact\"]")
	  WebElement sgn4;
      
      public void NUM(String NUMB) {	  
	  sgn4.sendKeys(NUMB);
	  }
      
      
	  @FindBy(xpath="//input[@type=\"password\"][1]")
	  WebElement sgn5;
	 		
	  public void PAS(String PASS) {	  
	  sgn5.sendKeys(PASS);
		  }
	      
	  
	  @FindBy(xpath="//input[@name=\"ConfirmPassword\"]")
	  WebElement sgn6 ;
	  
	  public void PAS2(String PASS2) {	  
	  sgn6.sendKeys(PASS2);
			  }
	  
	  @FindBy(xpath="//button[@type=\"submit\"]")
	  WebElement sgn7;
	  
	  public void SIGNUP() {	
			sgn7.sendKeys(Keys.ENTER);
	    }
	  
	  
	  //assertion
	  
	  public String Asslog() {
		  return driver.getCurrentUrl();
		  }
	  public String Ptext() {			
	      return driver.findElement(By.xpath("//small[@class=\"text-danger\"]")).getText();
	 	}
	  public String Ptext2() {			
	      return driver.findElement(By.xpath("//small[@class=\"text-danger\"]")).getText();
	 	}
	 
	  public String Ptext3() {			
	      return driver.findElement(By.xpath("//small[@class=\"text-danger\"]")).getText();
	 	}
	  public String Ptext4() {			
	      return driver.findElement(By.xpath("//small[@class=\"text-danger\"]")).getText();
	 	}
}
	
	