import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class myclass {

    public static void main(String[] args) {
        String email = "fatih.tasci.optiim@gmail.com";
        String sifre = "karakartal25";

        System.setProperty("driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.n11.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.className("btnSignIn"));
        element.click();
        WebElement element2 = driver.findElement(By.id("email"));
        element2.sendKeys(email);
        WebElement element3 = driver.findElement(By.id("password"));
        element3.sendKeys(sifre);
        driver.findElement(By.id("loginButton")).click();




       /* driver.findElement(By.cssSelector("[class='myAccount'] [class='menuTitle ']")).click();
        driver.findElement(By.cssSelector("[class='hOpenMenuContent'] [class='logoutBtn']")).click(); */


    }



}