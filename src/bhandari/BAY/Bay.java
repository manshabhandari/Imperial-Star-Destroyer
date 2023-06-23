package bhandari.BAY;

public abstract class Bay {
	
	//Defining variables
	private String BayName;
	private String BayID;
	private String BayType;
	
	public Bay() {
	}
	
	//Creating the constructor
	public Bay(String bayName, String bayID, String bayType) {
		super();
		this.BayName = bayName;
		this.BayID = bayID;
		this.BayType = bayType;
	}

	//Getters and setters
	public String getBayName() {
		return BayName;
	}

	public void setBayName(String bayName) {
		BayName = bayName;
	}

	public String getBayID() {
		return BayID;
	}

	public void setBayID(String bayID) {
		BayID = bayID;
	}

	public String getBayType() {
		return BayType;
	}

	public void setBayType(String bayType) {
		BayType = bayType;
	}
	
	//Abstract method to display Bay Info
	public abstract void displayBayInfo();

	@Override
	public String toString() {
		return "Bay [BayName=" + BayName + ", BayID=" + BayID + ", BayType=" + BayType + "]";
	}
	
	
}	
