package bhandari.FACTORY;

import java.text.DecimalFormat;
import java.util.ArrayList;

import bhandari.BAY.*;
import bhandari.DECK.*;
import bhandari.ENGINE.*;
import bhandari.ENUMS.TieFighter;
import bhandari.HULL.*;
import bhandari.ISD.*;

public class ISD2_Factory extends ISDFactory{
	
	//Defining the Decimal Format and Array List
	DecimalFormat DF1 = new DecimalFormat("00");
	DecimalFormat DF2 = new DecimalFormat("000");
	private ArrayList<StarDestroyer> dryDock = new ArrayList<StarDestroyer>();

	//Creating the constructor
	public ISD2_Factory(String name) {
		super(name);
		this.setBuildType("Imperial_II");
	}

	//Method to build ISDs and add them to the dryDock ArrayList
	@Override
	public boolean buildISDs(int count) {
		//ArrayList<AstromechDroid> DroidR3Storage = new ArrayList<AstromechDroid>();
		//private ArrayList<StarDestroyer> dryDock;
		int x = 901;
		int y = 000;
		for(int i = 0; i < count; i++) {
		String shipNumber = "ISD-" + DF1.format(x);
		String shipName = "SD-" +  DF2.format(y) + "_II";
		Imperial_I I2 = new Imperial_I(shipNumber, shipName);
		x++;
		dryDock.add(I2);
		}
		return true;
	}

