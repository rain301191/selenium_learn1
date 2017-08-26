package TestLoginPackage;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestLogin {
	@Test
	public void TestloginBlankfield(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NguyenAnh-PC\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//define login button and action click
		By submmit = By.id("SubmitLogin");
		WebElement buttonlogin = driver.findElement(submmit);
		buttonlogin.click();
		// define message error and so sánh câu thông báo
		By Err = By.xpath("//div[@Class ='alert alert-danger']/p/ol/li");
		WebElement errmeg = driver.findElement(Err);
		String errmgss = errmeg.getText();
		Assert.assertEquals(errmgss, "An email address required.");
		
	}

}
