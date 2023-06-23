package bhandari.HULL;

public class FwdHullSection extends HullSection{

	//Creating the constructor, defining the dimensions for each build type
	public FwdHullSection(String starDestroyerType) {
		super("Fwd", starDestroyerType, 900, 100, 75, 350);
		if(this.getStarDestroyerType().equals("Imperial_II")) {
			this.setHullType("Fwd");
			this.setLength(900);
			this.setHeight(100);
			this.setWidth(200);
			this.setWeight(400);
		}
	}

}
