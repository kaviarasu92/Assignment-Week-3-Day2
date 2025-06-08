package assignment.day6;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
        System.out.println("Performing login-specific tasks in LoginPage.");
        super.findElement("Username Field");
        super.enterText("Username Field", "admin");
        super.clickElement("Login Button");
        
	}

}
