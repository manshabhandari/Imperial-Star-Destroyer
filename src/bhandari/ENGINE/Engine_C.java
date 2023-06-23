package bhandari.ENGINE;

public class Engine_C extends ShipEngine{

	//Creating the constructor, defining the dimensions for each build type
	public Engine_C(String starDestroyerType) {
		super("C", starDestroyerType, 225, 75, 15000000, 125);
		this.setEngineType("Engine_C");
		if(this.getStarDestroyerType().equals("Imperial_I")) {
			this.setEngineType("Engine_C");
			this.setLength(225);
			this.setHeight(75);
			this.setPower(15000000);
			this.setWeight(125);
		} else {
			if(this.getStarDestroyerType().equals("Imperial_II")) {
				this.setEngineType("Engine_C");
				this.setLength(275);
				this.setHeight(80);
				this.setPower(17000000);
				this.setWeight(125);
			}

		}
	}
}	
