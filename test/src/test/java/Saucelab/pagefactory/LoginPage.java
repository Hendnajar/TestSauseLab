package Saucelab.pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    By userNamefield = By.id("user-name");
    By passwordfield = By.id("password");
    By loginbutton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) {
        driver.findElement(userNamefield).sendKeys(userName);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordfield).sendKeys(password);
    }
    public void clickLogin() {
        driver.findElement(loginbutton).click();
    }

    public void usernameverification(String userName) {
        Assert.assertEquals(driver.findElement(userNamefield).getAttribute("value"),userName);
    }
    public void Passwordverification(String password) {
        Assert.assertEquals(driver.findElement(passwordfield).getAttribute("value"),password);
    }
    public void loginbuttonverification(String redirectedURL) {
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }
}
