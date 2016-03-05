package cwtwo;

import com.google.inject.Inject;
import cwtwo.colors.Colour;

import java.util.List;
import java.util.Scanner;


public class Mastermind extends MastermindAbstract  {

	@Inject
	ColorBank colorBank;


	@Inject
	public Mastermind(/*boolean showcode,*/ Greeter greeter,
			@CodeGenerator.Secret CodeGenerator secret,
			@CodeGenerator.Feedback CodeComparator feedback,
			@CodeGenerator.Guess CodeGenerator guess,
			Displayer displayer,
			ColorBank colorBank
			){
		this.greeter = greeter;
		this.secretCodeGenerator = secret;
		this.feedbackGenerator = feedback;
		this.guessGenerator = guess;
		this.colorBank = colorBank;
		this.displayer = displayer;
		this.showCode=false;
	}

	@Override
	public void runGames() {
		// TODO Auto-generated method stub
		//Initialize
		colorBank.fillColorBank();
		greeter.greet();
		this.secretCode=secretCodeGenerator.generateCode(this.colorBank,this.pegs);
		displayer.setSecretcode(this.secretCode);
		System.out.println("Show the secret code? (Y/N) ");
		Scanner scanner = new Scanner(System.in);
		String flag;
		flag = scanner.next();
		System.out.println(flag.getClass());
		Boolean hasSetShowCode = false;

		while(!hasSetShowCode){
			if (flag.equals("Y")){
				this.showCode = true;
				hasSetShowCode = true;
				System.out.println("The secret code is: ");
				displayer.displayCode(this.secretCode);
				System.out.println("\n");
			}else if (flag.equals("N")){
				hasSetShowCode = true;
			} else {
				System.out.println("Whoops! Please input only Y or N!");
				flag = scanner.next();
			}
		}

		//Loops thru TURNS
		for(int i=0;i<=turns;i++){
			//add users guess to guesses list
			this.guesses.add(guessGenerator.generateCode(this.colorBank,this.pegs));
			//tell feedback Generator what codes to compare
			feedbackGenerator.useCodes(this.secretCode,this.guesses.get(this.guesses.size()-1));
			//add feedback to list of feedbacks
			this.feedback.add(feedbackGenerator.generateCode(this.colorBank, this.pegs));

			if(hasWon()){


				System.out.println("YOU WON!! YAYY");
				//exit game, congratulate them
				break;
			}

			displayer.setFeedback(this.feedback);
			displayer.setGuesses(this.guesses);
			displayer.displayGame();
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

	public boolean hasWon(){

		List<Colour> latestFeedback = this.feedback.get( this.feedback.size()-1 ).getCode();
		if(latestFeedback.size()!=this.pegs){
			return false;
		}

		Code winCode = new CodeConcrete();
		for(int i = 0;i<this.pegs;i++){
			winCode.addPeg(this.colorBank.getRight());
		}

		for(int j = 0;j<this.pegs;j++){

			if(latestFeedback.get(j)!=winCode.getCode().get(j)){
				return false;
			}

		}

		return true;

	}
}
