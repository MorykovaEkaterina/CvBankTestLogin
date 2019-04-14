import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login extends BaseTestCV {

    @Test
    public void testLogin(){
        click(By.xpath("//button[contains(text(),'Log In')]"));
        fillLoginForm("cat@com.com", "1234566");
        click(By.xpath("//button[@type='submit']"));

    }

}
