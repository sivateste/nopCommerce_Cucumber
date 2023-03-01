package stepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import cucumber.api.java.lu.a;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.searchCustomerPage;

public class Steps extends BaseClass{


	@Before
	public void setUp() throws Throwable
	{
		//Log4j file
		logger=Logger.getLogger("nopcomemcre"); //Adding Logger
		PropertyConfigurator.configure("Log4j.properties"); //Adding Logger
		
		//Reading Properties
		configProp=new Properties();
		FileInputStream confibpropfile=new FileInputStream("config.properties");
		configProp.load(confibpropfile);
		
		String br=configProp.getProperty("browser");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			driver=new ChromeDriver();
		}else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("firefoxpath"));
			driver=new FirefoxDriver();
		}
		logger.info("************** Open Browser ***************");
		
	}
	@Given("^user launch chrome browser$")
	public void user_launch_chrome_browser() throws Throwable {
		
		lp=new LoginPage(driver);
		
	}

	@When("^user opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) throws Throwable {
		logger.info("************** Launch Url ***************");
		driver.get(url);
	}

	@When("^user enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_email_as_and_password_as(String email, String passowrd) throws Throwable {

		lp.setUserName(email);
		lp.setPassword(passowrd);
	}

	@When("^click login$")
	public void click_login() throws Throwable {

		logger.info("************** Open Browser ***************");
		lp.clickLogin();
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Throwable {

		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			driver.close();
			Assert.assertTrue(false);
			logger.info("************** Login Pass ***************");
		}else
		{
			Assert.assertEquals(title, driver.getTitle());
			logger.info("************** Login Fail ***************");
		}
	}

	@When("^user click on logout link$")
	public void user_click_on_logout_link() throws Throwable {
		logger.info("************** Browser LogOut ***************");
		lp.clickLogout();
		Thread.sleep(2000);
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		logger.info("************** Close Browser ***************");
		driver.close();
	}

	//Customer Feature set Defination........


	@Then("^user can view Dashboard$")
	public void user_can_view_Dashboard() throws Throwable {
		addCust =new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());

	}

	@When("^user click on customers menu$")
	public void user_click_on_customers_menu() throws Throwable {
		Thread.sleep(2000);
		addCust.clickCustomerMenu();
		logger.info("************** Open customer menu ***************");

	}

	@When("^click on customer menu items$")
	public void click_on_customer_menu_items() throws Throwable {
		Thread.sleep(2000);
		addCust.clickOnCustomerItemMenu();

	}

	@When("^click on Add new button$")
	public void click_on_Add_new_button() throws Throwable {
		addCust.clickAddNew();

	}

	@Then("^use can view add new customer page$")
	public void use_can_view_add_new_customer_page() throws Throwable {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());

	}

	@When("^user enter customer info$")
	public void user_enter_customer_info() throws Throwable {
		logger.info("************** Add Customer data ***************");
		String email=randomstring()+"@gmail.com";
		addCust.setEmail(email);
		addCust.setPassword("test1234");
		//Registered - default
		//The customer cannot be in both 'Guest' and 'Registered' customer role
		// Add customer to 'Guest' or 'Registered' customer role
		addCust.setCustomerRole("Guest");
		Thread.sleep(2000);
		addCust.setmgaOfVendors("Vendor 2");
		addCust.setGender("Male");
		addCust.setFirstName("siva");
		addCust.setLastName("Reddy");
		addCust.setDOB("7/05/1997");
		addCust.setCompanyName("BusyQA");
		addCust.setAddCommit("This is for Testing.........!");
		
	}

	@When("^click Save button$")
	public void click_Save_button() throws Throwable {
		addCust.clickSave();
		Thread.sleep(2000);
	}

	@Then("^user can see confirmation message \"([^\"]*)\"$")
	public void user_can_see_confirmation_message(String msg) throws Throwable {
		
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The new customer has been added successfully"));
	}
	
	//steps for searching customer  using  email id..............
	
	@When("^Enter customer Email$")
	public void enter_customer_Email() throws Throwable {
		logger.info("**************Search Customer email ***************");
		searchCust=new searchCustomerPage(driver);
		searchCust.setEmail("victoria_victoria@nopCommerce.com");
	
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		logger.info("************** Click Search ***************");
		searchCust.clickSearch();
		Thread.sleep(2000);
	
	}

	@Then("^User should found email in the Search table$")
	public void user_should_found_email_in_the_Search_table() throws Throwable {
	boolean status=	searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
	Assert.assertEquals(true, status);
	}

	//steps for searching customer  using First Name & Last Name
	
	@When("^Enter Customer FirstName$")
	public void enter_Customer_FirstName() throws Throwable {
		searchCust=new searchCustomerPage(driver);
		searchCust.setFirstName("Victoria");
	
	}

	@When("^Enter Customer LastName$")
	public void enter_Customer_LastName() throws Throwable {
		
		searchCust.setLastName("Terces");
	
	}

	@Then("^User should found Name in the Search table$")
	public void user_should_found_Name_in_the_Search_table() throws Throwable {

		logger.info("************** search customer with Name ***************");
		boolean status=searchCust.searchCustomerByName("Victoria Terces");
		Assert.assertEquals(true, status);
	}
} 
