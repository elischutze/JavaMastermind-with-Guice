package cw2;

import java.util.Arrays;

public class Settings extends GameSettingsAbstract {
	
	private static Settings settings = new Settings();
	
	private Settings(){
		
		this.colours = Arrays.asList("blue","red", "green","yellow","purple","orange");
		this.pegColours = Arrays.asList("white","black");
		this.numPegs = 4;
		this.numTurns = 12;
		
	}

	public static Settings getInstance(){
		return settings;
	}
	
}
