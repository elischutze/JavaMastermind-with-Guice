package cw2;

public class GreeterImpl implements Greeter {

	
	private String greeting = "Testing testing";
	
	public void setGreeting(int numPegs, String[] colors,int turns){
	
	this.greeting = "Welcome to Mastermind. \n This is a text version of the classic board game Mastermind.\n ";
//			+ "The computer will think of a secret code. The code consists of " + numPegs + " colored pegs. "
//					+ "The pegs may be one of six colors: " + colors + "."
//					+ "A color may appear more than once in the code."
//					+ "You try to guess what colored pegs are in the code and what order they are in"
//					+ "After making a guess the result will be displayed."
//					+ "A result consists of a black peg for each peg you have exactly correct (color and position) in your guess."
//					+ "For each peg in the guess that is the correct color, but is out of position, you get a white peg."
//					+ "Only the first letter of the color is displayed. B for Blue, R for Red, and so forth."
//					+ "When entering guesses you only need to enter the first character of the color as a capital letter."
//					+ ""
//					+ "You have" + turns + " turns to guess the answer or you lose the game.";
	}
	
	@Override
	public void greet() {
		System.out.println(greeting);
	}

}
