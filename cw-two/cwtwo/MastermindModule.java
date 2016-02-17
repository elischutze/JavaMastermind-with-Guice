package cw2;


import com.google.inject.AbstractModule;

public class MastermindModule extends AbstractModule {

	@Override
	public void configure() {
		// TODO Auto-generated method stub
		
		bind(Game.class).to(Mastermind.class);
		
		bind(Greeter.class).to(GreeterImpl.class);

	}

}
