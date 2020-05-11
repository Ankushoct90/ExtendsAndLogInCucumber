package stepDefinition;

import cucumber.api.java.en.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.Login;
import util.SeleniumUtil;

public class StepDefinition {

	@Given("^user open the browser and enter url$")
	public void user_open_the_browser_and_enter_url_as() throws Throwable {
		CommonStep.scenario.write("user open the browser and enter url");
		SeleniumUtil.navigate("https://www.amazon.in/");

		// Ideally to be done like below
		// SeleniumUtil.navigate(SeleniumUtil.configProperties.getProperty("url"));
		Login.validateLoginPageTitle();

		SeleniumUtil.EmbedScreenShot(CommonStep.scenario);

		// just to add screenshot to extent reports
		CommonStep.getTest().info("user open the browser and enter url");
		String imagePath = SeleniumUtil.takeScreenShotReturnPath();
		CommonStep.getTest().addScreenCaptureFromPath(imagePath, "open browser");

	}

	@Then("^user clicks on sign in link$")
	public void user_clicks_on_sign_in_link() throws Throwable {
		CommonStep.scenario.write("user clicks on sign in link");
		Login.clickSignIn();

		SeleniumUtil.EmbedScreenShot(CommonStep.scenario);

		// just to add screenshot to extent reports
		CommonStep.getTest().info("user clicks on sign in link");
		String imagePath = SeleniumUtil.takeScreenShotReturnPath();
		CommonStep.getTest().addScreenCaptureFromPath(imagePath, "Sign in Page");

	}

	@And("^user enters userId$")
	public void user_enters_userId () throws Throwable {
		
		CommonStep.scenario.write("user enters userId");
		Login.enterEmailID_OrPhoneNum();

		SeleniumUtil.EmbedScreenShot(CommonStep.scenario);

		// just to add screenshot to extent reports
		CommonStep.getTest().info("user enters userId");
		String imagePath = SeleniumUtil.takeScreenShotReturnPath();
		CommonStep.getTest().addScreenCaptureFromPath(imagePath, "user enters userId");

	}

	@And("^user enters password$")
	public void user_enters_password() throws Throwable {
		
		CommonStep.scenario.write("user enters password");
		Login.enterPassword();

		SeleniumUtil.EmbedScreenShot(CommonStep.scenario);

		// just to add screenshot to extent reports
		CommonStep.getTest().info("user enters password");
		String imagePath = SeleniumUtil.takeScreenShotReturnPath();
		CommonStep.getTest().addScreenCaptureFromPath(imagePath, "user enters password");

	}
	
	@And("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable{
		CommonStep.scenario.write("user clicks on continue button");
		Login.clickContinueButton();

		SeleniumUtil.EmbedScreenShot(CommonStep.scenario);

		// just to add screenshot to extent reports
		CommonStep.getTest().info("user clicks on continue button");
		String imagePath = SeleniumUtil.takeScreenShotReturnPath();
		CommonStep.getTest().addScreenCaptureFromPath(imagePath, "user clicks on continue button");

	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
		CommonStep.scenario.write("user clicks on login button");
		Login.clickLoginButton();

		SeleniumUtil.EmbedScreenShot(CommonStep.scenario);

		// just to add screenshot to extent reports
		CommonStep.getTest().info("user clicks on login button");
		String imagePath = SeleniumUtil.takeScreenShotReturnPath();
		CommonStep.getTest().addScreenCaptureFromPath(imagePath, "user clicks on login button");

	}
}
