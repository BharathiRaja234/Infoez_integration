package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PomClass.PomClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
   public static WebDriverWait wait;	
	
	public static void browser_Launch() {
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://d2mojgetgp5xie.cloudfront.net/");
		driver.manage().window().maximize();
	}
	
	public static void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		
	}
	
    public static void jsclick(WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", element);
    }

	public static void sendKeys(WebElement element,String value) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(value);
	}
		
	public String gettext(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
		

	}
	public String getvalidation(WebElement element) {
		return element.getDomProperty("ValidationMessage");
		
		
	}
	public String  getattribute(WebElement element,String attributename) {
		return element.getDomAttribute(attributename);
		

	}
	public String gettextusingJS(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		    return (String) js.executeScript("return arguments[0].validationMessage;", element);
	}
	
	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}
	public static void scrolltoelement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);

	}
	
	public static  void scrollDown() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		

	}
		
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void elementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public static void visibleOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void visibleOfAllElement(List<WebElement> element) {
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public static void select(WebElement element, String value) {
		Select S = new Select(element);
		S.selectByVisibleText(value);
	}
	
	public static void iterateWebElement(List<WebElement> list, int size) {
		for(int i=0;i<size;i++) {
			try {
				Thread.sleep(3000);
			}catch (Exception e) {
				e.printStackTrace();
			}
//			String text = list.get(i).getText();
//			if(text.equalsIgnoreCase(option)) {
//				System.out.println("All the Option: "+option);
//			}else {
//				System.out.println("Correct option is not displayed");
//			}
			System.out.println(list.get(i).getText() + " | ");
 		    System.out.println();
			
		}
	}
	
	public String screenShot(WebDriver driver1, String scenario) {
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		String filePath =  System.getProperty("user.dir") + "/screenShot/" + scenario + " - " + timeStamp + ".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(filePath);
		try {
		    FileUtils.copyFile(src, des);
		}catch (Exception e) {
			throw new RuntimeException("SCreenshot not capture");
		}
		return filePath;
		
	}
	
//	public void hiddenButton(WebElement element) {
//		JavascriptExecutor js;
//		js.executeScript("arguments[0].click();", element);
//	}
	
	public static void selectRole(List<WebElement> list, int size, String option) {
		for(int i=0;i<size;i++) {
			try {
				Thread.sleep(3000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			String text = list.get(i).getText();
			if(text.equalsIgnoreCase(option)) {
				System.out.println("All the Option: "+option);
			}else {
				System.out.println("Correct option is not displayed");
			}
			
		}
	}
	
//	public void selectCategory(String heading) {
//		page_object_model.PomClass pom = new page_object_model.PomClass();
//		//Select S = new Select(pom.getRoleColumn());
//		int size = S.getOptions().size();
//		for(int i=0;i<size;i++) {
//		        String text = S.getOptions().get(i).getText();
//			if(text.equalsIgnoreCase(heading)) {
//				S.selectByVisibleText(text);
//				return;
//			}
//		}
//		throw new RuntimeException("Status option is not selected: "+heading);
//	
//	}

	// ---- integration helpers: switch between Customer / Admin sessions in one browser ----
//	public static void logout() {
//		js.executeScript("window.localStorage.clear(); window.sessionStorage.clear();");
//		driver.manage().deleteAllCookies();
//		driver.get(BASE_URL + "/");
//	}
//
//	public static void loginAs(String email, String password) {
//		logout();
//		driver.get(BASE_URL + "/login");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = 'email']")));
//		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(email);
//		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.xpath("(//button[text()='Sign in'])[2]")).click();
//		wait.until(ExpectedConditions.not(ExpectedConditions.urlContains("/login")));
//	}
//
	public static void uploadFile(WebElement fileInput, String relativePath) {
		String filePath = System.getProperty("user.dir") + File.separator + relativePath.replace("/", File.separator);
		fileInput.sendKeys(filePath);
	}
	    
	
	public boolean Category(String category) {
		PomClass pm =new PomClass(driver);
		Select s = new Select(pm.allcategories);
		List<WebElement> options = s.getOptions();
		
		for(WebElement option : options) {
			if(option.getText().trim().equalsIgnoreCase(category)) {
				return true;
			}
		}
		return false;
	}
	
	}



