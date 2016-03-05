package cwtwo.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cwtwo.Code;
import cwtwo.CodeConcrete;
import cwtwo.colors.Black;
import cwtwo.colors.Blue;
import cwtwo.colors.Colour;
import cwtwo.colors.Green;
import cwtwo.colors.Orange;
import cwtwo.colors.Purple;
import cwtwo.colors.Red;
import cwtwo.colors.White;
import cwtwo.colors.Yellow;

public class CodeConcreteTest {
	
	private Colour black = Black.getInstance();
	private Colour blue = Blue.getInstance();
	private Colour green = Green.getInstance();
	private Colour orange  = Orange.getInstance();
	private Colour purple  = Purple.getInstance();
	private Colour red  = Red.getInstance();
	private Colour white  = White.getInstance();
	private Colour yellow  = Yellow.getInstance();
	private Code code = new CodeConcrete();
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
/**
*  Below are the tests related to the Color Singleton Black.
*/

	@Test
	public void testaddPeg1() {
	code.getCode().size();
		code.addPeg(black);	
		
	assertEquals(black,Black.getInstance());
	}	
	
	

}
