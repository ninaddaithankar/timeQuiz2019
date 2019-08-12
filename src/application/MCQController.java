package application;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class MCQController {
	
	Timer timer;
	@FXML private Button btnStart;
	@FXML private Button btnOptionA;
	@FXML private Button btnOptionB;
	@FXML private Button btnOptionC;
	@FXML private Button btnOptionD;
	@FXML private Label lblTextQuestionPane;
	@FXML private Label lblImageQuestionPane;
	@FXML private Label lblTimer;
	@FXML private AnchorPane optionsPane;
	@FXML private ImageView questionImage;
	@FXML private Button revealOptions;
	
	private Media correctSoundMedia,wrongSoundMedia;
	private MediaPlayer cmp,wmp;
	
	private int time=26;
	private static int click=0;
	
	
	@FXML
	public void startRound()
	{
		lblTextQuestionPane.setWrapText(true);
		lblImageQuestionPane.setWrapText(true);
		btnStart.setVisible(false);
		displayQuestionAndAnswers();
	}
	
	@FXML
	public void revealOptionsClicked()
	{
		revealOptions.setVisible(false);
		optionsPane.setVisible(true);
		lblTimer.setText("45");
		timerStart();
	}
	
	@FXML
	public void nextButtonClicked(ActionEvent ae)
	{
		if(QuestionD.counter<3)
		{
			timer.cancel();
			time=26;
			click=0;
			QuestionD.counter++;
			lblTextQuestionPane.setVisible(false);
			optionsPane.setVisible(false);
			lblImageQuestionPane.setVisible(false);
			questionImage.setVisible(false);
			displayQuestionAndAnswers();
			repaintOriginal(btnOptionA);
			repaintOriginal(btnOptionB);
			repaintOriginal(btnOptionC);
			repaintOriginal(btnOptionD);
			if(QuestionD.counter==3)
			{
				Button next=(Button)ae.getSource();
				next.setVisible(false);
			}
		}
	}
	
	@FXML
	public void backButtonClicked()
	{
		timer.cancel();
		time=26;
		click=0;
		QuestionD.counter=0;
		BackstageController bc=new BackstageController();
		bc.startTakeYourPickRound();
		QuestionD.standard=0;
	}
	
	public void displayQuestionAndAnswers()
	{
		if(QuestionD.standard==1)
		{
			if(QuestionD.que_First[QuestionD.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(QuestionD.que_First[QuestionD.counter][0]);
				btnOptionA.setText(QuestionD.opt_First[QuestionD.counter][0]);
				btnOptionB.setText(QuestionD.opt_First[QuestionD.counter][1]);
				btnOptionC.setText(QuestionD.opt_First[QuestionD.counter][2]);
				btnOptionD.setText(QuestionD.opt_First[QuestionD.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(QuestionD.que_First[QuestionD.counter][2]));
				lblImageQuestionPane.setText(QuestionD.que_First[QuestionD.counter][0]);
				btnOptionA.setText(QuestionD.opt_First[QuestionD.counter][0]);
				btnOptionB.setText(QuestionD.opt_First[QuestionD.counter][1]);
				btnOptionC.setText(QuestionD.opt_First[QuestionD.counter][2]);
				btnOptionD.setText(QuestionD.opt_First[QuestionD.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
		else if(QuestionD.standard==2)
		{
			if(QuestionD.que_Second[QuestionD.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(QuestionD.que_Second[QuestionD.counter][0]);
				btnOptionA.setText(QuestionD.opt_Second[QuestionD.counter][0]);
				btnOptionB.setText(QuestionD.opt_Second[QuestionD.counter][1]);
				btnOptionC.setText(QuestionD.opt_Second[QuestionD.counter][2]);
				btnOptionD.setText(QuestionD.opt_Second[QuestionD.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(QuestionD.que_Second[QuestionD.counter][2]));
				lblImageQuestionPane.setText(QuestionD.que_Second[QuestionD.counter][0]);
				btnOptionA.setText(QuestionD.opt_Second[QuestionD.counter][0]);
				btnOptionB.setText(QuestionD.opt_Second[QuestionD.counter][1]);
				btnOptionC.setText(QuestionD.opt_Second[QuestionD.counter][2]);
				btnOptionD.setText(QuestionD.opt_Second[QuestionD.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
		else if(QuestionD.standard==3)
		{
			if(QuestionD.que_Third[QuestionD.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(QuestionD.que_Third[QuestionD.counter][0]);
				btnOptionA.setText(QuestionD.opt_Third[QuestionD.counter][0]);
				btnOptionB.setText(QuestionD.opt_Third[QuestionD.counter][1]);
				btnOptionC.setText(QuestionD.opt_Third[QuestionD.counter][2]);
				btnOptionD.setText(QuestionD.opt_Third[QuestionD.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(QuestionD.que_Third[QuestionD.counter][2]));
				lblImageQuestionPane.setText(QuestionD.que_Third[QuestionD.counter][0]);
				btnOptionA.setText(QuestionD.opt_Third[QuestionD.counter][0]);
				btnOptionB.setText(QuestionD.opt_Third[QuestionD.counter][1]);
				btnOptionC.setText(QuestionD.opt_Third[QuestionD.counter][2]);
				btnOptionD.setText(QuestionD.opt_Third[QuestionD.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
		else if(QuestionD.standard==4)
		{
			if(QuestionD.que_Fourth[QuestionD.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(QuestionD.que_Fourth[QuestionD.counter][0]);
				btnOptionA.setText(QuestionD.opt_Fourth[QuestionD.counter][0]);
				btnOptionB.setText(QuestionD.opt_Fourth[QuestionD.counter][1]);
				btnOptionC.setText(QuestionD.opt_Fourth[QuestionD.counter][2]);
				btnOptionD.setText(QuestionD.opt_Fourth[QuestionD.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(QuestionD.que_Fourth[QuestionD.counter][2]));
				lblImageQuestionPane.setText(QuestionD.que_Fourth[QuestionD.counter][0]);
				btnOptionA.setText(QuestionD.opt_Fourth[QuestionD.counter][0]);
				btnOptionB.setText(QuestionD.opt_Fourth[QuestionD.counter][1]);
				btnOptionC.setText(QuestionD.opt_Fourth[QuestionD.counter][2]);
				btnOptionD.setText(QuestionD.opt_Fourth[QuestionD.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
	}
	
	@FXML
	public void optionClicked(ActionEvent ae)
	{
		click++;
		Button clickedOption=(Button)ae.getSource();
		QuestionD.selectedOption=clickedOption.getText();
		boolean answer=QuestionD.checkAnswer();
		if(MCQController.click==1)
		{
			if(answer==true)
			{
				repaintTrue(clickedOption);
				playCorrectSound();
				timer.cancel();
			}
			else 
			{
				repaintFalse(clickedOption);
				playWrongSound();
			}
		}
		else
		{
			if(answer==true)
			{
				repaintTrue(clickedOption);
				playCorrectSound();
				timer.cancel();
			}
			else 
			{
				timer.cancel();
				displayCorrectOption();
				repaintFalse(clickedOption);
				playWrongSound();
			}
		}
	}
	
	public void displayCorrectOption()
	{
		if(!(QuestionD.correctOption.equals(QuestionD.selectedOption)))
		{
			if(btnOptionA.getText()==QuestionD.correctOption)
			{
				repaintTrue(btnOptionA);
			}
			else if(btnOptionB.getText().equals(QuestionD.correctOption))
			{
				repaintTrue(btnOptionB);
			}
			else if(btnOptionC.getText().equals(QuestionD.correctOption))
			{
				repaintTrue(btnOptionC);
			}
			else if(btnOptionD.getText().equals(QuestionD.correctOption))
			{
				repaintTrue(btnOptionD);
			}
		}
	}
	
	

	private void playWrongSound() {
		String wrongSoundPath=new File("src/sounds/wrongsound.wav").getAbsolutePath();
		wrongSoundMedia=new Media(new File(wrongSoundPath).toURI().toString());
		wmp=new MediaPlayer(wrongSoundMedia);
		wmp.play();
	}

	private void repaintFalse(Button clickedOption) {
		clickedOption.setStyle("-fx-font-size: 45px;\r\n" + 
				"	-fx-font-family:  Merriweather;\r\n" + 
				"	-fx-font-weight: bold;\r\n" + 
				"	-fx-background-color: #54FFE5, linear-gradient(#D91E36 10%, #FF787C 50%, #D91E36 100%) ;\r\n" + 
				"	-fx-border-radius: 15.0px ;\r\n" + 
				"	-fx-background-radius: 15.0px;\r\n" + 
				"	-fx-text-fill: #1C2541; \r\n" + 
				"	-fx-effect: dropshadow( gaussian , rgba(60,60,60,1.0), 30, 0.5 , 2 , 2 );");
	}

	private void repaintTrue(Button clickedOption) {
		clickedOption.setStyle("-fx-font-size: 45px;\r\n" + 
				"	-fx-font-family:  Merriweather;\r\n" + 
				"	-fx-font-weight: bold;\r\n" + 
				"	-fx-background-color: #54FFE5, linear-gradient(#60993E 10%, #96E8BC 50%, #60993E 100%) ;\r\n" + 
				"	-fx-border-radius: 15.0px ;\r\n" + 
				"	-fx-background-radius: 15.0px;\r\n" + 
				"	-fx-text-fill: #1C2541; \r\n" + 
				"	-fx-effect: dropshadow( gaussian , rgba(60,60,60,1.0), 30, 0.5 , 2 , 2 );");
	}
	
	private void repaintOriginal(Button button)
	{
		button.setStyle("-fx-font-size: 45px;\r\n" + 
				"	-fx-font-family:  Merriweather;\r\n" + 
				"	-fx-font-weight: bold;\r\n" + 
				"	-fx-background-color: #54FFE5, linear-gradient(#52B7B5 10%, #54FFE5 50%, #52B7B5 100%) ;\r\n" + 
				"	-fx-border-radius: 15.0px ;\r\n" + 
				"	-fx-background-radius: 15.0px;\r\n" + 
				"	-fx-text-fill: #1C2541; \r\n" + 
				"	-fx-effect: dropshadow( gaussian , rgba(60,60,60,1.0), 30, 0.5 , 2 , 2 );");
	}

	private void playCorrectSound() {
		
		String correctSoundPath=new File("src/sounds/correctsound.wav").getAbsolutePath();
		correctSoundMedia=new Media(new File(correctSoundPath).toURI().toString());
		cmp=new MediaPlayer(correctSoundMedia);
		cmp.play();
	}

	private void setTimeUp()
	{
		String wrongSoundPath=new File("src/sounds/wrongsound.wav").getAbsolutePath();
		Media wrongSoundMedia=new Media(new File(wrongSoundPath).toURI().toString());
		MediaPlayer wmp=new MediaPlayer(wrongSoundMedia);
		wmp.play();
		if(QuestionD.standard==1)
		{
			if(QuestionD.que_First[QuestionD.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
		else if(QuestionD.standard==2)
		{
			if(QuestionD.que_Second[QuestionD.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
		else if(QuestionD.standard==3)
		{
			if(QuestionD.que_Third[QuestionD.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
		else if(QuestionD.standard==4)
		{
			if(QuestionD.que_Fourth[QuestionD.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
	}
	
	@FXML
	public void timerStart()
	{
		timer=new Timer();
		TimerTask decrementTime=new TimerTask() {
			@Override
			public void run() 
			{
				Platform.runLater(new Runnable()
				{
					@Override
					public void run() 
					{
						if(time<10)
							lblTimer.setText("0"+time);
						else
							lblTimer.setText(""+time);
						if(time==0)
						{
							setTimeUp();
							
						}
					}
				});
				time--;
				if(time==0)
				{
					timer.cancel();
					
				}
			}
		};
		timer.scheduleAtFixedRate(decrementTime,0,1000l);
	}

}
