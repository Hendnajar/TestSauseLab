package Saucelab.tests;
import Saucelab.pagefactory.PurchaseDone;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.* ;

///************************************/
//import Saucelab.pagefactory.LoginPage;
//import org.openqa.selenium.WebDriver;
///************************************/


public class PurchaceTest extends BaseTest{
//    /***********************/
//    WebDriver driver;
//    LoginPage login;
//    /**************************/

    PurchaseDone purchaceTest;

    @BeforeClass
    public void setUp(){

//        /************************************/
//        driver = new EdgeDriver();
//        driver.get("https://www.saucedemo.com/");
//        login = new LoginPage(driver);
//        /************************************/

        //driver.get("https://www.saucedemo.com/inventory.html");
        purchaceTest = new PurchaseDone(driver);
    }

    @Test(priority = 2)
    public void completePurchaseFlow(){

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

        purchaceTest.AddToCartButton();
        purchaceTest.VerifyAddToCartButton();

        purchaceTest.CartButton();
        purchaceTest.VerifyCartButton("https://www.saucedemo.com/cart.html");

        purchaceTest.CheckoutButton();
        purchaceTest.VerifyCheckoutButton("https://www.saucedemo.com/checkout-step-one.html");

        purchaceTest.FirstName("Hend");
        purchaceTest.VerifyFirstName("Hend");

        purchaceTest.LastName("Elnaggar");
        purchaceTest.VerifyLastName("Elnaggar");

        purchaceTest.PostalCode("0123");
        purchaceTest.VerifyPostalCode("0123");

        purchaceTest.ContinueButton();
        purchaceTest.VerifyContinueButton("https://www.saucedemo.com/checkout-step-two.html");

        purchaceTest.FinishButton();
        purchaceTest.VerifyFinishButton("https://www.saucedemo.com/checkout-complete.html");

        purchaceTest.BackButton();
        purchaceTest.VerifyBackButton("https://www.saucedemo.com/inventory.html");
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

