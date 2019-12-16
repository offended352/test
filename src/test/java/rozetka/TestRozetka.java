package rozetka;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.beans.Visibility;


public class TestRozetka {


    @Test
    public void findPhone() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver79");
        WebDriver driver = new ChromeDriver();

        driver.get("http://rozetka.com.ua");
        driver.findElement(By.name("search")).sendKeys("iphone xs 256");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://rozetka.com.ua/126813026/p126813026/']")));
        driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/126813026/p126813026/']")).click();

    }

    @Test
    public void findSSD() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver79");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Actions action = new Actions (driver);

        driver.get("http://rozetka.com.ua");

        WebElement linkMenu = driver.findElement(By.xpath("//a[@class='menu-categories__link']"));
        WebElement linkSSd = driver.findElement(By.xpath("//a[@class='menu__link'][contains(text(),'SSD')]"));
        action.moveToElement(linkMenu).perform();
        wait.until(ExpectedConditions.visibilityOfAllElements(linkSSd));
        linkSSd.click();

        driver.close();

    }

    @Test
    public void scanner() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver79");
        WebDriver driver = new ChromeDriver();



    }
}
