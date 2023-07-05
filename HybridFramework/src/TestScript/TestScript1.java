package TestScript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericScript.Base_Test;
import POMScript.Pom1;

public class TestScript1 extends Base_Test
{
@Test(dataProvider="testdata")
public void Test1(String d1,String d2) throws InterruptedException
{
	Pom1 p=new Pom1(driver);
	p.username(d1);
	p.pwd(d2);
	Thread.sleep(3000);
	p.click_btn(); 
	Assert.fail();
}
@DataProvider(name="testdata")//testdata send to 12th line
public Object[][] createData1()
{
	return new Object[][]
	{
		{"Deepak","123"},
		{"Deepa","456"},
			};
			}}
