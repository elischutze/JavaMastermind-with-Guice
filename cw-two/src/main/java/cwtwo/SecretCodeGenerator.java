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
							 Integer turns,
							Integer pegs) {

		Random random = new Random();

		System.out.println("testCol= "+testCol);
		System.out.println("Turns="+turns+" Pegs="+pegs);

		Code secretCode = new CodeConcrete();

		for(i=0;i<=pegs;i++){
			secretCode.addPeg(colorBank.getColour(random.nextInt(colorBank.numColors())));
		}

		return secretCode;

	}



	
	

}
