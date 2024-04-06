package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLinks("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLinks("Dropdown");
        return new DropDownPage(driver);
    }
    public ForgetPasswordPage clickForgetPassword(){
        clickLinks("Forgot Password");
        return new ForgetPasswordPage(driver);
    }
    public HoversPage clickHovers(){
        clickLinks("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLinks("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLinks("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    private void clickLinks(String link) {
        driver.findElement(By.linkText(link)).click();
    }

}
