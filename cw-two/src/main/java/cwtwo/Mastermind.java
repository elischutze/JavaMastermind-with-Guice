package cwtwo;

import com.google.inject.Inject;


public class Mastermind extends MastermindAbstract  {

	@Inject
	ColorBank colorBank;

	
	@Inject
	public Mastermind(/*boolean showcode,*/ Greeter greeter,
					  @CodeGenerator.Secret CodeGenerator secret,
					  @CodeGenerator.Feedback CodeComparator feedback,
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
		//Initialize
		colorBank.fillColorBank();
		greeter.greet();
		this.secretCode=secretCodeGenerator.generateCode(this.colorBank,this.pegs);
		
		System.out.println("Secret: "+this.secretCode.getCode().toString());
		//First attempt
		for(int i=0;i<=turns;i++){
        this.guesses.add(guessGenerator.generateCode(this.colorBank,this.pegs));
        feedbackGenerator.compareCodes(this.secretCode,this.guesses.get(this.guesses.size()-1));
		this.feedback.add(feedbackGenerator.generateCode(this.colorBank, this.pegs));
		System.out.println(this.feedback.get(this.feedback.size()-1).getCode().toString());
		
		
		Displayer test = new MastermindDisplayer(this.secretCode,this.guesses,this.feedback);
		test.displayGame();
		
		System.out.println("guess again");
		}
	
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
