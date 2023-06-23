package bhandari.INTERFACES;

public interface Maneuvers {
	
	//Methods to navigate to Position, and the Turn Radius
	public abstract void navigatesToPosition(String p);
	
	public static final int TURN_RADIUS = 100;
}
