package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinition.CommonStep;
import util.SeleniumUtil;


public class Login {
		
	//static WebDriver driver;
	//Demo branch comments
	public static final String TITLE="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	public static final String SIGN_IN_CSS = "#nav-link-accountList";
	public static final String EMAIL_ID_CSS="#ap_email";
	public static final String PASSWORD_CSS="#ap_password";
	public static final String LOGIN_CSS="#signInSubmit";
	public static final String CONTINUE_BUTTON_CSS="#continue";
	
	
	
	public static void validateLoginPageTitle(){
		
		Assert.assertEquals("The title of the page is not matching", TITLE,CommonStep.driver.getTitle());
		
	}
	
	public static void clickSignIn(){
		SeleniumUtil.clickLink(By.cssSelector(SIGN_IN_CSS));
	}

	public static void enterEmailID_OrPhoneNum(){
		SeleniumUtil.enterText(By.cssSelector(EMAIL_ID_CSS),userId);
		
	}
	
	public static void enterPassword(){
		SeleniumUtil.enterText(By.cssSelector(PASSWORD_CSS),password);
		
	}	
	
	
	public static void clickLoginButton(){
		SeleniumUtil.clickLink(By.cssSelector(LOGIN_CSS));
	}
	
	public static void clickContinueButton(){
		SeleniumUtil.clickLink(By.cssSelector(CONTINUE_BUTTON_CSS));
	}
	
	public static void enterUrl(String url){
		
		SeleniumUtil.navigate(url);
		
	}
	
	
	
	public static String userId= "9ankush@gmail.com";
	public static String password ="********";
	
}
