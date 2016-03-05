package cwtwo.tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

import cwtwo.CodeGenerator;
import cwtwo.CodeGenerator.Secret;
import cwtwo.Displayer;
import cwtwo.FeedbackGenerator;
import cwtwo.Game;
import cwtwo.Greeter;
import cwtwo.GreeterImpl;
import cwtwo.Mastermind;
import cwtwo.MastermindDisplayer;
import cwtwo.MastermindModule;
import cwtwo.SecretCodeGenerator;
import cwtwo.Turns;
import cwtwo.colors.Black;


public class GuiceTest {
	
	
	Injector injector = Guice.createInjector(new MastermindModule());
	
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
/**
*  Below are the bindings of the GuiceModel.
*/
	
// These are the tests for the Game binding.	

	@Test
	public void testGuiceBindingGameCorrect() {
		assertEquals(Mastermind.class,injector.getInstance(Game.class).getClass());
	}
	
	@Test
	public void testGuiceBindingGameInCorrect() {
		assertThat(Game.class, not(equalTo(injector.getInstance(Game.class).getClass())));
	}
	
	// These are the tests for the Greeting binding.	

	@Test
	public void testGuiceBindingGreetingCorrect() {
		assertEquals(GreeterImpl.class,injector.getInstance(Greeter.class).getClass());
	}
		
	@Test
	public void testGuiceBindingGreetingInCorrect() {
		assertThat(Greeter.class, not(equalTo(injector.getInstance(Greeter.class).getClass())));
	}	
				
	// These are the tests for the Displayer binding.	

	@Test
	public void testGuiceBindingDisplayerCorrect() {
		assertEquals(MastermindDisplayer.class,injector.getInstance(Displayer.class).getClass());
	}
	
	@Test
	public void testGuiceBindingDisplayerInCorrect() {
		assertThat(Displayer.class, not(equalTo(injector.getInstance(Displayer.class).getClass())));
	}		
	
	
	
// These are the tests for the SecretCode Generator.		
	
	@Test
	public void testGuiceBindingCodeGeneratorCorrect() {;
		assertEquals(SecretCodeGenerator.class,injector.getInstance(Key.get(CodeGenerator.class,CodeGenerator.Secret.class)).getClass());
	}
	
	@Test
	public void testGuiceBindingCodeGeneratorInCorrect() {
		assertThat(FeedbackGenerator.class, not(equalTo(injector.getInstance(Key.get(CodeGenerator.class,CodeGenerator.Secret.class)).getClass())));
	}
	


	// These are the tests for the Binding of the Turn.		
	
		@Test
		public void testGuiceBindingTurnCorrect() {;
			assertEquals(12,injector.getInstance(Key.get(Integer.class,Turns.class)));
		}	
	
	/*
	 * To do items"
	 *  - Go to Mastermind module and ensure that for every bind we have a set of two tests like the one above, pending on the type of
	 *  binding.
	 * 
	 */
	
}
