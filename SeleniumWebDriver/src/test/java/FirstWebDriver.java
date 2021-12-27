import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class FirstWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement newPaste = driver.findElement(By.id("postform-text") );
        newPaste.sendKeys("Hello from WebDriver");
     WebElement tempPasteExpiration = driver.findElement(By.xpath("//*[@id=\"select2-postform-expiration-container\"]"));
     tempPasteExpiration.click();
     WebElement twoTempPasteExpiration =driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[2]/div/span/span[1]/span"));
     twoTempPasteExpiration.sendKeys(Keys.DOWN);
     twoTempPasteExpiration.sendKeys(Keys.DOWN);
     twoTempPasteExpiration.sendKeys(Keys.ENTER);
     WebElement pasteName = driver.findElement(By.xpath("//*[@id=\"postform-name\"]") );
     pasteName.sendKeys("helloweb");
     WebElement submit = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button"));
     submit.click();
     Thread.sleep(5000);
     // driver.quit();

       //Select PasteExpiration = new Select(driver.findElement(By.id("postform-expiration")));
      // List options = PasteExpiration.getOptions();
       // PasteExpiration.selectByIndex(2);
       // tempPasteExpiration.sendKeys(Keys.ENTER);



    }
}
