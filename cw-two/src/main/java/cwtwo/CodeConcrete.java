package cwtwo;

import cwtwo.colors.Colour;

import java.util.ArrayList;
import java.util.List;

public class CodeConcrete implements Code {
	
	private List<Colour> code = new ArrayList<>();

	public void addPeg(Colour peg){
		this.code.add(peg);
	}

	@Override
	public List<Colour> getCode() {
		// TODO Auto-generated method stub
		return this.code;
	}

	@Override
	public void setCode(List<Colour> code) {
		// TODO Auto-generated method stub
		this.code = code;
	}

	@Override
	public void print(String format) {
		if(format=="word"){
			
		} else if (format=="letter") {
			
		}
	}

}
