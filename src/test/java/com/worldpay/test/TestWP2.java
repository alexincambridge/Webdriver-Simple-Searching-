package com.worldpay.test;


import com.worldpay.test.web.uicomponent.GooglePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class TestWP2 {


    WebDriver driver;


    @Before
    public void setUp() throws  Exception {

        //instanciamos el navegador
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }



    @Test
    public void testElements() throws InterruptedException {
       driver.get("http://www.google.com");

    }



    @After
    public void tearDown() throws Exception {

       driver.quit();

    }


}
