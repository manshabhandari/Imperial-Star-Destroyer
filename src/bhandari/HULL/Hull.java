package bhandari.HULL;

public class Hull {
	
	//Defining the variables
	private String IDNumber;
	private FwdHullSection SectionFWD;
	private AftHullSection SectionAFT;
	
	//Creating the constructor
	public Hull(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;

	}
	
	//Method to display the Hull Specs
	public void displayHullSpecs() {
		System.out.println("Hull: " + IDNumber);
	}

	@Override
	public String toString() {
		return "Hull [IDNumber=" + IDNumber + ", SectionFWD=" + SectionFWD + ", SectionAFT=" 
	+ SectionAFT + "]";
	}

	//Getters and setters
	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public FwdHullSection getSectionFWD() {
		return SectionFWD;
	}

	public void setSectionFWD(FwdHullSection sectionFWD) {
		SectionFWD = sectionFWD;
	}

	public AftHullSection getSectionAFT() {
		return SectionAFT;
	}

	public void setSectionAFT(AftHullSection sectionAFT) {
		SectionAFT = sectionAFT;
	}
	
	
	
	
}
