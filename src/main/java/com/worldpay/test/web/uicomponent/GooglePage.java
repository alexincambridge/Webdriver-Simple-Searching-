package com.worldpay.test.web.uicomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexg on 10/11/14.
 */
public class GooglePage {

    private WebDriver driver;


    @FindBy(name = "q" )
    private WebElement firstSearch;

    @FindBy( xpath ="//*[@id='gbqfb']" )
    private WebElement googleSearch;

    @FindBy(xpath = "//*[@id='gbqfb']")
    private WebElement googleSearchButton;

    // constructor de la clase
    public GooglePage (WebDriver driver){
        this.driver = driver;

    }

    //methods


    public void inputSearch(String inputSearch){

        firstSearch.sendKeys(inputSearch);
    }

    public void clickButton(){
        googleSearchButton.click();
    }


    public void clickSearchButton(){
        googleSearchButton.click();
    }


}


