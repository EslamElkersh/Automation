package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField=By.id("target");
    private By result = By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
  /*  public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "2", "2", "7"));
    }*/
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
