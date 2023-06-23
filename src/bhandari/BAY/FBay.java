package bhandari.BAY;

public class FBay extends FighterBay{
	
	//Defining the variable
	private int Capacity = 96;

	//Creating the constructor
	public FBay(String BayName, String BayID, int Capacity) {
		super(BayName, BayID, "Tie Fighter F");
		this.Capacity = Capacity;
		this.setBayType("Forward Bay");
		//this.setBayID("FB-1");
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

	//Method to display the Bay info
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