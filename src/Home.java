import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Ceyda PAK/Desktop/projectmanagment/first project/selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://address-book-system-client.vercel.app/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("ceyda");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("1234512356849");
        Thread.sleep(1000);
        driver.findElement(By.id("loginSubmit")).click();
        driver.findElement(By.id("logoutRedirect")).click();
        












    }

}
