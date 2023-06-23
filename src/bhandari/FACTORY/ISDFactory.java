package bhandari.FACTORY;

import java.util.ArrayList;
import bhandari.ISD.StarDestroyer;

public abstract class ISDFactory {

	//Defining the variables
	private String name;
	private String buildType;
	protected ArrayList<StarDestroyer> dryDock;
	
	//Creating the constructor
	public ISDFactory(String name) {
		this.name = name;
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}
	
	
	public ArrayList<StarDestroyer> getDryDock() {
		return dryDock;
	}

	public void setDryDock(ArrayList<StarDestroyer> dryDock) {
		this.dryDock = dryDock;
	}
	
	//Abstract methods to build and display ISDs
	public abstract boolean buildISDs(int count);

	public abstract void displayISDs();
		
}
