package cwtwo;


import com.google.inject.Guice;
import com.google.inject.Injector;


public class MastermindDriver {

   //Main - Init injector and run the game 
    public static void main(String[] args) {

		//Create Guice injector
    	Injector injector = Guice.createInjector(new MastermindModule());


		//Get instance of Mastermind
    	Game mastermind = injector.getInstance(Game.class);

		//PLAY
    	mastermind.runGames();
    
    	
    }
}
