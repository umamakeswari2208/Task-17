package guvi.task17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {

    @SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
    	
    		WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();

            driver.get("https://www.snapdeal.com/login");

            WebElement userNameField = driver.findElement(By.id("userName"));
            userNameField.sendKeys("work4uma@gmail.com");
           
            WebElement loginButton = driver.findElement(By.id("checkUser"));
            loginButton.click();
            WebElement loginUsingOtp = driver.findElement(By.id("loginUsingOtp"));
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            String url = driver.getCurrentUrl();
            if (url.equals("https://www.snapdeal.com/login")) {
                System.out.println("Login successful! Verification message: User is logged in.");
            } else {
                System.out.println("Login failed! Verification message: User is not logged in.");
            }
            
            // Close the browser
            driver.quit();
        }
    }