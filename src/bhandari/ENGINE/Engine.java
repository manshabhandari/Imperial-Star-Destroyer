package bhandari.ENGINE;

import java.util.Arrays;

public class Engine {
	
	//Defining the variables
	private String IDNumber;
	private ShipEngine[] Engines;

	//Creating the constructor
	public Engine(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;

	}

	//Getters and setters
	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public ShipEngine[] getEngines() {
		return Engines;
	}

	public void setEngines(ShipEngine[] engines) {
		Engines = engines;
	}
	
	//Method to display the Engine Specs
	public void displayEngineSpecs() {
		System.out.println("Engine: " + IDNumber);

	}

	@Override
	public String toString() {
		return "Engine [IDNumber=" + IDNumber + ", Engines=" + Arrays.toString(Engines) + "]";
	}
	
	
}
