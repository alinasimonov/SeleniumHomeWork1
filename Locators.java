package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        // instance
        WebDriver driver =new ChromeDriver();
        //navigate to the website
        driver.get("http://35.175.58.98/input-form-locator.php");
        //maximize the window
        driver.manage().window().maximize();

        //locate the WebElement
        WebElement firstName=driver.findElement(By.id("first_name"));
        //use send keys to send the data to webElement
        firstName.sendKeys("Alina");

        //lacate the webElement last name
        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("Simonov");

        //locate the webElement email
        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("alinasimonov1993@gmail.com");
        //locate the button and click on it
        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click();

        //locate the webElement LINK
        WebElement linkBtn=driver.findElement(By.linkText("Link"));
        linkBtn.click();

        //locate the WebElement click here using partial link text
        WebElement clickHere=driver.findElement(By.partialLinkText("Here."));
        clickHere.click();

    }
}
