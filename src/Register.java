import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Register {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Ceyda PAK/Desktop/projectmanagment/first project/selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://address-book-system-client.vercel.app/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("registerRedirect")).click();

        driver.findElement(By.id("name")).sendKeys("ceyda");
        driver.findElement(By.id("email")).sendKeys("ceyda@mail.com");
        driver.findElement(By.id("username")).sendKeys("ceyda");
        driver.findElement(By.id("password")).sendKeys("1234512356849");

        Select drop = new Select(driver.findElement(By.id("role")));
        drop.selectByVisibleText("Human Resources");
        Select drop1 = new Select(driver.findElement(By.id("department")));
        drop1.selectByVisibleText("Department4");
        Select drop2 = new Select(driver.findElement(By.id("position")));
        drop2.selectByVisibleText("Position3");
        Thread.sleep(1000);

        driver.findElement(By.id("phoneNumber")).sendKeys("12345123568");
        driver.findElement(By.id("officeNo")).sendKeys("1");
        Thread.sleep(1000);

        Select drop3 = new Select(driver.findElement(By.id("className")));
        drop3.selectByVisibleText("Spanish II");
        Select drop4 = new Select(driver.findElement(By.id("hour")));
        drop4.selectByVisibleText("11:00");
        Select drop5 = new Select(driver.findElement(By.id("dayOfWeek")));
        drop5.selectByVisibleText("Wednesday");
        Thread.sleep(1000);

        driver.findElement(By.id("addCourse")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("submitUser")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("viewButton")).click();
        driver.findElement(By.id("loginRedirect")).click();







    }
}

