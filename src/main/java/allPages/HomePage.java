package allPages;

public class HomePage extends Generic{
	
	
	String creditCrad= "xpath://span[text()='Credit Cards']";
	String findCard = "xpath:(//button[@role='heading'])[2]";
	
	
	public void url() {
		getUrl("https://www.capitalone.com/");
	}
	
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	public String clickCards() throws InterruptedException {
		
		mousHover(creditCrad);
		Thread.sleep(2);
		return findElement(creditCrad).getText();
	}
	
}
