package cw2;

import com.google.inject.Inject;

public class Mastermind extends MastermindAbstract  {
	
	
	
	@Inject
	public Mastermind(/*boolean showcode,*/Greeter greeter){
//		this.showCode=showcode;	
		this.greeter = greeter;
		
		
		
		
		
	}

	@Override
	public void runGames() {
		// TODO Auto-generated method stub
		
		greeter.greet();
		
	}

	@Override
	public void settings(Settings settings) {
		this.settings = settings;
		
	}

}
