package bhandari.ENGINE;

public class Engine_S extends ShipEngine{

	//Creating the constructor, defining the dimensions for each build type
	public Engine_S(String starDestroyerType) {
		super("S", starDestroyerType, 100, 50, 8000000, 100);
		this.setEngineType("Engine_S");
		if(this.getStarDestroyerType().equals("Imperial_I")) {
			//this.setEngineType("Engine_S");
			this.setLength(100);
			this.setHeight(50);
			this.setPower(8000000);
			this.setWeight(100);
		} else {
			if(this.getStarDestroyerType().equals("Imperial_II")) {
				//this.setEngineType("Engine_S");
				this.setLength(115);
				this.setHeight(60);
				this.setPower(9000000);
				this.setWeight(100);
			}
	}

}
}
