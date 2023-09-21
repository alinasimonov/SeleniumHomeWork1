package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class FaceBookExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("alinasimonov1993@gmail.com");

        //find the password
        WebElement password= driver.findElement(By.name("pass"));
        password.sendKeys("hjgdjsajds");

        //find login button
        WebElement loginBtn=driver.findElement(By.name("login"));
        loginBtn.click();
    }
}
