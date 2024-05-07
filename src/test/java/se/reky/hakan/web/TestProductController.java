package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Disabled
public class TestProductController {

    ChromeDriver driver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp () {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown () {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testPlayerAmount () {
        driver.get("http://localhost:8080/players");
        List<WebElement> elements = driver.findElements(By.tagName("li"));

        Assertions.assertEquals(2, elements.size());
    }

    @Test
    public void testPlayerDisplayed () {
        driver.get("http://localhost:8080/players");
        WebElement element = driver.findElement(By.tagName("li"));

        assertTrue(element.isDisplayed());
    }

    @Test
    public void testTitle () {
        driver.get("http://localhost:8080/players");
        String element = driver.getTitle();

        Assertions.assertEquals("Players List", element);
    }

    @Test
    public void testButton () {
        driver.get("http://localhost:8080/players");
        WebElement element = driver.findElement(By.tagName("button"));

        Assertions.assertEquals("Logga in", element.getText());

    }

    @Test
    public void testClick () {
        driver.get("http://localhost:8080/players");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List <WebElement> elements = driver.findElements(By.tagName("a"));

        elements.get(0).click();

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

        assertTrue(element.isDisplayed());

        assertEquals("Max", element.getText());

    }


}
