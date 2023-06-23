package bhandari.BAY;

import java.util.ArrayList;
import bhandari.ENUMS.TieFighter;

public abstract class FighterBay extends Bay{
	
	//Defining the variable
	private ArrayList<TieFighter> Slots;
	
	//Creating the constructor
	public FighterBay(String bayName, String bayID, String bayType) {
		super(bayName, bayID, "Tie Fighter");
	}

	//Getters and setters
	public ArrayList<TieFighter> getSlots() {
		return Slots;
	}

	public void setSlots(ArrayList<TieFighter> slots) {
		Slots = slots;
	}
	
	//Abstract method to display the Tie Fighters
	public abstract void displayTieFighters();
	
	
}
