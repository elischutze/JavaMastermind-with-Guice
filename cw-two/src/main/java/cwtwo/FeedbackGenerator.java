package cwtwo;

/**
 * Created by elianne on 21/02/2016.
 */

import cwtwo.colors.Colour;
import java.util.ArrayList;
import java.util.List;

public class FeedbackGenerator implements CodeComparator {

	private Code guesscode; 
	
	private Code secretcode;

    @Override
    public Code generateCode(ColorBank colorBank, Integer pegs) {
        
    	Code feedbackCode = new CodeConcrete();
    	   	
    	for (int i=0; i<pegs;i++) {
    		if ( (guesscode.getCode().get(i)) == (secretcode.getCode().get(i)) ) {
    			feedbackCode.addPeg(colorBank.getRight());    			
    		}
    		else if ( secretcode.getCode().contains(guesscode.getCode().get(i) )) {
    			feedbackCode.addPeg(colorBank.getAlmost());
    		} 
    	}
    	
    	return feedbackCode;
    	
    }

	@Override
	public void compareCodes(Code secretcode, Code guesscode) {
		this.secretcode=secretcode;
		this.guesscode=guesscode;
		
		// TODO Auto-generated method stub
		
	}
}
