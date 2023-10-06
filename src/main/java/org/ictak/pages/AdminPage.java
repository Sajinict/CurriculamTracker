package org.ictak.pages;

import java.time.Duration;

import org.ictak.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends BaseClass{

	
	public AdminPage(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//i[@routerlink=\"/dashboard/requirement-list/rform\"]")
	WebElement adn;
	
	
	public void Form1 () {
		adn.click();
	}
	

	@FindBy(xpath="//input[@name=\"requirementName\"]")
	WebElement adn1;
	
	
	public void FormN(String NAMER) {
		adn1.sendKeys(NAMER);
	}
	@FindBy(xpath="//select[@id='trainingArea']")
	WebElement adn2;
	
	public void FormT() {
		
		adn2.click();;
	}
	
	@FindBy(xpath="//option[@value=\"FSD\"]")
	WebElement adn3;
	
	
	public void FormT1() {
			
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		adn3.click();;
	}
	
	@FindBy(id="institution")
	WebElement adn4;
	
	public void FormINS(String INSTR) {
		adn4.sendKeys(INSTR);
	}
	
	@FindBy(id="category")
	WebElement adn5;
	
	public void FormCatF() {
		adn5.click();
	}
	
	@FindBy(xpath="//option[@value=\"Retail\"]")
	WebElement adn6;
	
	public void FormCat1F() {
		adn6.click();
	}
	
	
	
	
	@FindBy(xpath="//input[@name=\"trainingHours\"]")
	WebElement adn7;
	
	public void FormTime(String TIMER) {
		adn7.sendKeys(TIMER);
	}
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement adnS;
	
	public void FormSub() {
		adnS.sendKeys(Keys.ENTER);
	}
	
	public void POPUP () {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
	}
	
	
	@FindBy(xpath="//option[@value=\"ML-AI\"]")
	WebElement adnML;
	
	public void ML() {
		adnML.click();
	}
	
	@FindBy(xpath="//option[@value=\"DSA\"]")
	WebElement adndsa;
	
	public void DSA() {
		adndsa.click();
	}
	
	@FindBy(xpath="//option[@value=\"RPA\"]")
	WebElement adnrpa;
	
	public void RPA() {
		adnrpa.click();
	}
	
	@FindBy(xpath="//option[@value=\"ST\"]")
	WebElement adnst;
	
	public void ST() {
		adnst.click();
	}
	
	@FindBy(xpath="//option[@value=\"CSA\"]")
	WebElement adncsa;
	
	public void CSA() {
		adndsa.click();
	}
	
	
	@FindBy(xpath="//option[@value=\"Academic\"]")
	WebElement adnc;
	
	public void FormCata2() {
		adnc.click();
	}
	
	@FindBy(xpath="//option[@value=\"Corporate\"]")
	WebElement adncc;
	
	public void FormCata3() {
		adncc.click();
	}
	
	@FindBy(xpath="//option[@value=\"Govt\"]")
	WebElement adncg;
	
	public void FormCata4() {
		adncg.click();
	}
	
	
	//approval
	
	@FindBy(xpath="//a[@href=\"/dashboard/pending\"]")
	WebElement apr;
	
	public void Pending() {
		apr.click();
	}
	
	@FindBy(xpath="//a[@class=\"text-start text-decoration-none\"]")
	WebElement apr1;
	
	public void Pending1() {
		
		apr1.click();
	}
	
	@FindBy(xpath="//button[@class=\"btn btn-primary mt-3 mr-5\"]")
	WebElement apr2;
	
    public void Pending2() {
    	try {
    	    WebElement element = driver.findElement(By.xpath("//button[@class=\"btn btn-primary mt-3 mr-5\"]"));
    	    Actions actions = new Actions(driver);
    	    actions.moveToElement(element).build().perform();
    	} catch (MoveTargetOutOfBoundsException e) {
    	    // Handle the exception, e.g., scroll the element into view or perform a different action
    	}
    apr2.sendKeys(Keys.ENTER);
	   }
	


    public void Pending3() {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(10000));
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"btn btn-primary mt-3 mr-5\"]")));

      element.click();
}

    @FindBy(xpath="//button[@class=\"btn btn-primary mr-5\"][1]")
    WebElement edt;
    
    public void Edit() {
    	edt.click();
    }
    
    @FindBy(xpath="//input[@id=\"Requirement\"]")
    WebElement edt1;
    
    public void EditFIELD(String REQ) {
    	edt1.sendKeys(REQ);
    }
    
    @FindBy(xpath="//button[@class=\"btn btn-primary mr-5\"][2]")
    WebElement sv;
    
    public void Save() {
    	
    	sv.click();
    }
    
    
    @FindBy(xpath="//button[@class=\"btn btn-outline-primary mr-3\"]")
    WebElement des;
    
    public void Descp() {
    	des.click();
    }
    @FindBy(xpath="//button[@class=\"btn btn-primary\"][1]")
    WebElement edtd;
    
    public void EditD() {
    	edtd.click();
    
    }
   
    @FindBy(xpath="//textarea[@id=\"description\"]")
    WebElement txt;
    
    public void TEXT(String TX) {
    	txt.sendKeys(TX);
    }
    
    @FindBy(xpath="//button[@type=\"button\"][2]")
    WebElement sv2;
    
    public void SV() {
    	sv2.click();
    }
    
    @FindBy(xpath="//button[@aria-controls=\"flush-collapseOne\"]")
    WebElement ms;
    
    public void MSG() {
    	ms.click();
    }
    
    
    
    @FindBy(id="input")
    WebElement ms1;
    
    public void TxtMSG(String MSGING) {
    	ms1.sendKeys(MSGING);
    }
    
    @FindBy(xpath="//button[@type=\"submit\"]")
    WebElement sndb;
    
    public void Sending() {
    	sndb.click();
    }
    
    
    @FindBy(xpath="//a[@href=\"/dashboard/curriculum-list\"]")
    WebElement cur;
    
    public void AllCurriculam() {
    	cur.click();
    }
    
    
    @FindBy(xpath="//button[@class=\"btn btn-outline-white m-1 p-3\"][1]")
    WebElement dlte;
    
    public void DELETEB() {
    	dlte.click();
    }
    
    
    @FindBy(xpath="//input[@placeholder=\"Search \"]")
    WebElement srchb;
    
    public void SRC1(String SRCHB) {
    	srchb.sendKeys(SRCHB);
    }
    
    
    
	//ASSERTION
	
	public String AssertAD () {
		return driver.getCurrentUrl();
		
	}
	
	public boolean AssertAD2() {
		return driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[2]/app-requirementform/form/button")).isSelected();
	}
		
	public String Alert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert.getText();
	}
	
	public String AssertED() {
		return driver.findElement(By.xpath("//a[@routerlink=\"/dashboard/pending\"]")).getText();
	}
	
	public boolean DescA() {
		 return driver.findElement(By.xpath("//textarea[@name=\"description\"]")).isEnabled();
	}
	
	public String ADMINMSG() {
		return ms.getText();
		
	}
	
	public boolean ASDLT() {
		return dlte.isEnabled();
	}
	
	public boolean SRCHAS() {
		return driver.findElement(By.xpath("//div[@class=\"card-body\"][1]")).isDisplayed();
	}
}
