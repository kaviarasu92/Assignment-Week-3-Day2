package assignment.day6;

public class MainClass {
    public static void main(String[] args) {

        // Object of superclass
        TestData testData = new TestData();
        System.out.println("=== TestData Methods ===");
        testData.enterCredentials();
        testData.navigateToHomePage();

        // Object of subclass
        LoginTestData loginData = new LoginTestData();
        System.out.println("\n=== LoginTestData Methods ===");
        loginData.enterUsername();
        loginData.enterPassword();

        // Accessing inherited methods from superclass
        loginData.enterCredentials();
        loginData.navigateToHomePage();
    }
}
