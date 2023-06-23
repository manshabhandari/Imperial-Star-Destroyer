package bhandari.BAY;

public class PBay extends FighterBay{
	
	//Defining the variable
	private int Capacity = 48;

	//Creating the constructor
	public PBay(String BayName, String BayID, int Capacity) {
		super(BayName, BayID, "Tie Fighter P");
		this.Capacity = Capacity;
		this.setBayType("Port Bay");
		//this.setBayID("PB-1");
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

	//Method to display the bay info
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
