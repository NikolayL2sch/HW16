package application;

import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MyController implements Initializable{
	@FXML
	private Button button1;
	
	@FXML
	private Button button2;
	
	@FXML
	private Text txt1;
	
	@FXML
	private Text txt2;
	
	@FXML
	private Text txt3;
	
	@FXML
	private Text txt4;
	
	@FXML
	private Text txt5;
	
	@FXML
	private TextField txt6;
	
	@FXML
	private Text txt7;
	
	@FXML
	private Text txt8;
	
	public void initialize(URL location, ResourceBundle resources) {
		 
	       // TODO (don't really need to do anything here).
	      
	}
	// When user click on button1
	// this method will be called.
	public void action1(ActionEvent event) {
		int a = Integer.parseInt(txt6.getText());
		String b = Integer.toOctalString(a);
		txt8.setText(b);
	}
	public void action2(ActionEvent event) {
		int a = Integer.parseInt(txt6.getText());
		String b = Integer.toHexString(a);
		txt8.setText(b);
	}
	public void actionnonsolve(ActionEvent event) {
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		txt4.setText("");
	}
	public void actionnonsolve2(ActionEvent event) {
		txt1.setText("GOODBYE :'(");
		txt2.setText("GOODBYE :'(");
		txt3.setText("GOODBYE :'(");
		txt4.setText("GOODBYE :'(");
		txt5.setText("GOODBYE :'(");
		txt6.setText("GOODBYE :'(");
		txt7.setText("GOODBYE :'(");
		txt8.setText("GOODBYE :'(");
		
	}
}
