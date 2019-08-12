package application;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MBRQuestionController {
	
	@FXML private Button showAnswer;
	@FXML private Button showClue;
	@FXML private Label lblTimer;
	@FXML private Label lblQuestionPane;
	@FXML private Label lblTopic;
	@FXML private Label lblClue;
	@FXML private Label lblAnswer;
	private boolean setClueVisible=true;
	private boolean timerStarted;
	
	private int time=30;
	
	Timer timer;
	
	public void showClueClicked(ActionEvent ae)
	{
		lblAnswer.setVisible(false);
		lblClue.setVisible(setClueVisible);
		setClueVisible=!setClueVisible;
	}
	
	public void showAnswerClicked()
	{
		lblClue.setVisible(false);
		lblAnswer.setVisible(true);
		if(timerStarted)
		{
			timer.cancel();
			timerStarted=false;
		}
		String correctSoundPath=new File("src/sounds/correctsound.wav").getAbsolutePath();
		Media correctSoundMedia=new Media(new File(correctSoundPath).toURI().toString());
		MediaPlayer cmp=new MediaPlayer(correctSoundMedia);
		cmp.play();
		
	}
	
	public void backButtonClicked()
	{
		if(timerStarted)
		{
			timer.cancel();
			timerStarted=false;
		}
		
		time=31;
		BackstageController bc=new BackstageController();
		bc.startMixedBagRound();
	}
	
	public void showQuestion() {
		if(QuestionD.numberOnDice==1)
		{
			if(QuestionD.mixedBagCounter[0]<8) 
			{
			lblQuestionPane.setWrapText(true);
			lblClue.setWrapText(true);
			lblQuestionPane.setText(QuestionD.diceNumberOne[QuestionD.mixedBagCounter[0]][1]);
			lblTopic.setText(QuestionD.diceNumberOne[QuestionD.mixedBagCounter[0]][0]);
			lblAnswer.setText(QuestionD.diceNumberOne[QuestionD.mixedBagCounter[0]][2]);
			lblClue.setText(QuestionD.diceNumberOne[QuestionD.mixedBagCounter[0]][3]);
			}
		}
		else if(QuestionD.numberOnDice==2)
		{
			if(QuestionD.mixedBagCounter[1]<8)
			{
			lblQuestionPane.setWrapText(true);
			lblClue.setWrapText(true);
			lblQuestionPane.setText(QuestionD.diceNumberTwo[QuestionD.mixedBagCounter[1]][1]);
			lblTopic.setText(QuestionD.diceNumberTwo[QuestionD.mixedBagCounter[1]][0]);
			lblAnswer.setText(QuestionD.diceNumberTwo[QuestionD.mixedBagCounter[1]][2]);
			lblClue.setText(QuestionD.diceNumberTwo[QuestionD.mixedBagCounter[1]][3]);
		
			}
		}
		else if(QuestionD.numberOnDice==3)
		{
			if(QuestionD.mixedBagCounter[2]<8)
			{
			lblQuestionPane.setWrapText(true);
			lblClue.setWrapText(true);
			lblQuestionPane.setText(QuestionD.diceNumberThree[QuestionD.mixedBagCounter[2]][1]);
			lblTopic.setText(QuestionD.diceNumberThree[QuestionD.mixedBagCounter[2]][0]);
			lblAnswer.setText(QuestionD.diceNumberThree[QuestionD.mixedBagCounter[2]][2]);
			lblClue.setText(QuestionD.diceNumberThree[QuestionD.mixedBagCounter[2]][3]);
			}
		}
		else if(QuestionD.numberOnDice==4)
		{
			if(QuestionD.mixedBagCounter[3]<8)
			{
			lblQuestionPane.setWrapText(true);
			lblClue.setWrapText(true);
			lblQuestionPane.setText(QuestionD.diceNumberFour[QuestionD.mixedBagCounter[3]][1]);
			lblTopic.setText(QuestionD.diceNumberFour[QuestionD.mixedBagCounter[3]][0]);
			lblAnswer.setText(QuestionD.diceNumberFour[QuestionD.mixedBagCounter[3]][2]);
			lblClue.setText(QuestionD.diceNumberFour[QuestionD.mixedBagCounter[3]][3]);
			}
		}
		else if(QuestionD.numberOnDice==5)
		{
			if(QuestionD.mixedBagCounter[4]<8)
			{
			lblQuestionPane.setWrapText(true);
			lblClue.setWrapText(true);
			lblQuestionPane.setText(QuestionD.diceNumberFive[QuestionD.mixedBagCounter[4]][1]);
			lblTopic.setText(QuestionD.diceNumberFive[QuestionD.mixedBagCounter[4]][0]);
			lblAnswer.setText(QuestionD.diceNumberFive[QuestionD.mixedBagCounter[4]][2]);
			lblClue.setText(QuestionD.diceNumberFive[QuestionD.mixedBagCounter[4]][3]);
			}
		}
		else if(QuestionD.numberOnDice==6)
		{
			if(QuestionD.mixedBagCounter[5]<8)
			{
			lblQuestionPane.setWrapText(true);
			lblClue.setWrapText(true);
			lblQuestionPane.setText(QuestionD.diceNumberSix[QuestionD.mixedBagCounter[5]][1]);
			lblTopic.setText(QuestionD.diceNumberSix[QuestionD.mixedBagCounter[5]][0]);
			lblAnswer.setText(QuestionD.diceNumberSix[QuestionD.mixedBagCounter[5]][2]);
			lblClue.setText(QuestionD.diceNumberSix[QuestionD.mixedBagCounter[5]][3]);
			}
		}
	}
	public void setTimeUp()
	{
		String wrongSoundPath=new File("src/sounds/wrongsound.wav").getAbsolutePath();
		Media wrongSoundMedia=new Media(new File(wrongSoundPath).toURI().toString());
		MediaPlayer wmp=new MediaPlayer(wrongSoundMedia);
		wmp.play();
		lblQuestionPane.setText("TIME UP!");
		lblClue.setText("Sorry, time's up!");
	}
	
	
	@FXML
	public void timerStart()
	{
		timerStarted=true;
		timer = new Timer();
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
							setTimeUp();
					}
				});
				time--;
				if(time==0)
				{
					timerStarted=false;
					timer.cancel();
				}
			}
		};
		timer.scheduleAtFixedRate(decrementTime,0,1000l);
	}

}
