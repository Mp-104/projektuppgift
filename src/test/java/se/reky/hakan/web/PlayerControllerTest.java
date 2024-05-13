package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Disabled
public class PlayerControllerTest {

    private ChromeDriver driver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp () {
        driver = new ChromeDriver();
        //driver.get("http://localhost:8080/players");
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

        assertEquals(2, elements.size());
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

        assertEquals("Players List", element);
    }

    @Test
    public void testButtonText () {
        driver.get("http://localhost:8080/players");
        WebElement element = driver.findElement(By.tagName("button"));

        assertEquals("Logga in", element.getText());

    }

    @Test
    public void testClickGetName () {
        driver.get("http://localhost:8080/players");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List <WebElement> elements = driver.findElements(By.tagName("a"));

        elements.get(0).click();

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

        assertTrue(element.isDisplayed());

        //top player has name "Max" and 119 experience
        assertEquals("Max", element.getText());

    }

    @Test
    public void testClickGetExperience () {
        driver.get("http://localhost:8080/players");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List <WebElement> elements = driver.findElements(By.tagName("a"));

        elements.get(0).click();

        List<WebElement> webElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("span")));

        webElements.get(2);

        assertEquals("119", webElements.get(2).getText());

    }


}
