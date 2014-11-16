package com.worldpay.test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 *
 * Created by alejandro Gomez on 09/11/14.
 * Implementation in Selenium WebDriver
 *
 */




public class GoogleSearch {


    public static void main(String args[]) throws InterruptedException {
        //Create a new instance of html unit driver
        //Notice that the remainder of the code relies on the interface
        //not the implementation

        WebDriver driver = new ChromeDriver();    //invocamos la instancia

        //And now use this to visit Google
        driver.get("http://www.google.co.uk");

        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("gbqfq")));
        //Find the text input element by its name
        //WebElement element = driver.findElement(By.id("gbqfq"));


            //Enter something to search for
            element.sendKeys("worldpay");
            //Now submit the form. WebDriver will find the form for us from the element
            element.submit();
            Thread.sleep(1000);


            //Check the title of the page
            System.out.println("Page title is:" + driver.getTitle());





        driver.quit();


        }


    }






