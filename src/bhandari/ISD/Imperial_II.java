package bhandari.ISD;

import bhandari.BAY.FBay;
import bhandari.BAY.PBay;
import bhandari.BAY.SBay;
import bhandari.DECK.Bridge;
import bhandari.DECK.Deck;
import bhandari.DECK.MainDeck;
import bhandari.DECK.TopDeck;
import bhandari.ENGINE.Engine;
import bhandari.ENGINE.Engine_C;
import bhandari.ENGINE.Engine_S;
import bhandari.ENUMS.TieFighter;
import bhandari.HULL.AftHullSection;
import bhandari.HULL.FwdHullSection;
import bhandari.HULL.Hull;

public class Imperial_II extends StarDestroyer{

	//Creating the constructor
	public Imperial_II(String shpNumber, String shpName) {
		super(shpNumber, shpName);
		this.setShpClass("Imperial_II");
		this.setShpCrew(12000);
		
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
	
	//Method to display Imperial_II
	public void displayImperial_II() {
	}
}
