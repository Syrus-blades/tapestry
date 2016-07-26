package edu.dsp.pendu.pages;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.PageActivationContext;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

public class Guess {
	@Property
	@Persist
	private int nbtentatives;
	@Property
	@Persist
	private int nbfind;
	@Property
	@Persist
	private int dernieressai;
	@Property
	@Persist
	private int current;
	@Property
	@Persist
	private String indice;
	public Guess() {
		super();
	}
	@InjectPage
	private GameOver gameover;
	@InjectPage
	private Guess guess;


	public void setup(int values) {
		this.nbfind= values;
		this.nbtentatives=1;
	}

	Object onActionFromDeviner(int nbs)
	{
		
		if (nbs < nbfind) {
		indice= "le nombre "+nbs+" est trop bas";
		}
		else if (nbs > nbfind) {
	    indice= "le nombre "+nbs+" est trop haut"	;
		}else {
			gameover.setup(nbfind,nbtentatives);
			return gameover;
		}
		dernieressai = nbs;
		nbtentatives++;
		return guess;
		
		
	}

}
