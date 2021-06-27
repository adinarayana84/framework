package WebDriverCommends;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionCommends {

	public static void main(String[] args) {
		// ConditionCommands
		System.setProperty("webdriver.chorme.driver","C:\\Users\\Admin\\Downloads\\ChromeDriver.exe");
		Webdriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");//open the URL
		WebElement email=driver.findElement(By.xpath());
		WebElement pass=driver.findElement(By.xpath());
		
		if("email.isDisplayed" && "email.isEnabled") {
			
			email.sendKeys("adi@123");
			
		}if ("pass.isDisplayed") && ("Pass.isEnabled")){
			pass.sendKeys(adi232);
			
		}
		System.out.println(driver.findElement(By.xpath(".....")).isSelected();
		System.out.println(driver.findElement(By.xpath("......")).isSelected();
		//select female radio button
		if(driver.findElement(By.xpath(".....").isSelected==false))){
			driver.findElement(By.xpath(".....").isSelected==false)).click();
		
		}
	}

}
