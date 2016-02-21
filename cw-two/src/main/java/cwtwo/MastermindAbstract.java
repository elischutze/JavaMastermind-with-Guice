package cwtwo;

public abstract class MastermindAbstract implements Game {
	
	protected boolean showCode;
	
//	protected Code secretCode;
//	
//	protected List<Code> guesses;
	
	//protected List<Code> feedback;
	
	protected int turns;
	protected ColorBank colorBank;
	protected CodeGenerator secretCodeGenerator;
	protected CodeGenerator feedbackGenerator;
	protected CodeGenerator guessGenerator;


//	
//	protected FeedbackMaker feedbackMaker;
//	
//	protected Renderer feedbackRenderer;
	
	protected Greeter greeter;
	
	abstract public void runGames();
	
	//public MastermindAbstract( )
	
	protected Settings settings;
	

	
	
	
	

}
