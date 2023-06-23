package bhandari.ISD;

import bhandari.BAY.*;
import bhandari.DECK.Deck;
import bhandari.ENGINE.Engine;
import bhandari.HULL.Hull;
import bhandari.INTERFACES.*;

public abstract class StarDestroyer implements Maneuvers, Docks, Launches{
	
	//Defining the variables
	private String ShpNumber;
	private String ShpType;
	private String ShpName;
	private String ShpClass;
	private int ShpCrew;
	private Hull ShpHulls;
	private Deck ShpDecks;
	private Engine ShpEngines;
	private SBay StarboardBay;
	private PBay PortBay;
	private FBay ForwardBay;
	
	
	public StarDestroyer() {	
	}

	//Creating the constructor
	public StarDestroyer(String ShpNumber, String ShpName) {
		super();
		this.ShpNumber = ShpNumber;
		this.ShpName = ShpName;
		this.ShpType = "Star Destroyer";
	}
	
	//Getters and setters
	public String getShpNumber() {
		return ShpNumber;
	}

	public void setShpNumber(String shpNumber) {
		ShpNumber = shpNumber;
	}

	public String getShpType() {
		return ShpType;
	}

	public void setShpType(String shpType) {
		ShpType = shpType;
	}

	public String getShpName() {
		return ShpName;
	}

	public void setShpName(String shpName) {
		ShpName = shpName;
	}

	public String getShpClass() {
		return ShpClass;
	}

	public void setShpClass(String shpClass) {
		ShpClass = shpClass;
	}

	public int getShpCrew() {
		return ShpCrew;
	}

	public void setShpCrew(int shpCrew) {
		ShpCrew = shpCrew;
	}

	public Hull getShpHulls() {
		return ShpHulls;
	}

	public void setShpHulls(Hull shpHulls) {
		ShpHulls = shpHulls;
	}

	public Deck getShpDecks() {
		return ShpDecks;
	}

	public void setShpDecks(Deck shpDecks) {
		ShpDecks = shpDecks;
	}

	public Engine getShpEngines() {
		return ShpEngines;
	}

	public void setShpEngines(Engine shpEngines) {
		ShpEngines = shpEngines;
	}

	public SBay getStarboardBay() {
		return StarboardBay;
	}

	public void setStarboardBay(SBay starboardBay) {
		StarboardBay = starboardBay;
	}

	public PBay getPortBay() {
		return PortBay;
	}

	public void setPortBay(PBay portBay) {
		PortBay = portBay;
	}

	public FBay getForwardBay() {
		return ForwardBay;
	}

	public void setForwardBay(FBay forwardBay) {
		ForwardBay = forwardBay;
	}

	//Method to display the Ship Info
	public static void displayShipInfo() {

	}

	@Override
	public String toString() {
		return "StarDestroyer [ShpNumber=" + ShpNumber + ", ShpType=" + ShpType + ", ShpName=" 
				+ ShpName + ", ShpClass=" + ShpClass + ", ShpCrew=" + ShpCrew + ", ShpHulls=" 
				+ ShpHulls + ", ShpDecks=" + ShpDecks + ", ShpEngines=" + ShpEngines 
				+ ", StarboardBay=" + StarboardBay + ", PortBay=" + PortBay
				+ ", ForwardBay=" + ForwardBay + "]";
	}
	
	

	
	
}
