package cwtwo;

import com.google.inject.Inject;


public class Mastermind extends MastermindAbstract  {
	

	
	@Inject
	public Mastermind(boolean showcode, Greeter greeter,
					  @CodeGenerator.Secret CodeGenerator secret,
					  @CodeGenerator.Feedback CodeGenerator feedback,
					  @CodeGenerator.Guess CodeGenerator guess){

		this.showCode=showcode;
		this.greeter = greeter;
		this.secretCodeGenerator = secret;
		this.feedbackGenerator = feedback;
		this.guessGenerator = guess;


	}

	@Override
	public void runGames() {
		// TODO Auto-generated method stub
		
		greeter.greet();

		//make secret code

		//take a guess
		//check the guess
		//provide feedback

		//repeat


		//you won! you lost :(
		//wanna play again?






		
	}

	@Override
	public void settings(Settings settings) {
		this.settings = settings;
		
	}

}
