package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			//to maximize the window
			driver.manage().window().maximize();
			//to minimize the window
			//driver.manage().window().minimize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			//to locate element-driver.findElement
			//to type value in a text field-sendkeys()
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	        //to use click button-click()
	        //driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	        
	        
	        //driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	        
	        //driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.xpath("//a[text()='Leads']")).click();
	        
	        //driver.findElement(By.linkText("Create Lead")).click();
	        driver.findElement(By.linkText("//a[text()='Creat Lead']")).click();
	        
	        //driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
	        //driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Christy");
	        //driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Stanley");
	        
	        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test leaf");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Christy");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Stanley");
	        
	        //WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
	        WebElement eleSource = driver.findElement(By.xpath("//class[@id='createLeadForm_dataSourceId']"));
	        Select dropDown= new Select(eleSource);
	        dropDown.selectByVisibleText("Direct Mail");
	        
	        //WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	        WebElement eleIndustry = driver.findElement(By.xpath("//class[@id='createLeadForm_industryEnumId']"));
	        Select dropDown1= new Select(eleIndustry);
	        dropDown1.selectByIndex(7);
	        
	        //WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	        WebElement eleOwnership = driver.findElement(By.xpath("//class[@id='createLeadForm_ownershipEnumId']"));
	        Select dropDown2= new Select(eleOwnership);
	        dropDown2.selectByValue("OWN_PARTNERSHIP");
	        
	        //driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");
	        driver.findElement(By.xpath("//class[@id='createLeadForm_marketingCampaignId']")).sendKeys("Affiliate Sites");
	        
	        
	        //driver.findElement(By.className("smallSubmit")).click();
	        //driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	        //driver.findElement(By.name("submitButton")).click();-can use name locator
	        //driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		}

	}

