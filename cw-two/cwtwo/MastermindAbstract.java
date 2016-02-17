package cw2;

import java.util.List;

public abstract class MastermindAbstract implements Game {
	
	protected boolean showCode;
	
//	protected Code secretCode;
//	
//	protected List<Code> guesses;
	
	//protected List<Code> feedback;
	
	protected int turns;
	
//	protected CodeGenerator secretCodeGenerator;
//	protected CodeGenerator feedbackGenerator;
//	protected CodeGenerator guessGenerator;
//	
//	protected FeedbackMaker feedbackMaker;
//	
//	protected Renderer feedbackRenderer;
	
	protected Greeter greeter;
	
	abstract public void runGames();
	
	//public MastermindAbstract( )
	
	protected Settings settings;
	

	
	
	
	

}
