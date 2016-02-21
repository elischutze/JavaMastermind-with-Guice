package cwtwo;

import java.util.List;

public class CodeConcrete implements Code {
	
	private List<Peg> code;

	@Override
	public List<Peg> getCode() {
		// TODO Auto-generated method stub
		return this.code;
	}

	@Override
	public void setCode(List<Peg> code) {
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
