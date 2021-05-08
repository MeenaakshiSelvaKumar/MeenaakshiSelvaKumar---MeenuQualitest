package com.Test.Meenaakshi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatePersonalDetails {

 public static void main(String[] args){

  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  String URL="http://automationpractice.com/index.php";
  
  // Open URL and Maximize browser window
  driver.get(URL);
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

  //Click on Sign in
  driver.findElement(By.linkText("Sign in")).click();
  //Login
  driver.findElement(By.id("email")).sendKeys("bs.meenaakshi@gmail.com");
  driver.findElement(By.id("passwd")).sendKeys("Meenaakshi31");
  driver.findElement(By.id("SubmitLogin")).click();
  
  //Click on My Personal Information
  driver.findElement(By.className("icon-user")).click();


  //Set Value and proceed to save
  
  //driver.findElement(By.xpath("//p[@id='firstname']")).sendKeys("Meenu");
  //name="firstname"
 // is_required validate form-control
  //submitIdentity
 // driver.findElement(By.xpath("//form[input/@name='firstname']"));
		  //email_input = driver.find_element_by_xpath("//form[input/@name='email']")
 //driver.findElement(By.className("is_required validate form-control")).sendKeys("Meenu");
  driver.findElement(By.id("firstname")).clear();
  driver.findElement(By.id("firstname")).sendKeys("Meenu");
  driver.findElement(By.id("old_passwd")).sendKeys("Meenaakshi31");
  driver.findElement(By.name("submitIdentity")).click();
 //driver.findElement(By.cssSelector("button[class='btn btn-default button button-medium']")).click();

 }
}

