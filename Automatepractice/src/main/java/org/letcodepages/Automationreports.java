package org.letcodepages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.observer.entity.MediaEntity;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Automationreports {

	public static void main(String[] args) {
		//blank html pages
		ExtentSparkReporter spark = new ExtentSparkReporter("./testreports.html");
		//reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
	ExtentTest test=extent.createTest("TD001-Search the product");
	test.assignAuthor("mohamedadil");
	test.assignCategory("regression status");
	test.pass("login the amazon website");
	test.pass("search the product");
	test.pass("add to the cart");
	test.pass("billing to purchase the cart");
	
	
	ExtentTest test1=extent.createTest("TD002-purchase the product");
	test1.pass("login the amazon website");
	test1.pass("search the purchase to like");
	test1.pass("add to the shop");
	test1.pass("payment completed");
	test1.fail("error toater along this code");
	test1.pass("payment loading is processing",MediaEntityBuilder.createScreenCaptureFromPath("file:///C:/Users/admin/eclipse-workspace/Automatepractice/screenshot/img.png")
			.build())
			;
	
	extent.flush();
		
		
	}

}
