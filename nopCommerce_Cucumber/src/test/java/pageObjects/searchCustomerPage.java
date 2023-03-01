package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class searchCustomerPage {
	public WebDriver ldriver;
	
	WaitHelper waitHelper;
	
	public  searchCustomerPage(WebDriver rdriver) {
	ldriver=rdriver;
	
	PageFactory.initElements(ldriver, this);
	waitHelper=new WaitHelper(ldriver);
	}
	
	@FindBy(how=How.ID ,using="SearchEmail")
	WebElement txtEmail;
	
	@FindBy(how=How.ID ,using ="SearchFirstName")
	WebElement txtFirstName;
	
	@FindBy(how=How.ID ,using="SearchLastName")
	WebElement txtLastName;
	
	@FindBy(how=How.ID ,using="SearchMonthOfBirth")
	WebElement drpdobMonth;
	
	@FindBy(how=How.ID ,using="SearchDayOfBirth")
	WebElement drpdobDay;
	
	@FindBy(how=How.ID , using="SearchCompany")
	WebElement txtCompany;
	
	@FindBy(how=How.XPATH , using="//div[@class='k-widget k-multiselect k-multiselect-clearable']")
	WebElement txtcompanyRole;
	
	@FindBy(how=How.XPATH ,using="//li[contains(text() , 'Administrators')]")
	WebElement lstitemAdministrator;
	
	@FindBy(how=How.XPATH ,using="//li[contains(text() , 'Forum Moderators')]")
	WebElement lstitemModerator;
	
	@FindBy(how=How.XPATH ,using="//li[contains(text() , 'Guests')]")
	WebElement lstitemGuests;
	
	@FindBy(how=How.XPATH ,using="//li[contains(text() , 'Registered')]")
	WebElement lstitemRegistered;
	
	@FindBy(how=How.XPATH ,using="//li[contains(text() , 'Vendors')]")
	WebElement lstitemVendors;
	
	@FindBy(how=How.ID ,using="search-customers")
	WebElement btnSearch;
	
	@FindBy(how=How.XPATH ,using="//table[@id='customers-grid']")
	WebElement table;
	
	@FindBy(how=How.XPATH ,using="//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;
	
	@FindBy(how=How.XPATH ,using="//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement> tableColumns;
	
	public void setEmail(String email)
	{
	//	waitHelper.waitForElement(txtEmail, 20);
		txtEmail.clear();
		txtEmail.sendKeys(email);
		
	}
	public void setFirstName(String fname)
	{
		//waitHelper.waitForElement(txtFirstName, 20);
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);
		
	}
	public void setLastName(String lname)
	{
		//waitHelper.waitForElement(txtLastName, 20);
		txtLastName.clear();
		txtLastName.sendKeys(lname);
		
	}
	public void clickSearch()
	{
		//waitHelper.waitForElement(txtFirstName, 20);
		btnSearch.click();
	}
	
	public int getNoOfRows()
	{
		return(tableRows.size());
	}
	
	public int getNoOfColumns()
	{
		return(tableColumns.size());
	}
	
	
	
	public boolean searchCustomerByEmail(String email)
	{
		boolean flag=false;
		for(int i=1;i<=getNoOfRows();i++)
		{
			String emailid=table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(emailid);
		if(emailid.equals("victoria_victoria@nopCommerce.com"))
		{
			flag=true;
		}
		}
		return flag;
	}
	public boolean searchCustomerByName(String Name)
	{
		boolean flag=false;
		for(int i=1;i<=getNoOfRows();i++)
		{
			String name=table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[3]")).getText();
			String names[]=name.split(" "); //spearating firstname and lastnale
			
			if(names[0].equals("Victoria") && names[1].equals("Terces"))
		{
			flag=true;
		}
		}
		return flag;
	}
	
}
