package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocPage {
    WebDriver driver;

    public DocPage(WebDriver driver){
        this.driver=driver;
    }
public String getPrice (String document){
    String oldDocLocator = "//div[@class=\"left\" and  contains(.,\"%s\")]/following-sibling::div/span[@class=\"price-amount\"]";
    String newDocLocator = String.format(oldDocLocator,document);
     new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newDocLocator)));
     String price = driver.findElement(By.xpath(newDocLocator)).getText();

    return price;
}


}
