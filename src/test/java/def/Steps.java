package def;

import config.Lib;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.LoginPOM;
import pom.SignUpPOM;

public class Steps extends Lib{

	SignUpPOM signup;
	LoginPOM login;
	
	
@Given("Visit the site")
public void visit_the_site() {
	browser("chrome", "https://trello.com/");
	impWait(20);
}
@Given("Click Signup for free")
public void click_signup_for_free() {
   signup = new SignUpPOM();
   signup.getSignUpBtn().click();
}
@Given("Click Skip")
public void click_Skip() {
	frame("//iframe[@title='recaptcha challenge expires in two minutes']");
   signup = new SignUpPOM();
   signup.getSkipMe().click();
}

@Given("Enter the valid mail")
public void enter_the_valid_mail() {
	 signup = new SignUpPOM();
	 signup.getMyEmail().sendKeys("anirudhms2912@gmail.com");
}
@Given("Click Submit")
public void click_submit() {
	 signup = new SignUpPOM();
	 signup.getSignUp().click();
}
@Given("Click continue")
public void click_continue() {
	 login = new LoginPOM();
	 login.getContinueBtn().click();
}

@Given("Click login to login")
public void click_login_to_login() {
	login = new LoginPOM();
	login.getLoginBtn().click();
}
@Given("Enter the valid user mail")
public void enter_the_valid_user_mail() {
	login = new LoginPOM();
	login.getLoginMail().sendKeys("anirudhms2912@gmail.com");
}

@Then("Eneter Valid Password")
public void eneter_valid_password() {
	login = new LoginPOM();
	login.getPass().sendKeys("anirudhms2912@gmail.com");
}


@Given("Enter the valid user {string}")
public void enter_the_valid_user(String mail) {
	login = new LoginPOM();
	login.myMail(mail);
}
@Then("Eneter Valid {string}")
public void eneter_valid(String pass) {
	login = new LoginPOM();
	login.myPass(pass);
}


}
