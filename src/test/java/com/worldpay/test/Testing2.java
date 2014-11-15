package com.worldpay.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alexg on 10/11/14.
 */
public class Testing2 {

    public static void main ( String args []) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("worldpay");
        element.submit();
        Thread.sleep(400);
        driver.findElement(By.xpath("//*[@id='rso']/div[2]/li[1]/div/h3/a")).click();

        System.out.println("the name of page is:" + driver.getTitle());

        driver.quit();


    }


}
