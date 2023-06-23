package bhandari.BAY;

public class SBay extends FighterBay{
	
	//Defining the variable
	private int Capacity = 36;

	//Creating the constructor
	public SBay(String BayName, String BayID, int Capacity) {
		super(BayName, BayID, "Tie Fighter S");
		this.Capacity = Capacity;
		this.setBayType("Starboard Bay");
		//this.setBayID("SB-1");
	}

	//Method to display the Tie Fighters
	@Override
	public void displayTieFighters() {
		System.out.println("Tie Fighter");
		System.out.println("Fighter Type:");
		System.out.println("Length:");
		System.out.println("Width:");
		System.out.println("Status:");
	}

	//Method to display the Bay Info
	@Override
	public void displayBayInfo() {
		
	}

	//Getters and setters
	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	

}
