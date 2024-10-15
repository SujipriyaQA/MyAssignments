package week1.day2;

public class Browser {

	public void launchBrowser(String browserName)
	{
		System.out.println("Browser "+browserName+" launched sucessfully");
	}
	public void loadUrl()
	{
		System.out.println("Application URL Loaded sucessfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser Obj1 = new Browser();
Obj1.launchBrowser("Chrome");	
Obj1.loadUrl();

	
	}

}
