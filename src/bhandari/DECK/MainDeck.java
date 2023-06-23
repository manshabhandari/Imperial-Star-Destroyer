package bhandari.DECK;

public class MainDeck extends ShipDeck{

	public MainDeck() {
		super();
	}

	//Creating the constructor, and defining the dimensions of the bridge for each  build type
	public MainDeck(String starDestroyerType) {
		super("Main Deck", starDestroyerType, 600, 50, 400, 250);
		if(this.getStarDestroyerType().equals("Imperial_I")) {
			this.setDeckType("Main Deck");
			this.setLength(600);
			this.setHeight(50);
			this.setWidth(400);
			this.setWeight(250);
		} else {
			if(this.getStarDestroyerType().equals("Imperial_II")) {
				this.setDeckType("Main Deck");
				this.setLength(700);
				this.setHeight(56);
				this.setWidth(450);
				this.setWeight(300);
			}
		}
	}
	
}
