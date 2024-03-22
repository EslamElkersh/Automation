import org.example.DocPage;
import org.example.Home;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Test1 {
    WebDriver driver;
    Home home;
    String document="Release a Lien";
    String price="$149";
   @BeforeEach
    public void setUp(){
       driver = new ChromeDriver();
       home = new Home(driver);
   }

@Test
    public void test(){
    home.navigateToHomePage();
    home.clickGetPaid();
    DocPage docPage=new DocPage(driver);
    Assert.assertEquals(docPage.getPrice(document),price,"Price is not the same");
}
}
