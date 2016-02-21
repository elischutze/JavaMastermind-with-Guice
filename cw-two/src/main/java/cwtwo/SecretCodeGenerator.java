package cwtwo;

import cwtwo.colors.Colour;

import java.util.Random;

public class SecretCodeGenerator implements CodeGenerator {


	public SecretCodeGenerator(){

	}
	

	@Override
	public Code generateCode(ColorBank colorBank) {

		Random random = new Random();
		Colour testCol = colorBank.getColour(random.nextInt(colorBank.numColors()));
		System.out.println("testCol= "+testCol);
		return new CodeConcrete();

	}



	
	

}
