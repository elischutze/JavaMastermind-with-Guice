package cwtwo;


import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import cwtwo.colors.*;

import java.util.Arrays;
import java.util.List;

public class MastermindModule extends AbstractModule {

	@Override
	public void configure() {

		
		bind(Game.class).to(Mastermind.class);
		bind(Greeter.class).to(GreeterImpl.class);
		bind(Displayer.class).to(MastermindDisplayer.class);
		
		bind(CodeGenerator.class).annotatedWith(CodeGenerator.Secret.class).to(SecretCodeGenerator.class);
		bind(CodeComparator.class).annotatedWith(CodeGenerator.Feedback.class).to(FeedbackGenerator.class);
		bind(CodeGenerator.class).annotatedWith(CodeGenerator.Guess.class).to(GuessGenerator.class);

		bind(Integer.class).annotatedWith(Turns.class).toInstance(12);
		bind(Integer.class).annotatedWith(Pegs.class).toInstance(4);

		//All available colors in the game
		List<Colour> myList = Arrays.asList(
				Blue.getInstance(),
				Red.getInstance(),
				Yellow.getInstance(),
				Purple.getInstance(),
				Orange.getInstance(),
				Green.getInstance()
		);

		bind(new TypeLiteral<List<Colour>>(){}).
				toInstance(myList);
		//Right and Wrong Peg colors (currently: Black and White)
		bind(new TypeLiteral<Colour[]>() {}).
				toInstance(new Colour[]{
						White.getInstance(),
						Black.getInstance()
				});

		bind(ColorBank.class);
		



	}

}
