import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestLogin extends TestBaseCV {

    @Test
    public void testLogin(){
        click(By.xpath("//button[contains(text(),'Log In')]"));
        fillLoginForm("cat@com.com", "1234567789");
        click(By.xpath("//button[@type='submit']"));
    }




}
