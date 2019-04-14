import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TastBaseCV {
    WebDriver wd;

    @BeforeTest
    public  void  setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://cvbank.soft-gen.com/");
    }

    protected void fillLoginForm(String email, String pwd) {
        type(By.xpath("//input[@placeholder='email']"), email);
        type(By.xpath("//input[@placeholder='password']"), pwd);

    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }

    private void type(By locator, String text) {
        if(text!=null) {
            wd.findElement(locator).click();
            wd.findElement(locator).click();
            wd.findElement(locator).sendKeys(text);
        }
    }

    @AfterTest
    public void tearDown(){
        wd.quit();
    }
}
