package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in {
	
private WebDriver driver;

	public Log_in(WebDriver driver) {
		
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath ="//input[@placeholder='Username']")
	
	private WebElement userName; 
	
	@FindBy(xpath ="//input[@placeholder='Password']")
	
	private WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")
	
	private WebElement loginBtn; 
	
	
	public void sendUserName(String userName) {
		
		this.userName.sendKeys(userName);
	
	}
	
	public void sendPassword(String password) {
		
		this.password.sendKeys(password); 
	
	}
	
	public void clickLoginBtn() {
	
		this.loginBtn.click(); 
	}

}
