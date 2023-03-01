package stepDefinations;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.searchCustomerPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addCust;
	public searchCustomerPage searchCust;
	public static Logger logger;
	public Properties configProp;
	
	//Create for generated random string fpr uniqe email..
	public String randomstring()
	{
		String generatedString1= RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	

}
