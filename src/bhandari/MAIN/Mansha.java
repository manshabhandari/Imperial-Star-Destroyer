package bhandari.MAIN;

import bhandari.FACTORY.*;

public class Mansha {
	
	public static void main(String[] args) {
		
		ISD1_Factory I1 = new ISD1_Factory("ISD1");
		ISD2_Factory I2 = new ISD2_Factory("ISD2");
		
		I1.buildISDs(1);
		I2.buildISDs(1);
		
		I1.displayISDs();
		System.out.println();
		I2.displayISDs();
		System.out.println();
	}
	
}
