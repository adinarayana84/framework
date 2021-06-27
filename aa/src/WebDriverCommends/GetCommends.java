package WebDriverCommends;

public class GetCommends {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chorme.driver","C:\\Users\\Admin\\Downloads\\ChromeDriver.exe");
		Webdriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");//open the URL
		System.out.prientln(driver.getTitle());//returns the title of the page
		System.out.prientln(driver.getCurrentUrl());//returns the URL
		String text=driver.findElement(By.xpath("")).getText();//finding the webText in the web element geting the element store in the text variable
        System.out.println(text);
		driver.close();
		driver.quit();
		
	}

}
