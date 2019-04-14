import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CVTestLogin extends  TastBaseCV{

    @Test
    public  void cvTest(){
        click(By.xpath("//button[contains(text(),'Log In')]"));
        fillLoginForm("cat@com.com", "123456789");
        click(By.xpath("//button[@type='submit']"));
    }



}
