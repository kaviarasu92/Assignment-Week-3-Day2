package assignment.day6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasePage bp=new BasePage();
		bp.clickElement("button");
		bp.findElement("id");
		bp.performCommonTasks();
		
		
		LoginPage lp=new LoginPage();
		lp.clickElement("button1");
		lp.findElement("new");
		lp.performCommonTasks();

	}

}
