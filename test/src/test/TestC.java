package test;

import junit.framework.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestC {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Hello");
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.in");
	//driver.getTitle();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span[1]")).click();
	Thread.sleep(1000);
	WebElement username = driver.findElement(By.xpath("//Input[@id='ap_email']"));
	username.sendKeys("santosini55@gmail.com");
	WebElement password = driver.findElement(By.xpath("//Input[@id='ap_password']"));
	password.sendKeys("likuliku");
	
	driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	
	/*if(driver.switchTo().alert() != null)
	{
	    Alert alert = driver.switchTo().alert();
	    String alertText = alert.getText();
	    alert.dismiss(); // alert.accept();

	}*/
	//Validate the successful login
	String bodyText = driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span[1]")).getText();
	System.out.println(bodyText);
	Assert.assertTrue("Hello, santosini", bodyText.contains(bodyText));
	
	WebElement searchlab = driver.findElement(By.xpath("//Input[@id='twotabsearchtextbox']"));
	searchlab.sendKeys("iphone");
	driver.findElement(By.xpath("//div[@id='nav-search']/form/div[2]/div/input")).click();
	
	//Thread.sleep(3000);
	//driver.close();
	
	
	

	}

}
