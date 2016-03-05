package cwtwo;

import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public abstract class MastermindAbstract implements Game {
	
	protected boolean showCode;
	protected Code secretCode;
	protected List<Code> guesses = new ArrayList<>();
	protected List<Code> feedback  = new ArrayList<>();
	@Inject @Turns protected Integer turns;
	@Inject @Pegs protected Integer pegs;
	protected ColorBank colorBank;
	protected CodeGenerator secretCodeGenerator;
	protected CodeComparator feedbackGenerator;
	protected CodeGenerator guessGenerator;
	protected Displayer displayer;

//	protected FeedbackMaker feedbackMaker;
//	protected Renderer feedbackRenderer;
	
	protected Greeter greeter;
	abstract public void runGames();
	//public MastermindAbstract( )
	protected Settings settings;



}
