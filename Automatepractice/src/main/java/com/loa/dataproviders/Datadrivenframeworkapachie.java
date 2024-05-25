package com.loa.dataproviders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrivenframeworkapachie {

    String[][] data = null;

    @DataProvider(name = "Logincredentls")
    public String[][] logindataprovider() throws IOException {
        data = getExcelData();
        return data;
    }

    public String[][] getExcelData() throws IOException {
        FileInputStream excelFile = new FileInputStream("C:\\Users\\admin\\Downloads\\adil.xlsx"); // Path to your Excel file
        Workbook workbook = new XSSFWorkbook(excelFile);
        Sheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        String[][] testData = new String[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                testData[i - 1][j] = cell.getStringCellValue();
            }
        }

        workbook.close();
        excelFile.close();

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

        WebElement loginbutton = driver.findElement(By.xpath("//button[text()='LOGIN']"));
        loginbutton.click();

        driver.quit();
    }
}
