////package com.example;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.testng.annotations.AfterTest;
////import org.testng.annotations.BeforeTest;
////import org.testng.annotations.Test;
////
////
////public class NewTest {
////	WebDriver wd=null;	
////	@BeforeTest
////	public void init() {
////		 
////		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
////
////	    //create an object to the driver to access the browser componenets 
////	    	wd=new ChromeDriver();
////	    	//maximize the browser 
////	    	wd.manage().window().maximize();
////	wd.get("http://localhost:8080/book_register");
////	}
////
////		@Test
////		public void test1() {
////			wd.findElement(By.name("name")).sendKeys("plants");
////			wd.findElement(By.name("author")).sendKeys("mahesh");
////			wd.findElement(By.name("price")).sendKeys("50");
////			wd.findElement(By.name("submit")).submit();
////			
////		}
////		
////		@AfterTest
////		public void close() {
////			wd.close();
////		}
////
////	}
//package com.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class NewTest {
//	WebDriver wd=null;	
//@BeforeTest	
//	public void init() {
//	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mahes\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
//    //create an object to the driver to access the browser componenets 
//    	 wd=new ChromeDriver();
//    	//maximize the browser 
//    	wd.manage().window().maximize();
//}
//  @Test
//  public void f1() {
//	  
//	    	wd.get("http://localhost:8080/book_register");
//	    	wd.findElement(By.name("name")).sendKeys("karthik");
//	    	wd.findElement(By.id("author")).sendKeys("1234566789");
//	    	wd.findElement(By.id("price")).sendKeys("k@c.c");
//	    	wd.findElement(By.name("submit")).submit();	    	
//  }
//  
//  @Test
//  public void f2() {	
//	    	wd.get("https://www.google.com/");
//	    	
//  }
//   
//  @AfterTest
//  public void close() {
//	  wd.close();
//  }
//}
//
