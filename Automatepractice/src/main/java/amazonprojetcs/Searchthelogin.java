package amazonprojetcs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Searchthelogin {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Set the path for the WebDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\git\\Automatepractice\\Automatepractice\\driver\\chromedriver.exe"); // Replace with the actual path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public void navigateToAmazonPage() {
		String url = "https://www.amazon.in/";

		if (!driver.getCurrentUrl().equals(url)) {
			driver.get(url);
		}
	}

	@Test
	public void amazonSearch() {
		String product = "laptop"; // Example product for search, you can parameterize this as needed

		try {
			navigateToAmazonPage(); // Navigate to Amazon before searching

			WebElement amazonSearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			Assert.assertTrue(amazonSearchBox.isDisplayed(), "Failed: Amazon Search Box is not Present");

			amazonSearchBox.click();
			amazonSearchBox.sendKeys(product);

			WebElement amazonSearchbtn = driver.findElement(By.id("nav-search-submit-button"));
			amazonSearchbtn.click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-color-state a-text-bold']")));

			WebElement verifyAmazonResultPage = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
			Assert.assertTrue(verifyAmazonResultPage.isDisplayed(), "Failed: Searched Keyword is not present in Amazon result page");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void listProductTitles() throws InterruptedException {
		try {
			navigateToAmazonPage(); // Navigate to Amazon before listing products
			amazonSearch(); // Perform a search before listing products

			List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

			for (int i = 0; i < 5 && i < list.size(); i++) { // to print first 5 Product Titles
				String listitem = list.get(i).getText();
				Assert.assertFalse(listitem.isEmpty(), "Product title is empty");
				System.out.println("Product Title :" + listitem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
