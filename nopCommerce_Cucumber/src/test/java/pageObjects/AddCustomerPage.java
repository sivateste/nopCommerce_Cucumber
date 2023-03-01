package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
	
	public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	By lnkCustomer_Menu =By.xpath("(//a[@href='#'])[7]");
	By lnkCustomer_MenuItems=By.xpath("//p[text()=' Customers']");
	By btnAddnew=By.xpath("//a[@href='/Admin/Customer/Create']");
	
	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword =By.xpath("//input[@id='Password']");
	
	By txtCustomerRoles=By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]");
	
	By lstitemAdministrator =By.xpath("//li[contains(text(),'Administrators')]");
	By lstitemRegistered =By.xpath("//li[contains(text(),'Registered')]");
	By lstitemGuests =By.xpath("//li[contains(text(),'Guests')]");
	By lstitemVendors =By.xpath("//li[contains(text(),'Vendors')]");
	
	By drpmgeOfVendors=By.xpath("//select[@id='VendorId']");
	By rpMaleGender =By.id("Gender_Male");
	By rpFemaleGender=By.id("Gender_Female");
	
	By txtFirstname=By.xpath("//input[@id='FirstName']");
	By txtLastname =By.xpath("//input[@id='LastName']");
	
	By txtDOB =By.xpath("//input[@id='DateOfBirth']");
	
	By txtComapnyName=By.xpath("//input[@id='Company']");
	By txtAddCommet =By.xpath("//textarea[@id='AdminComment']");
	By btnSave=By.xpath("//button[@name='save']");
	
	//Actons Methods
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	
	public void clickCustomerMenu()
	{
		ldriver.findElement(lnkCustomer_Menu).click();
	}
	public void clickOnCustomerItemMenu()
	{
		ldriver.findElement(lnkCustomer_MenuItems).click();
	}
	public void clickAddNew()
	{
		ldriver.findElement(btnAddnew).click();
	}
	public void setEmail(String email)
	{
		ldriver.findElement(txtEmail).sendKeys(email);
	}
	public void setPassword(String password)
	{
		ldriver.findElement(txtPassword).sendKeys(password);
	}
	public void setCustomerRole(String role) throws Throwable
	{
		if(!role.equals("Vendors"))
		{
			ldriver.findElement(By.xpath("//*[@id='SelectedCustomerRoleIds_listbox']"));
		}
		ldriver.findElement(txtCustomerRoles).click();
		
		WebElement listitem;
		Thread.sleep(2000);
		
		if(role.equals("Administrators"))
		{
			listitem=ldriver.findElement(lstitemAdministrator);
		}
		else if(role.equals("Registered"))
		{
			listitem=ldriver.findElement(lstitemRegistered);
		}
		else if(role.equals("Guests"))
		{
			listitem=ldriver.findElement(lstitemGuests);
		}
		else 
		{
			listitem=ldriver.findElement(lstitemVendors);
		}
		listitem.click();
		
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click;",listitem);
		
	}
		public void setmgaOfVendors(String value)
		{
			Select sc=new Select(ldriver.findElement(drpmgeOfVendors));
			sc.selectByVisibleText(value);
		}
		public void setGender(String gender)
		{
			if(gender.equals("Male"))
			{
				ldriver.findElement(rpMaleGender).click();
			}else if(gender.equals("Female"))
			{
				ldriver.findElement(rpFemaleGender).click();
			}else
			{
			ldriver.findElement(rpMaleGender).click(); //default	
			}
		}
		public void setFirstName(String fname)
		{
			ldriver.findElement(txtFirstname).sendKeys(fname);
		}
		public void setLastName(String lname)
		{
			ldriver.findElement(txtLastname).sendKeys(lname);
		}
		public void setDOB(String dob)
		{
			ldriver.findElement(txtDOB).sendKeys(dob);
		}
		public void setCompanyName(String companyName)
		{
			ldriver.findElement(txtComapnyName).sendKeys(companyName);
		}
		public void setAddCommit(String commit)
		{
			ldriver.findElement(txtAddCommet).sendKeys(commit);
		}
		public void clickSave()
		{
			ldriver.findElement(btnSave).click();
		}
	
}
