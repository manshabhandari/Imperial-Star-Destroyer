package bhandari.DECK;

public class Bridge extends ShipDeck{

	public Bridge() {
		super();
	}

	//Creating the constructor, and defining the dimensions of the bridge for each  build type
	public Bridge(String starDestroyerType) {
		super("Bridge", starDestroyerType, 150, 20, 100, 75);
		if(this.getStarDestroyerType().equals("Imperial_I")) {
			this.setDeckType("Bridge");
			this.setLength(150);
			this.setHeight(20);
			this.setWidth(100);
			this.setWeight(75);
		} else {
			if(this.getStarDestroyerType().equals("Imperial_II")) {
				this.setDeckType("Bridge");
				this.setLength(200);
				this.setHeight(22);
				this.setWidth(150);
				this.setWeight(100);
			}
		}
	}
	
	
}
