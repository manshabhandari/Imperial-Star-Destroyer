package bhandari.ENUMS;

public enum TieFighter {
	
	//Creating three different types of Tie Fighters
	TieFighter_S("Standard Fighter",15,5, Status.NOT_READY), 
	TieFighter_H("Heavy Fighter",20,7, Status.NOT_READY),
	TieFighter_I("Stealth Fighter",10,6, Status.NOT_READY);
	
	//Defining the variables
	private String TF_type;	
	private double TF_length;
	private double TF_width;
	private Status TF_status;

	//Creating the constructor
	private TieFighter(String tF_type, double tF_length, double tF_width, Status tF_status) {
		this.TF_type = tF_type;
		this.TF_length = tF_length;
		this.TF_width = tF_width;
		this.TF_status = tF_status;
	}

	//Getters and setters
	public String getTF_type() {
		return TF_type;
	}

	public void setTF_type(String tF_type) {
		TF_type = tF_type;
	}

	public double getTF_length() {
		return TF_length;
	}

	public void setTF_length(double tF_length) {
		TF_length = tF_length;
	}

	public double getTF_width() {
		return TF_width;
	}

	public void setTF_width(double tF_width) {
		TF_width = tF_width;
	}

	public Status getTF_status() {
		return TF_status;
	}

	public void setTF_status(Status tF_status) {
		TF_status = tF_status;
	}
	
	//Method to change the status of the tie fighters from Not Ready to Ready
	public void ready() {
		this.setTF_status(Status.READY);
	}
	
	//Method to display the stats of each type of Tie Fighter
	public static void display() {
		//Printing out the Heavy Fighter Specifications
		TieFighter HT = TieFighter.TieFighter_H;
		System.out.println("Tie Fighter");
		System.out.println("Fighter Type: " + HT.getTF_type());
		System.out.println("Length: " + HT.getTF_length());
		System.out.println("Width: " + HT.getTF_width());
		System.out.println("Status: " + HT.getTF_status());
		System.out.println();
				
		//Printing out the Standard Fighter Specifications
		TieFighter ST = TieFighter.TieFighter_S;
		System.out.println("Tie Fighter");
		System.out.println("Fighter Type: " + ST.getTF_type());
		System.out.println("Length: " + ST.getTF_length());
		System.out.println("Width: " + ST.getTF_width());
		System.out.println("Status: " + ST.getTF_status());
		System.out.println();
			
		//Printing out the Stealth Fighter Specifications
		TieFighter IT = TieFighter.TieFighter_I;
		System.out.println("Tie Fighter");
		System.out.println("Fighter Type: " + IT.getTF_type());
		System.out.println("Length: " + IT.getTF_length());
		System.out.println("Width: " + IT.getTF_width());
		System.out.println("Status: " + IT.getTF_status());
	}

}
