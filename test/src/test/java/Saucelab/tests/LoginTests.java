package Saucelab.tests;
import Saucelab.pagefactory.LoginPage;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class LoginTests extends BaseTest {
    LoginPage login;

    @BeforeClass
    public void setUp() {

//        /************************************/
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\hend2\\IdeaProjects\\test\\src\\test\\java\\Saucelab\\resources\\edgedriver_win64\\msedgedriver.exe");
//        driver = new EdgeDriver();
//        driver.get("https://www.saucedemo.com/");
//        /************************************/


        login = new LoginPage(driver);
        //"C:\\Users\\hend2\\IdeaProjects\\test\\src\\test\\java\\Saucelab\\resources\\edgedriver_win64\\msedgedriver.exe"
    }

    @Test(priority = 1)
    public void testLoginNegative() {

        login.enterUserName("locked_out_user");
        login.usernameverification("locked_out_user");

        login.enterPassword("secret_sauce");
        login.Passwordverification("secret_sauce");

        login.clickLogin();
        login.loginbuttonverification("https://www.saucedemo.com/");
    }

    @Test(priority = 2)
    public void testLoginPositve() {
        driver.get("https://www.saucedemo.com/");

        login.enterUserName("standard_user");
        login.usernameverification("standard_user");

        login.enterPassword("secret_sauce");
        login.Passwordverification("secret_sauce");

        login.clickLogin();
        login.loginbuttonverification("https://www.saucedemo.com/inventory.html");
    }
}
