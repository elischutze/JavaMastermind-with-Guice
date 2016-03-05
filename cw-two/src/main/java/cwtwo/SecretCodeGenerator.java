package cwtwo;

import cwtwo.colors.Colour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecretCodeGenerator implements CodeGenerator {


	public SecretCodeGenerator(){

	}
	

	@Override
	public Code generateCode(ColorBank colorBank,
							Integer pegs) {

		Random random = new Random();


		Code secretCode = new CodeConcrete();
		
		
		for(int i=0;i<pegs;i++){
			secretCode.addPeg(colorBank.getColour(random.nextInt(colorBank.numColors())));
		}
		return secretCode;

	}



	
	

}
