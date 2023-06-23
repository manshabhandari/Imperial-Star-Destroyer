package bhandari.DECK;

public abstract class ShipDeck {
	
	//Defining the variables
	private String DeckType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Width;
	private int Weight;
	
	public ShipDeck() {
	}

	//Creating the constructor
	public ShipDeck(String deckType, String starDestroyerType, int length, int height, 
			int width, int weight) {
		this.DeckType = deckType;
		this.StarDestroyerType = starDestroyerType;
		this.Length = length;
		this.Height = height;
		this.Width = width;
		this.Weight = weight;
	}
	
	//Getters and setters
	public String DeckInfo() {
		return "";
	}

	public String getDeckType() {
		return DeckType;
	}

	public void setDeckType(String deckType) {
		DeckType = deckType;
	}

	public String getStarDestroyerType() {
		return StarDestroyerType;
	}

	public void setStarDestroyerType(String starDestroyerType) {
		StarDestroyerType = starDestroyerType;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}
	
	
}
