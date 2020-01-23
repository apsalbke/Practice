package Selenium;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_SearchAmazon_CssSelector {
    public static void main(String[] args) {

//        TC#1 Search Amazon
//        1. Open browser
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to https://amazon.com
        driver.get("https://amazon.com");

//        3. Enter any search term//name="field-keywords"
        WebElement amazonSearchBox =driver.findElement(By.cssSelector("input[name='field-keywords']"));
        amazonSearchBox.sendKeys("toys for girls");

//        4. Click search button
        WebElement amazonSearButton= driver.findElement(By.cssSelector("input[tabindex='20']"));
        amazonSearButton.click();
//        5. Verify title contains the search term
//        USE CSS SELECTOR TO LOCATE WEBELEMENTS
        String actualTitle = driver.getTitle();
        String expectedInTitle = "toys for girls";

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Passed");

        }else {
            System.out.println("failed");
        }
    }
}