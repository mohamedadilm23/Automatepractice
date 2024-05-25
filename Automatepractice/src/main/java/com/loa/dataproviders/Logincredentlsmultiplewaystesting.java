package com.loa.dataproviders;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Logincredentlsmultiplewaystesting {

    String[][] data = null;

    @DataProvider(name = "Logincredentls")
    public String[][] logindataprovider() throws BiffException, IOException {
        data = getexceldata();
        return data;
    }

    public String[][] getexceldata() throws IOException, BiffException {
        FileInputStream excel = new FileInputStream("C:\\Users\\admin\\Downloads\\adil.xls");
        Workbook workbook = Workbook.getWorkbook(excel);
        Sheet sheet = workbook.getSheet(0);
        int rowCount = sheet.getRows();
        int colCount = sheet.getColumns();

        String[][] testData = new String[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                testData[i - 1][j] = sheet.getCell(j, i).getContents();
            }
        }

        return testData;
    }

    @Test(dataProvider = "Logincredentls")
    public void main(String email1, String password2) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Automatepractice\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/");
        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement name = driver.findElement(By.name("email"));
        name.sendKeys(email1);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(password2);

        WebElement loginbutton = driver.findElement(By.xpath("//button[.='LOGIN']"));
        loginbutton.click();

        driver.quit();
    }
}
