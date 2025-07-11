package assignment.day6;

public class BasePage {
	
	public void findElement(String elementName) {
        System.out.println("Finding element: " + elementName);
    }

    public void clickElement(String elementName) {
        System.out.println("Clicking on element: " + elementName);
    }

    public void enterText(String elementName, String text) {
        System.out.println("Entering text '" + text + "' into element: " + elementName);
    }

    public void performCommonTasks() {
        System.out.println("Performing common tasks in BasePage...");

    }
}
