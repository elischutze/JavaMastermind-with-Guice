package cw2;

import java.util.List;

public class CodeConcrete implements Code {
	
	private List<String> code;

	@Override
	public List<String> getCode() {
		// TODO Auto-generated method stub
		return this.code;
	}

	@Override
	public void setCode(List<String> code) {
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
