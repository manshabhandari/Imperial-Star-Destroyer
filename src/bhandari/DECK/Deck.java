package bhandari.DECK;

public class Deck {
	
	//Defining the variables
	private String IDNumber;
	private Bridge Deck_Bridge;
	private TopDeck Deck_Top;
	private MainDeck Deck_Main;
	
	//Creating the constructor
	public Deck(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;
	}

	//Getters and setters
	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public Bridge getDeck_Bridge() {
		return Deck_Bridge;
	}

	public void setDeck_Bridge(Bridge deck_Bridge) {
		Deck_Bridge = deck_Bridge;
	}

	public TopDeck getDeck_Top() {
		return Deck_Top;
	}

	public void setDeck_Top(TopDeck deck_Top) {
		Deck_Top = deck_Top;
	}

	public MainDeck getDeck_Main() {
		return Deck_Main;
	}

	public void setDeck_Main(MainDeck deck_Main) {
		Deck_Main = deck_Main;
	}
	
	//Method to display the Deck Specs
	public void displayDeckSpecs() {
		System.out.println("Deck: " + IDNumber);
		
	}
	
}
