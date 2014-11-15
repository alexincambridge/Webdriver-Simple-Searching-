package com.worldpay.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alejandro gomez on 09/11/14.
 * for worldpay
 * Cambridge
 * UK
 */
public class Testing {

        //creamos el metodo del test
       public static void main(String args[]){

           //inicializamos el webbrowser
           WebDriver driver = new ChromeDriver();
           //abrimos el navegador con la url
           driver.get("http://www.google.com");

           //empezamos por los elementos
           WebElement element = driver.findElement(By.name("q"));

           //escribimos lo que queremos buscar

           element.sendKeys("worldpay");

           element.submit();

           System.out.println("El titulo de la pagina" + driver.getTitle());

           driver.quit();

       }


}
