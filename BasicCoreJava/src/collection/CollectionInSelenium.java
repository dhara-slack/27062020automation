package collection;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionInSelenium {

	public static void main(String[] args) {
		
		ChromeDriver dr= new ChromeDriver();
		// list in selenium
		List<WebElement> list =  dr.findElements(By.xpath(" "));
		
		//set in selenium
        Set<String> win = dr.getWindowHandles();
        
	}

}
