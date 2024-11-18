package Functions;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Employee_Selection {
	
private WebDriver driver;

public Employee_Selection(WebDriver driver) {

	this.driver = driver; 
	
	PageFactory.initElements(driver, this);

}


	
		private  By emploeyeeName = By.xpath("//input[@placeholder='Type for hints...']");

		private  By emploeyeeNameDropdown = By.xpath("//div[@role='option']");

		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
		private WebElement employee_job_title_click;
		
		@FindBy(xpath = "//div[@class='oxd-autocomplete-option']")
		private WebElement employee_job_title;

		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
		private WebElement  sub_title;

		@FindBy(xpath = "//div[4]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
		private WebElement include_review;

		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
		private WebElement review_sel;

		@FindBy(xpath = "//a[@href='/web/index.php/performance/viewPerformanceModule']")
		private WebElement performance_click;
	
	
	
	public void click_performance() {
		
		this.performance_click.click();
	}
	
	public void employee_selection(String entered_name, String displayed_name) throws InterruptedException {
	
		WebElement em_name =  driver.findElement(emploeyeeName);
		
		em_name.click();
		
		em_name.sendKeys("Rang");
		
		Thread.sleep(3000);
	
		List<WebElement> options = driver.findElements(emploeyeeNameDropdown);
		
		for (WebElement op : options) {
			
			if(op.getText().equals("Ranga Akunuri")) {
			
				op.click();
			
				break;
			
			}
			
		}
		
	}
	
	public void employee_job_title_click() {
		
		employee_job_title_click.click();
		
	}
	
	public void job_title_By_Text(String job_titleName) {
	    
    	WebElement dropdown = driver.findElement((By) employee_job_title);
        
    	Select sel = new Select(dropdown);
        
    	sel.selectByVisibleText("Software Engineer");
    
    }
	
	public void sub_Role_By_Text(String sub_role_Name) {
	    
    	WebElement dropdown = driver.findElement((By) sub_title);
        
    	Select sel = new Select(dropdown);
        
    	sel.selectByVisibleText("Team Lead"); // Select an option by visible text
    
    }
	
	public void include_By_Text(String includeName) {
	    
    	WebElement dropdown = driver.findElement((By) include_review);
        
    	Select sel = new Select(dropdown);
        
    	sel.selectByVisibleText("Current and Past Employees"); // Select an option by visible text
    
    }
	
	public void review_Role_By_Text(String review) {
	    
    	WebElement dropdown = driver.findElement((By) review_sel);
        
    	Select sel = new Select(dropdown);
        
    	sel.selectByVisibleText("Activated"); // Select an option by visible text
    
    }

}
