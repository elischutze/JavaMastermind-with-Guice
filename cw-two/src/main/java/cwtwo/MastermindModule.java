package cwtwo;

import com.google.inject.AbstractModule;

public class MastermindModule extends AbstractModule {

	@Override
	public void configure() {
		// TODO Auto-generated method stub
		
		bind(Game.class).to(Mastermind.class);
		
		bind(Greeter.class).to(GreeterImpl.class);

		bind(CodeGenerator.class).annotatedWith(CodeGenerator.Secret.class).to(SecretCodeGenerator.class);
		bind(CodeGenerator.class).annotatedWith(CodeGenerator.Feedback.class).to(FeedbackGenerator.class);
		bind(CodeGenerator.class).annotatedWith(CodeGenerator.Guess.class).to(GuessGenerator.class);


	}

}
