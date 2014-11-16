package com.worldpay.test;

import com.worldpay.test.web.uicomponent.IndexPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.internal.FindsByLinkText;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by alexg on 07/11/14.
 */







public class IndexPageTest {

       WebDriver driver;
       IndexPage IndexPage;

    @Before
    public void setUp() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("----start-maximized");
        options.addArguments("--test-type");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @Test
    public void testElementPresent() throws InterruptedException {


        //Test the right Page
        driver.get("http://www.worldpay.com");
        IndexPage = PageFactory.initElements(driver, IndexPage.class);
        String url = driver.getCurrentUrl();
        assertEquals("http://www.worldpay.com/uk",url);
        IndexPage.clickSearchButton();
        //IndexPage.clickSearchField();
        IndexPage.enterSearch("Business");
        IndexPage.clickSearchButtonBig();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
