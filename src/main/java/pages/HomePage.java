package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    //we want to have fields, which represents WebEleemnts and methods

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    //Because we have 45 elements on this page, it is not good to create webelement for each
    // lets create general method
    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
