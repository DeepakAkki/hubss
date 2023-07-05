package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericScript.Base_Page;

public class Pom1 extends Base_Page//****
{
	//declaration
		@FindBy(id="email") 
		private WebElement usname;
		@FindBy(name="pass")
		private WebElement pass;
		@FindBy(xpath="//button[@name='login']")
		private WebElement lgn_btn; 
		//initialization made it genric in base page
		public Pom1 (WebDriver driver )
		{
		super(driver);//super calling
		}
		//utilization
		public void username(String data)
		{
			usname.sendKeys(data);
		}
		public void pwd(String data1)
		{
			pass.sendKeys(data1);
		}
		public void click_btn()
		{
			lgn_btn.click();
		}}