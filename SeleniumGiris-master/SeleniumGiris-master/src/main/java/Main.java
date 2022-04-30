
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com");

        WebElement element1 = driver.findElement(By.id("user_1_"));
        element1.click();

        WebElement element2 = driver.findElement(By.cssSelector(" .login-form__link[data-tracking-label=\"ÜyeOl\"]"));
        element2.click();

        WebElement element3 = driver.findElement(By.cssSelector("#RegisterFormView_RegisterEmail"));
        String username="tugce";
        element3.sendKeys(username);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// yapılan işlemleri bekler


        WebElement element4 = driver.findElement(By.cssSelector("#RegisterForm > div > div.input-text.invalid > span.field-validation-error"));

        String gecersizemail = element4.getText();


        System.out.println(gecersizemail);


        WebElement element5 = driver.findElement(By.cssSelector("#RegisterFormView_Password"));
        String password="tugce";
        element5.sendKeys(password);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// yapılan işlemleri bekler


        WebElement element6 = driver.findElement(By.cssSelector("#RegisterForm > div > div:nth-child(7) > span.field-validation-error"));

        String gecersizparola=element6.getText();
        System.out.println(gecersizparola);

        WebElement element7 = driver.findElement(By.cssSelector("#RegisterForm > div > div.input-helper"));
        String parolakriteri = element7.getText();
        System.out.println(parolakriteri);


    }
}
