package TestRunner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browsers.all_browsers;
import Functions.Employee_Selection;
import Functions.Log_in;

public class Tests {
	
	WebDriver driver; 
	Log_in log_in;
	Employee_Selection employee_Selection;
	
	
	@BeforeTest
    public void setup() {
        // Initialize the WebDriver using the All_browser class
        driver = all_browsers.getDriver("CHROME");

        // Launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Initialize Page Object Model (POM) classes
        log_in = new Log_in(driver);
        employee_Selection = new Employee_Selection(driver);
    }
	
	@Test
	public void automation_test() throws InterruptedException {
		
		log_in.sendUserName("Admin");
		log_in.sendPassword("admin123");
		log_in.clickLoginBtn();
		
		employee_Selection.click_performance();
		employee_Selection.employee_selection("Joh", "John Doe");
		employee_Selection.employee_job_title_click();
		employee_Selection.job_title_By_Text("Software Engineer");
		employee_Selection.sub_Role_By_Text("Team Lead");
		employee_Selection.include_By_Text("Current and Past Employees");
		employee_Selection.review_Role_By_Text("Activated");
	}
	
//	@AfterTest
//	publici

}
