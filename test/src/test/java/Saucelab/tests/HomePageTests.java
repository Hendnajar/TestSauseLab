package Saucelab.tests;
import Saucelab.pagefactory.Homepage;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.* ;

/************************************/
import Saucelab.pagefactory.LoginPage;
import org.openqa.selenium.WebDriver;
/************************************/

public class HomePageTests extends BaseTest {

//    /***********************/
//    WebDriver driver;
//    LoginPage login;
//    /**************************/

    Homepage homepage;

    @BeforeClass
    public void setUp() {

//        /************************************/
//        driver = new EdgeDriver();
//        driver.get("https://www.saucedemo.com/");
//        login = new LoginPage(driver);
//        /************************************/

        //driver.get("https://www.saucedemo.com/inventory.html");
        homepage = new Homepage(driver);
    }


    @Test(priority = 3)

    public void homePageTest(){

//        /************************************/
//        driver.get("https://www.saucedemo.com/");
//
//        login.enterUserName("standard_user");
//        login.usernameverification("standard_user");
//
//        login.enterPassword("secret_sauce");
//        login.Passwordverification("secret_sauce");
//
//        login.clickLogin();
//        login.loginbuttonverification("https://www.saucedemo.com/inventory.html");
//        /************************************/

        //homepage.HandlePasswordAlert();

        homepage.PickItem();
        homepage.verifyClickElement("https://www.saucedemo.com/inventory-item.html?id=4");
        homepage.AddToCart();
        homepage.verifyAddToCartButtonClicked();
        homepage.RemoveFromCart();
        homepage.verifyRemoveFromCartButtonClicked();
        homepage.BacToProducts();
        homepage.verifyBackToProductsButtonClicked("https://www.saucedemo.com/inventory.html");

    }

//    /************************************/
//    @AfterClass
//    public void tearDown() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        //driver.quit();
//    }
//    /************************************/
}

