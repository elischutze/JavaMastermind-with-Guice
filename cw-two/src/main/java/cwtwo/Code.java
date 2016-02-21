
package cwtwo;
import cwtwo.colors.Colour;

import java.util.List;

public interface Code {

	List<Colour> getCode();
	void addPeg(Colour peg);
	void setCode(List<Colour> code);
	void print(String format);
	
}
