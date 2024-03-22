package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Home {
    WebDriver driver;
    String homeUrl="https://www.levelset.com/";
    String getPaid = "//a[@class=\"btn btn-info btn-outline mob-dropdown-btn\"]";
    public Home(WebDriver driver){
        this.driver=driver;
    }


    public void navigateToHomePage(){
        driver.get("https://www.levelset.com/");
        driver.manage().window().maximize();
        WebElement expectedButton = driver.findElement(By.xpath(getPaid));
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(expectedButton));
    }
   public void clickGetPaid(){
       By getPaidButton =  By.xpath(getPaid);
       WebElement getPaid=driver.findElement(getPaidButton);
       Actions action = new Actions(driver);
       action.doubleClick(getPaid).perform();


   }

}
