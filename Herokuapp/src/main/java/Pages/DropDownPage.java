package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownPage {
    private WebDriver driver ;
    private By dropDown = By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    public void selectFromDropDown(String option){
    findDropDownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
       List<WebElement> selectedElements =  findDropDownElement().getAllSelectedOptions();
       List<String> stringList = new ArrayList<>();
       for (WebElement element:selectedElements){
           stringList.add(element.getText());
       }
       return stringList;
    }
    private Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));
    }

}
