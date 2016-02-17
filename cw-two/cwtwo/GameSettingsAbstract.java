package cw2;

import java.util.List;

public abstract class GameSettingsAbstract {
	
	List<String> colours;
	List<String> pegColours;
	int numPegs;
	int numTurns;
	
	public List<String> getColours(){
		return this.colours;
	}
	
	public List<String> getpegColours(){
		return this.pegColours;
	}
	
	public int getNumPegs(){
		return this.numPegs;
	}
	
	public int getNumTurns(){
		return this.numTurns;
	}

	
}
