package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    //creating WebDriver object
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

//      WebElement inputslink = driver.findElement(By.linkText("Inputs"));
//       inputslink.click();

//        List<WebElement> links =  driver.findElements(By.tagName("a")); //will return list of Elements
//        System.out.println(links.size());
//

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
//    public static void main (String args[]){
//        BaseTests tests = new BaseTests();
//        tests.setUp();
//
//    }
}
