package stepDefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import runCukes.TestRunner;
import util.SeleniumUtil;

public class CommonStep {
	public static WebDriver driver;
   
    //helps to generate the logs in test report.
    public static int  rowNum;
    public static ExtentTest test;
    public static boolean flag;
	public static Scenario scenario;
	//public static  Logger LOGGER=LogManager.getLogger(CommonStep.class);
	public static String scenarioName;
	
	public static int count=0;
	@Before
	public void setup(Scenario scenario){
		//LOGGER.info("I am insideSetup");
		
		System.out.println("Inside SetUp in commonstep class");
		CommonStep.scenario=scenario;
	
		 scenarioName=scenario.getName();
				
		test = TestRunner.getExtent().createTest("Test Case "+count, scenarioName);
	    
		SeleniumUtil.getInstance();
		driver=SeleniumUtil.getDriver();
	}
    
	
	/*@Before("@tag2,@Tag1,@test1")
	public void login1(){
		System.out.println("testing for Tag2");
		
	}
		*/
	
	
	@After
	public void tearDown(Scenario scenario){
		//LOGGER.info("I am tearDown");
		scenario.write("I am inside tear down");
		if(test!=null && driver != null){
		if(scenario.isFailed()){	
		final byte[] screenshot =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png"); // stick it in the report
		
		test.log(Status.FAIL, MarkupHelper.createLabel(" FAILED ", ExtentColor.RED));
		}
		else{	
			test.log(Status.PASS, MarkupHelper.createLabel(" Passed ", ExtentColor.GREEN));
		}
		
		
		driver.quit();
    	
		}
		
	count++;
		
	}
	
	
	/*@After("@Tag2")
	public void login2(){
		
	}*/
	
	public static int getRownum() {
		return rowNum;
	}


	public static void setRownum(int rownum) {
		CommonStep.rowNum = rownum;
	}


	public static boolean isFlag() {
		return flag;
	}


	public static void setFlag(boolean flag) {
		CommonStep.flag = flag;
	}
	
	public static ExtentTest getTest() {
		return test;
	}
	
	 public static String getScenarioName() {
			return scenarioName;
		}
}
