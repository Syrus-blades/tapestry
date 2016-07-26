package edu.dsp.pendu.pages;


import org.apache.tapestry5.Block;
import org.apache.tapestry5.EventContext;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Log;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.HttpError;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.slf4j.Logger;

import java.util.Date;

/**
 * Start page of application pendu.
 */
public class Index
{
	 @InjectPage
	  private Guess guess;

	 
	private int nbFind = (int)(Math.random()*10)+1;
	Object onActionFromLetItGo()
	  {
	   
		guess.setup(nbFind);
	
	    return guess;
	  }
 
  
 

 
}
