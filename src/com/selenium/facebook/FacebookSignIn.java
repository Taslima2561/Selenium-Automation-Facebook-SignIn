package com.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookSignIn {

	private WebDriver driver;
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Torin\\eclipse-workspace\\FacebookSignIn\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("taslima.cse2561@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mynameistaslima");
        driver.findElement(By.xpath("//*[@id=\"u_0_5_6b\"]")).click();
    }
    
    public static void main(String args[]) throws InterruptedException {
    	FacebookSignIn test = new FacebookSignIn();
        test.setUp();

    }
}
