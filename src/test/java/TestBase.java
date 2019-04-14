import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeTest
    public void  setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://cvbank.soft-gen.com/");
    }

    protected void fillLoginForm(String email, String pwd) {
        type(By.cssSelector("[placeholder='email']"),email, "[placeholder='email']");
        type(By.cssSelector("[placeholder='password']"), pwd, "[placeholder='password']" );
    }

    private void type(By locator, String text, String s) {
        if(text!=null) {
            wd.findElement(locator).click();
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }

    @AfterClass
    public void tearDown(){
        wd.quit();
    }
}
