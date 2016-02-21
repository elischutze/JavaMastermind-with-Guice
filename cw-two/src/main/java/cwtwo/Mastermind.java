package cwtwo;

import com.google.inject.Inject;


public class Mastermind extends MastermindAbstract  {

	@Inject
	ColorBank colorBank;

	
	@Inject
	public Mastermind(/*boolean showcode,*/ Greeter greeter,
					  @CodeGenerator.Secret CodeGenerator secret,
					  @CodeGenerator.Feedback CodeGenerator feedback,
					  @CodeGenerator.Guess CodeGenerator guess,
			 ColorBank colorBank
){

//		this.showCode=showcode;
		this.greeter = greeter;
		this.secretCodeGenerator = secret;
		this.feedbackGenerator = feedback;
		this.guessGenerator = guess;
		this.colorBank = colorBank;


	}

	@Override
	public void runGames() {
		// TODO Auto-generated method stub


		colorBank.fillColorBank();
		greeter.greet();
		secretCodeGenerator.generateCode(this.colorBank,this.turns,this.pegs);

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
