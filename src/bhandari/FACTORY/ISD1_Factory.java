package bhandari.FACTORY;

import java.text.DecimalFormat;
import java.util.ArrayList;

import bhandari.BAY.*;
import bhandari.DECK.*;
import bhandari.ENGINE.*;
import bhandari.ENUMS.TieFighter;
import bhandari.HULL.*;
import bhandari.ISD.*;

public class ISD1_Factory extends ISDFactory{
	
	//Defining the Decimal Format and array list
	DecimalFormat DF1 = new DecimalFormat("00");
	DecimalFormat DF2 = new DecimalFormat("000");
	private ArrayList<StarDestroyer> dryDock = new ArrayList<StarDestroyer>();

	//Creating the constructor
	public ISD1_Factory(String name) {
		super(name);
		this.setBuildType("Imperial_I");
		
	}

	//Method to build ISDs and add them to the dryDock ArrayList
	@Override
	public boolean buildISDs(int count) {
		int x = 83;
		int y = 000;
		for(int i = 0; i < count; i++) {
		String shipNumber = "ISD-" + DF1.format(x);
		String shipName = "SD-" +  DF2.format(y) + "_I";
		Imperial_I I1 = new Imperial_I(shipNumber, shipName);
		x++;
		dryDock.add(I1);
		}
		return true;
	}
	
