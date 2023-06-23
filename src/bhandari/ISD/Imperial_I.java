package bhandari.ISD;

import bhandari.BAY.*;
import bhandari.DECK.*;
import bhandari.ENGINE.*;
import bhandari.ENUMS.TieFighter;
import bhandari.HULL.*;

public class Imperial_I extends StarDestroyer{

	//Creating the constructor
	public Imperial_I(String shpNumber, String shpName) {
		super(shpNumber, shpName);
		this.setShpClass("Imperial_I");
		this.setShpCrew(9000);
	}
	
	//Methods from the interfaces
	@Override
	public void navigatesToPosition(String p) {	
	}

	@Override
	public boolean docks(String D) {
		return false;
	}

	@Override
	public boolean undocks(String D) {
		return false;
	}

	@Override
	public boolean LaunchFighters() {
		return false;
	}
	
	//Method to display Imperial_I
	public void displayImperial_I() {
			
	}



	
	
}

