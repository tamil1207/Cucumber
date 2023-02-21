package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Lib;

public class SignUpPOM  extends Lib{
	public SignUpPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@aria-label='Sign up for Trello - it’s free!'])[1]")
	private static WebElement SignUpBtn;
	public static WebElement getSkipMe() {
		return skipMe;
	}

	@FindBy(xpath = "//input[@name='email']")
	private static WebElement myEmail;
	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement signUp;
	@FindBy(xpath = "//button[text()='Skip']")
	private static WebElement skipMe;
	
	
	
	public static WebElement getSignUpBtn() {
		return SignUpBtn;
	}
	public static WebElement getMyEmail() {
		return myEmail;
	}
	public static WebElement getSignUp() {
		return signUp;
	}
	
	
	
}