	//Method to display the created ISDs from the dryDock ArrayList
	@Override
	public void displayISDs() {
		int x = 83;
		int y = 000;
		for(int i = 0; i < dryDock.size(); i++ ) {
			dryDock.get(i);
			System.out.println();
			System.out.println("Imperial_I");
		
			//Formatting the Ship Number and Ship Name
			String shipNumber = "ISD-" + DF1.format(x);
			String shipName = "SD-" +  DF2.format(y) + "_I";
			Imperial_I I1 = new Imperial_I(shipNumber, shipName);
			x++;
			y++;

			//Printing out the Ship Specifications
			System.out.println("______________Ship Specifications______________");
			System.out.println("Ship Number: " + I1.getShpNumber()+ "\t" + "Ship Type: " + I1.getShpType() + 
					 "\t" + " Ship Name: " + I1.getShpName() + "\t" +  " Ship Class: " + I1.getShpClass()+ 
					 "\t" + " Ship Crew: " + I1.getShpCrew());
			
			//Printing out the Hull Specifications
			System.out.println("______________Hull Specifications______________");
			Hull H1 = new Hull("H1", "xx");
			H1.displayHullSpecs();
			
			//Printing out the Forward Hull Section Specifications
			FwdHullSection F1 = new FwdHullSection("Imperial_I");
			System.out.println("Forward Hull: HullType: " + F1.getHullType() + "\t" + "Length: " + F1.getLength() + "\t" + " Height: " + F1.getHeight() + "\t" + " Width: " + F1.getWidth() + "\t" + " Weight: " + F1.getWeight());
					
			//Printing out the Aft Hull Section Specifications
			AftHullSection A1 = new AftHullSection("Imperial_I");
			System.out.println("Aft Hull: HullType: " + A1.getHullType() + "\t" + "Length: " + A1.getLength() + "\t" + " Height: " + A1.getHeight() + "\t" + " Width: " + A1.getWidth() + "\t" + " Weight: " + A1.getWeight());		
			
			//Printing out the Deck Specifications
			System.out.println("______________Deck Specifications______________");
			Deck D1 = new Deck("D1", "xx");
			D1.displayDeckSpecs();
			
			//Printing out the Bridge Specifications
			Bridge B1 = new Bridge("Imperial_I");
			System.out.println("Bridge: Deck Type: " + B1.getDeckType() + "\t" + "Star Destroyer Type: " + B1.getStarDestroyerType() + "\t" + "Length: " + B1.getLength() + "\t" + "Height: " + B1.getHeight() + "\t" + "Width: " + B1.getWidth() + "\t" + "Weight: " + B1.getWeight());
						
			//Printing out the Top Deck Specifications
			TopDeck TD1 = new TopDeck("Imperial_I");
			System.out.println("Top Deck: Deck Type: " + TD1.getDeckType() + "\t" + "Star Destroyer Type: " + TD1.getStarDestroyerType() + "\t" + "Length: " + TD1.getLength() + "\t" + "Height: " + TD1.getHeight() + "\t" + "Width: " + TD1.getWidth() + "\t" + "Weight: " + TD1.getWeight());
						
			//Printing out the Main Deck Specifications
			MainDeck MD1 = new MainDeck("Imperial_I");
			System.out.println("Main Deck: Deck Type: " + MD1.getDeckType() + "\t" + "Star Destroyer Type: " + MD1.getStarDestroyerType() + "\t" + "Length: " + MD1.getLength() + "\t" + "Height: " + MD1.getHeight() + "\t" + "Width: " + MD1.getWidth() + "\t" + "Weight: " + MD1.getWeight());
		
			//Printing out the Engine Specifications
			System.out.println("______________Deck Specifications______________");
			Engine E1 = new Engine("E1", "xx");
			E1.displayEngineSpecs();
			
			//Printing out the Starboard Engine Specifications
			Engine_S ES1 = new Engine_S("Imperial_I");
			System.out.println("Starboard Engine: Engine Type: " + ES1.getEngineType() + "\t" + "Length: " + ES1.getLength() + "\t" + "Height: " + ES1.getHeight() + "\t" + "Power: " + ES1.getPower() + "\t" + "Weight: " + ES1.getWeight());
			
			//Printing out the Center Engine Specifications
			Engine_C EC1 = new Engine_C("Imperial_I");
			System.out.println("Center Engine: Engine Type: " + EC1.getEngineType() + "\t" + "Length: " + EC1.getLength() + "\t" + "Height: " + EC1.getHeight() + "\t" + "Power: " + EC1.getPower() + "\t" + "Weight: " + EC1.getWeight());
				
			//Printing out the Port Engine Specifications
			System.out.println("Port Engine: Engine Type: " + ES1.getEngineType() + "\t" + "Length: " + ES1.getLength() + "\t" + "Height: " + ES1.getHeight() + "\t" + "Power: " + ES1.getPower() + "\t" + "Weight: " + ES1.getWeight());			
		
			//Printing out the Fighter Bay Specifications
			System.out.println("______________Fighter Bay Specifications______________");
			
			//Printing out the Starboard Fighter Bay Specifications
			SBay S1 = new SBay("Starboard Bay", "SB-1", 36);
			System.out.println("Starboard Fighter Bay ID: " + S1.getBayID());
			System.out.println(S1.getBayType());
			System.out.println(S1.getBayID());
			System.out.println("Tie Fighter");
			System.out.println("Fighter Capacity: " + S1.getCapacity());
			System.out.println();
			
			//Printing out the Foward Fighter Bay Specifications
			FBay FB1 = new FBay("Forward Bay", "SB-1", 96);
			System.out.println("Forward Fighter Bay ID: " + FB1.getBayID());
			System.out.println(FB1.getBayType());
			System.out.println(FB1.getBayID());
			System.out.println("Tie Fighter");
			System.out.println("Fighter Capacity: " + FB1.getCapacity());
			System.out.println();
			
			//Printing out the Foward Fighter Bay Specifications
			PBay P1 = new PBay("Port Bay", "PB-1", 48);
			System.out.println("Port Fighter Bay ID: " + P1.getBayID());
			System.out.println(P1.getBayType());
			System.out.println(P1.getBayID());
			System.out.println("Tie Fighter");
			System.out.println("Fighter Capacity: " + P1.getCapacity());
			
			//Printing out the Tie Fighter Specifications (using the enums)
			System.out.println("______________Tie Fighter Specifications______________");
			TieFighter.display();
		}
	}


}
