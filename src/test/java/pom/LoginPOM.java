package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Lib;

public class LoginPOM extends Lib{
	public LoginPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href='/login'])[1]")
	private static WebElement loginBtn;
	@FindBy(id = "user")
	private static WebElement loginMail;
	
	@FindBy(xpath = "//input[@type='submit']")
	private static WebElement continueBtn;
	
	@FindBy(id = "password")
	private static WebElement pass;
	
	
	public static WebElement getPass() {
		return pass;
	}
	public static WebElement getContinueBtn() {
		return continueBtn;
	}
	public static WebElement getLoginBtn() {
		return loginBtn;
	}
	public static WebElement getLoginMail() {
		return loginMail;
	}
	
	public static void myMail(String mail) {
		getLoginMail().sendKeys(mail);
	}
	
	public static void myPass(String pass) {
		getPass().sendKeys(pass);
	}
}