	//Method to display the created ISDs from the dryDock ArrayList
	@Override
	public void displayISDs() {
		int x = 901;
		int y = 000;
		for(int i = 0; i < dryDock.size(); i++ ) {
			dryDock.get(i);
			System.out.println();
			System.out.println("Imperial_II");
		
			//Formatting the Ship Number and Ship Name
			String shipNumber = "ISD-" + DF1.format(x);
			String shipName = "SD-" +  DF2.format(y) + "_II";
			Imperial_II I2 = new Imperial_II(shipNumber, shipName);
			x++;
			y++;

			//Printing out the Ship Specifications
			System.out.println("______________Ship Specifications______________");
			System.out.println("Ship Number: " + I2.getShpNumber()+ "\t" + "Ship Type: " + I2.getShpType() + 
					 "\t" + " Ship Name: " + I2.getShpName() + "\t" +  " Ship Class: " + I2.getShpClass()+ 
					 "\t" + " Ship Crew: " + I2.getShpCrew());
			
			//Printing out the Hull Specifications
			System.out.println("______________Hull Specifications______________");
			Hull H2 = new Hull("H2", "xx");
			H2.displayHullSpecs();
			
			//Printing out the Forward Hull Section Specifications
			FwdHullSection F2 = new FwdHullSection("Imperial_II");
			System.out.println("Forward Hull: HullType: " + F2.getHullType() + "\t" + "Length: " + F2.getLength() + "\t" + " Height: " + F2.getHeight() + "\t" + " Width: " + F2.getWidth() + "\t" + " Weight: " + F2.getWeight());
					
			//Printing out the Aft Hull Section Specifications
			AftHullSection A2 = new AftHullSection("Imperial_II");
			System.out.println("Aft Hull: HullType: " + A2.getHullType() + "\t" + "Length: " + A2.getLength() + "\t" + " Height: " + A2.getHeight() + "\t" + " Width: " + A2.getWidth() + "\t" + " Weight: " + A2.getWeight());		
			
			//Printing out the Deck Specifications
			System.out.println("______________Deck Specifications______________");
			Deck D2 = new Deck("D2", "xx");
			D2.displayDeckSpecs();
			
			//Printing out the Bridge Specifications
			Bridge B2 = new Bridge("Imperial_II");
			System.out.println("Bridge: Deck Type: " + B2.getDeckType() + "\t" + "Star Destroyer Type: " + B2.getStarDestroyerType() + "\t" + "Length: " + B2.getLength() + "\t" + "Height: " + B2.getHeight() + "\t" + "Width: " + B2.getWidth() + "\t" + "Weight: " + B2.getWeight());
						
			//Printing out the Top Deck Specifications
			TopDeck TD2 = new TopDeck("Imperial_II");
			System.out.println("Top Deck: Deck Type: " + TD2.getDeckType() + "\t" + "Star Destroyer Type: " + TD2.getStarDestroyerType() + "\t" + "Length: " + TD2.getLength() + "\t" + "Height: " + TD2.getHeight() + "\t" + "Width: " + TD2.getWidth() + "\t" + "Weight: " + TD2.getWeight());
						
			//Printing out the Main Deck Specifications
			MainDeck MD2 = new MainDeck("Imperial_II");
			System.out.println("Main Deck: Deck Type: " + MD2.getDeckType() + "\t" + "Star Destroyer Type: " + MD2.getStarDestroyerType() + "\t" + "Length: " + MD2.getLength() + "\t" + "Height: " + MD2.getHeight() + "\t" + "Width: " + MD2.getWidth() + "\t" + "Weight: " + MD2.getWeight());
		
			//Printing out the Engine Specifications
			System.out.println("______________Deck Specifications______________");
			Engine E2 = new Engine("E2", "xx");
			E2.displayEngineSpecs();
			
			//Printing out the Starboard Engine Specifications
			Engine_S ES2 = new Engine_S("Imperial_II");
			System.out.println("Starboard Engine: Engine Type: " + ES2.getEngineType() + "\t" + "Length: " + ES2.getLength() + "\t" + "Height: " + ES2.getHeight() + "\t" + "Power: " + ES2.getPower() + "\t" + "Weight: " + ES2.getWeight());
			
			//Printing out the Center Engine Specifications
			Engine_C EC2 = new Engine_C("Imperial_II");
			System.out.println("Center Engine: Engine Type: " + EC2.getEngineType() + "\t" + "Length: " + EC2.getLength() + "\t" + "Height: " + EC2.getHeight() + "\t" + "Power: " + EC2.getPower() + "\t" + "Weight: " + EC2.getWeight());
				
			//Printing out the Port Engine Specifications
			System.out.println("Port Engine: Engine Type: " + ES2.getEngineType() + "\t" + "Length: " + ES2.getLength() + "\t" + "Height: " + ES2.getHeight() + "\t" + "Power: " + ES2.getPower() + "\t" + "Weight: " + ES2.getWeight());			
		
			//Printing out the Fighter Bay Specifications
			System.out.println("______________Fighter Bay Specifications______________");
			
			//Printing out the Starboard Fighter Bay Specifications
			SBay S2 = new SBay("Starboard Bay", "SB-2", 36);
			System.out.println("Starboard Fighter Bay ID: " + S2.getBayID());
			System.out.println(S2.getBayType());
			System.out.println(S2.getBayID());
			System.out.println("Tie Fighter");
			System.out.println("Fighter Capacity: " + S2.getCapacity());
			System.out.println();
			
			//Printing out the Foward Fighter Bay Specifications
			FBay FB2 = new FBay("Forward Bay", "FB-2", 96);
			System.out.println("Forward Fighter Bay ID: " + FB2.getBayID());
			System.out.println(FB2.getBayType());
			System.out.println(FB2.getBayID());
			System.out.println("Tie Fighter");
			System.out.println("Fighter Capacity: " + FB2.getCapacity());
			System.out.println();
			
			//Printing out the Foward Fighter Bay Specifications
			PBay P2 = new PBay("Port Bay", "PB-1", 48);
			System.out.println("Port Fighter Bay ID: " + P2.getBayID());
			System.out.println(P2.getBayType());
			System.out.println(P2.getBayID());
			System.out.println("Tie Fighter");
			System.out.println("Fighter Capacity: " + P2.getCapacity());
			
			//Printing out the Tie Fighter Specifications (using the enums)
			System.out.println("______________Tie Fighter Specifications______________");
			TieFighter.display();
		}
	}


}
