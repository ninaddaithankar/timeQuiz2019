package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MixedBagController {
	
	
	
	@FXML
	public void startQuestionScene(ActionEvent ae) throws IOException
	{
		Button clickedButton=(Button)ae.getSource();
		if(clickedButton.getText().equals("1"))
		{
			QuestionD.numberOnDice=1;
			QuestionD.mixedBagCounter[0]++;
		}
		else if(clickedButton.getText().equals("2"))
		{
			QuestionD.mixedBagCounter[1]++;
			QuestionD.numberOnDice=2;
		}
		else if(clickedButton.getText().equals("3"))
		{
			QuestionD.mixedBagCounter[2]++;
			QuestionD.numberOnDice=3;
		}
		else if(clickedButton.getText().equals("4"))
		{
			QuestionD.mixedBagCounter[3]++;
			QuestionD.numberOnDice=4;
		}
		else if(clickedButton.getText().equals("5"))
		{
			QuestionD.mixedBagCounter[4]++;
			QuestionD.numberOnDice=5;
		}
		else if(clickedButton.getText().equals("6"))
		{
			QuestionD.mixedBagCounter[5]++;
			QuestionD.numberOnDice=6;
		}
		
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MBRQuestionScene.fxml"));
	     Parent root = loader.load();
		 Scene newScene=new Scene(root);
		 newScene.getStylesheets().add(getClass().getResource("/view/MBRQuestionScene.css").toExternalForm());
	     MBRQuestionController controller = loader.getController();
	     controller.showQuestion();
	    
		 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
		 
		 window.setScene(newScene);
		 window.setMaximized(true);
		
	}
	
	public void backButtonClicked()
	{
		for(int i=0;i<QuestionD.mixedBagCounter.length;i++)
			QuestionD.mixedBagCounter[i]=-1;
		BackstageController bc=new BackstageController();
		bc.startHomeScreen();
	}

	
	

}
