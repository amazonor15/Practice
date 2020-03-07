package allTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import allPages.HomePage;









public class HomePageTest {

	
	HomePage homePage = new HomePage();
	
	
	@Test
	public void titleValidation() {
		
		homePage.getDriver("chrome");
		homePage.url();
		String title= homePage.getTitle();
		
		//Assert.assertEquals(title, "Capital One");
		System.out.println(title);
	}
	
	@Test
	public void CCValidation() throws InterruptedException{
		
		homePage.getDriver("chrome");
		//Thread.sleep(2000);
		homePage.url();
		String value = homePage.clickCards();
		System.out.println(value);
		
		
		//Assert.assertEquals(value, "FIND A CREDIT CARD");
		
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
	homePage.teardown();
		
	}
	
	
	
}
