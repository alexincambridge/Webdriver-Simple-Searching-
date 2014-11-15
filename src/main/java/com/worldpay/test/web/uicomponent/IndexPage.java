package com.worldpay.test.web.uicomponent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by alexg on 07/11/14.
 */

//Vamos a crear los objetos de la pagina principal



public class IndexPage {

    private WebDriver driver;


    @FindBy(xpath = "//*[@id='block-menu-menu-topnavigation']/ul/li[2]/a")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=/'edit-search-block-form--4/']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id='edit-search-block-form--4']")
    private WebElement firstSearch;

    @FindBy(xpath = "//*[@id='edit-submit--2']")
    private WebElement searchButtonBig;


// constructor de la clase

    public IndexPage(WebDriver driver){

    this.driver  = driver;
}




//Metodos de los objetos

    public void clickSearchButton(){

    searchButton.click();
}

    public void clickSearchField(){

    searchField.click();
    }

    public void enterSearch(String enterSearch){
        firstSearch.sendKeys(enterSearch);
    }

    public void clickSearchButtonBig(){
        searchButtonBig.click();
    }






}