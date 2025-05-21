package Saucelab.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\hend2\\IdeaProjects\\test\\src\\test\\java\\Saucelab\\resources\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
