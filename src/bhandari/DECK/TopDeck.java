package bhandari.DECK;

public class TopDeck extends ShipDeck{

	public TopDeck() {
		super();
	}

	//Creating the constructor, and defining the dimensions of the bridge for each  build type
	public TopDeck(String starDestroyerType) {
		super("Top Deck", starDestroyerType, 300, 30, 250, 125);
		if(this.getStarDestroyerType().equals("Imperial_I")) {
			this.setDeckType("Top Deck");
			this.setLength(300);
			this.setHeight(30);
			this.setWidth(250);
			this.setWeight(125);
		} else {
			if(this.getStarDestroyerType().equals("Imperial_II")) {
				this.setDeckType("Top Deck");
				this.setLength(350);
				this.setHeight(34);
				this.setWidth(300);
				this.setWeight(150);
			}
		}
	}
	
}
