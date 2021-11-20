/**
 * 
 */
package com.roomba.diagram;

/**
 * @author nataliacorrea
 *
 */
public class Battery extends components {
		private charge Battery;
		private replace Battery;
		private detectLowBatteryLife Battery; 
		
		public IrobotRoomba () {
			Battery = new charge() ;
			Battery = new replace () ;
			Battery = new detectLowBatteryLife () ;
		
		
		
	
	
	
	
	
	private double batteryCapacity;
	private double batteryLife; 
	private double chargingTime;
	
	
	public void charge() {}
	public void replace() {}
	public boolean detectLowBatteryLife ;

	

}
