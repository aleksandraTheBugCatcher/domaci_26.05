/*Domaći: Otići na kupujemprodajem.com, u pretragu ukucati iphone 13, kliknuti na prvi rezultat.
 * Proveriti da je naslov oglasa onaj koji smo uočili i tokom manuelnog izvođenja kejsa.*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://www.kupujemprodajem.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("bodyTag")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement element = driver.findElement(By.id("searchKeywordsInput"));
        element.sendKeys("iphone 13");
        element.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//*[@id='e1']/div/div[1]/div/div[2]/a")).click();

        String actualRes = driver.getTitle();
        String expectedRes = "";


        if(actualRes.equals(expectedRes)){
            System.out.println("Validirano!");
        }

    }
}