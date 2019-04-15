import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestForm {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://cvbank.soft-gen.com/");
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void fillLoginForm(String email, String pwd) {
        type(By.xpath("//input[@placeholder='email']"), email);
        type(By.xpath("//input[@placeholder='password']"), pwd);
    }

    private void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    @AfterClass
    public void tearDown(){
        wd.quit();
    }
}
