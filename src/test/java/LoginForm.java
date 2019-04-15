import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginForm extends TestForm {

    @Test
    public void loginFormTest(){
        click(By.xpath("//button[contains(text(),'Log In')]"));
        fillLoginForm("cat@com.com", "123456789");
        click(By.xpath("//button[@type='submit']"));

    }

}
