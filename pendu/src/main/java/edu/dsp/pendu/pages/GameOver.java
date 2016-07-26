package edu.dsp.pendu.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

public class GameOver {
	@Property
	@Persist
	private int nbtentatives;
	@Property
	@Persist
	private int nbfind;

	public GameOver() {
		super();
	}

	public void setup(int nbfind, int nbtentatives) {
		this.nbfind=nbfind;
		this.nbtentatives=nbtentatives;
		
	}
	
	
}
