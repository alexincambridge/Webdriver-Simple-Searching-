package com.worldpay.test;

import com.worldpay.test.web.uicomponent.GooglePage;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;


public class TestWP {

    //instanciamos selenium webdriver
    WebDriver driver;
    //extendemos la clase con la pagina de los objetos a testear
    GooglePage GooglePage;



    @Before
    public void setUp() throws Exception{
        //inicializamos el navegador
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    @Test
    public void testElementsPresents() throws InterruptedException{
        driver.get("http://www.google.com");
        GooglePage = PageFactory.initElements(driver, GooglePage.class);

        GooglePage.inputSearch("worldpay");

        //GooglePage.clickSearchButton();
        Thread.sleep(4000);
        GooglePage.clickSearchButton();
        GooglePage.clickButton();




    }




    @After
    public void tearDown() throws Exception{
        System.out.println("Name of the page:" + driver.getTitle());
        driver.quit();



    }




}
