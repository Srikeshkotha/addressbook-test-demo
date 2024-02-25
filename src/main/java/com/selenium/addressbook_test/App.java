package com.selenium.addressbook_test;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        //System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        System.out.println("Script Executing");
        
        //1.Open the browser and get the url
        driver.get("http://54.166.12.214:8081/addressbook-2.0/");
        Thread.sleep(1000);
        
        //2.enable wait for 3 seconds
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(1000);
        
        //3.click on new contact button
        driver.findElement(By.className("v-button")).click();
        Thread.sleep(1000);
        
        //4.Locate first name and enter details
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Srikar");
        Thread.sleep(1000);
        
        //5.Locate last name and enter details
        driver.findElement(By.id("gwt-uid-7")).sendKeys("Kotha");
        Thread.sleep(1000);
        
        //6.Locate phone and enter phone number
        driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
        Thread.sleep(1000);
        
        //6.Locate Email and enter details
        driver.findElement(By.id("gwt-uid-11")).sendKeys("Srikesh@xyz.com");
        Thread.sleep(1000);
        
        //7.Locate date of birth and enter details
        driver.findElement(By.id("gwt-uid-13")).sendKeys("2/22/24,");
        Thread.sleep(1000);
        
        //8.Locate save button and click on save
        driver.findElement(By.className("v-button-primary")).click();
        Thread.sleep(1000);
        
        
        driver.quit();
        
        System.out.println("Script executed successfully");
        
    }

	}




