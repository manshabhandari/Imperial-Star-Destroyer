package bhandari.HULL;

public class AftHullSection extends HullSection{

	//Creating the constructor, defining the dimensions for each build type
	public AftHullSection(String starDestroyerType) {
		super("Aft", "StarDestroyer", 700, 200, 325, 550);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			//this.setStarDestroyerType("StarDestroyer");
			this.setHullType("Aft");
			this.setLength(900);
			this.setHeight(275);
			this.setWidth(300);
			this.setWeight(700);
		}
	}

}
