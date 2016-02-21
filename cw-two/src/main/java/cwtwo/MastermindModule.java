package cwtwo;


import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import cwtwo.colors.*;

import java.util.Arrays;
import java.util.List;

public class MastermindModule extends AbstractModule {

	@Override
	public void configure() {
		// TODO Auto-generated method stub
		
		bind(Game.class).to(Mastermind.class);
		bind(Greeter.class).to(GreeterImpl.class);
		bind(CodeGenerator.class).annotatedWith(CodeGenerator.Secret.class).to(SecretCodeGenerator.class);
		bind(CodeGenerator.class).annotatedWith(CodeGenerator.Feedback.class).to(FeedbackGenerator.class);
		bind(CodeGenerator.class).annotatedWith(CodeGenerator.Guess.class).to(GuessGenerator.class);
		bind(ColorBank.class);
		//All available colors in the game
		bind(new TypeLiteral<List<Colour>>() {}).
				toInstance(Arrays.asList(
					Blue.getInstance(),
					Red.getInstance(),
					Yellow.getInstance(),
					Purple.getInstance(),
					Orange.getInstance(),
					Green.getInstance()
					));
		//Right and Wrong Peg colors (currently: Black and White)
		bind(new TypeLiteral<Colour[]>() {}).
				toInstance(new Colour[]{
						White.getInstance(),
						Black.getInstance()
				});






	}

}
