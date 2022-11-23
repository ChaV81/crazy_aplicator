package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VueController {
	@FXML
	private Button btn0;
	
	@FXML
	private Button btn1;
	
	@FXML
	private Button btn2;
	
	@FXML
	private Button btn3;
	
	@FXML
	private Button btn4;
	
	@FXML
	private Button btn5;
	
	@FXML
	private Button btn6;
	
	@FXML
	private Button btn7;
	
	@FXML
	private Button btn8;
	
	@FXML
	private Button btn9;
	
	@FXML
	private Button dotBtn;
	
	@FXML
	private Button addBtn;
	
	@FXML
	private Button subBtn;
	
	@FXML
	private Button divBtn;
	
	@FXML
	private Button equalBtn;
	
	@FXML
	private Button multBtn;
	
	@FXML
	private TextField displayResult;
	
	ArrayList<String> listItems = new ArrayList<String>();
	Pattern p = Pattern.compile("[^/*+-]");
	String number1;
	String number2;
	String operator;
	
	
	public void getNumber(ActionEvent e) {
		Button source = (Button) e.getSource();
		Matcher m = p.matcher(displayResult.getText());
		boolean b = m.matches();
		if (!b) {
			displayResult.setText("");
		}
		displayResult.setText(displayResult.getText() + source.getText());
	}
	
	public void getOperator(ActionEvent e) {
		number1 = displayResult.getText();
		Button source = (Button) e.getSource();
		displayResult.setText("" + source.getText());
		operator = source.getText();
	}
	
	public void getResult() {
		number2 = displayResult.getText();
		System.out.println(number1 + operator + number2);
		Float result;
		switch (operator) {
		case "+": 
			result = Float.parseFloat(number1) + Float.parseFloat(number2);
			displayResult.setText(Float.toString(result));
			break;
		
		case "-": 
			result = Float.parseFloat(number1) - Float.parseFloat(number2);
			displayResult.setText(Float.toString(result));
			break;
		case "/": 
			result = Float.parseFloat(number1) / Float.parseFloat(number2);
			displayResult.setText(Float.toString(result));
			break;
		case "*": 
			result = Float.parseFloat(number1) * Float.parseFloat(number2);
			displayResult.setText(Float.toString(result));
			break;
		
		}
	}
}
