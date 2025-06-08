package assignment.day6;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Button SubClass
		Button bn= new Button();
		bn.click();
		bn.Submit();
		
		//TextField SubClass
		TextField tf= new TextField();
		tf.setText("new");
		
		//Checkbox SubClass
		CheckBoxButton Cb= new CheckBoxButton();
		Cb.click();
		Cb.clickCheckButton();
		Cb.Submit();
		
		//RadioButton SubClass
		RadioButton rb= new RadioButton();
		rb.click();
		rb.Submit();
		rb.selectRadioButton();

	}

}
