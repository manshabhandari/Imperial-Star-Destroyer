package bhandari.ENGINE;

public abstract class ShipEngine {
	
	//Defining the variables
	private String EngineType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Power;
	private int Weight;
	
	//Creating the constructor
	public ShipEngine(String engineType, String starDestroyerType, int length, int height, 
			int power, int weight) {
		this.EngineType = engineType;
		this.StarDestroyerType = starDestroyerType;
		this.Length = length;
		this.Height = height;
		this.Power = power;
		this.Weight = weight;
	}

	//Getters and setters
	public String getShipEngine() {
		return EngineType;
	}
	

	public String getEngineType() {
		return EngineType;
	}
	
	public void setEngineType(String engineType) {
		EngineType = engineType;
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

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}
	
	//Method to get Engine Info
	public String EngineInfo() {
		return "";
	}

	@Override
	public String toString() {
		return "ShipEngine [ShipEngine=" + EngineType + ", StarDestroyerType=" + 
				StarDestroyerType + ", Length=" + Length + ", Height=" + Height + ", Power=" + 
				Power + ", Weight=" + Weight + "]";
	}
	
	
}
