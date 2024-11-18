package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calender_start_and_end {

	WebDriver driver;
	
	public calender_start_and_end(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    WebElement calendarInput;

    // Locate the month dropdown
    @FindBy(css = ".calendar-month-dropdown")
    WebElement month;

    // Locate the year dropdown
    @FindBy(css = ".calendar-year-dropdown") 
    WebElement yearDropdown;
    
    @FindBy(xpath = "//td[@class='calendar-day']")
    WebElement dayPicker;
    
}
