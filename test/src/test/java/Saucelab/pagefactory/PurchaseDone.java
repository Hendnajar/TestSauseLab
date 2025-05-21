package Saucelab.pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PurchaseDone {
    WebDriver driver;

    By AddToCartButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button");
    By RemoveFromCartButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button");
    By CartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By CheckoutButton = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By ContinueButton = By.id("continue");
    By finishButton = By.id("finish");
    By BackButton = By.id("back-to-products");

    public PurchaseDone(WebDriver driver) {
        this.driver = driver;
    }

    public void AddToCartButton() {
        driver.findElement(AddToCartButton).click();
    }
    public void VerifyAddToCartButton() {
        driver.findElement(RemoveFromCartButton).isDisplayed();
    }

    public void CartButton() {
        driver.findElement(CartButton).click();
    }
    public void VerifyCartButton(String redirectedURL) {
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }
    public void CheckoutButton() {
        driver.findElement(CheckoutButton).click();
    }
    public void VerifyCheckoutButton(String redirectedURL){
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }
    public void FirstName(String FirstName) {
        driver.findElement(firstName).sendKeys(FirstName);
    }
    public void VerifyFirstName(String FirstName) {
        Assert.assertEquals(driver.findElement(firstName).getAttribute("value"),FirstName);
    }

    public void LastName(String LastName) {
        driver.findElement(lastName).sendKeys(LastName);
    }
    public void VerifyLastName(String LastName) {
        Assert.assertEquals(driver.findElement(lastName).getAttribute("value"),LastName);
    }

    public void PostalCode(String PostalCode) {
        driver.findElement(postalCode).sendKeys(PostalCode);
    }
    public void VerifyPostalCode(String PostalCode) {
        Assert.assertEquals(driver.findElement(postalCode).getAttribute("value"),PostalCode);
    }

    public void ContinueButton() {
        driver.findElement(ContinueButton).click();
    }
    public void VerifyContinueButton(String redirectedURL) {
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }

    public void FinishButton() {
        driver.findElement(finishButton).click();
    }
    public void VerifyFinishButton(String redirectedURL) {
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }

    public void BackButton() {
        driver.findElement(BackButton).click();
    }
    public void VerifyBackButton(String redirectedURL) {
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }
}

