package Saucelab.pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class Homepage {
    WebDriver driver;
    //By pickItem = By.cssSelector("img[alt=\"Sauce Labs Backpack\"]");
    By pickItem = By.xpath("//*[@id=\"item_4_img_link\"]/img");
    By AddToCartButton = By.id("add-to-cart");
    By RemoveFromCartButton = By.id("remove");
    By BackToProductsButton = By.id("back-to-products");
    //By GoToCartButton = By.xpath("//a[@Class=\"shopping_cart_link\"]");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
//    public void HandlePasswordAlert() {
//        driver.switchTo().alert().accept();
//    }

    public void PickItem() /*throws InterruptedException*/ {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt='Sauce Labs Backpack']")));
        //Thread.sleep(3000); // waits for 3 seconds
        driver.findElement(pickItem).click();
    }
    public void AddToCart(){
        driver.findElement(AddToCartButton).click();
    }
    public void RemoveFromCart(){
        driver.findElement(RemoveFromCartButton).click();
    }
    public void BacToProducts(){
        driver.findElement(BackToProductsButton).click();
    }

    public void verifyClickElement(String redirectedURL){
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }

    public void verifyAddToCartButtonClicked(){
        driver.findElement(RemoveFromCartButton).isDisplayed();
    }
    public void verifyRemoveFromCartButtonClicked(){
        driver.findElement(AddToCartButton).isDisplayed();
    }
    public void verifyBackToProductsButtonClicked(String redirectedURL){
        Assert.assertEquals(driver.getCurrentUrl(),redirectedURL);
    }
}
