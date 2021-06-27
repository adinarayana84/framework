package WebDriverCommends;

public class NavigateCommends {

	public static void main(String[] args) {
		// Navigate Commends
		System.setProperty("webdriver.chorme.driver","C:\\Users\\Admin\\Downloads\\ChromeDriver.exe");
		Webdriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");//open the URL
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
