/**
 * 
 */
package com.roomba.diagram;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author nataliacorrea
 *
 */
public class IrobotRoomba implements SelfCheckCapable{
	private MobileApp IrobotRoomba11;
	private ChargingDock IrobotRoomba1;
	private components IrobotRoomba; 
	
	public IrobotRoomba () {
		MobileApp IrobotRoomb = new MobileApp() ;
		IrobotRoomb = new ChargingDock () ;
		IrobotRoomb = new components () ;
	
	
	}
	
	
	private double size;
	private double wheels;
	private String color;
	private int speed;
	private String hardware;
	
	
	public boolean powerOn;
	public boolean powerOff;
	public void clean() {}
	public void moves() {}
	public boolean syncWithMobileApp ;
	public boolean receiveSignalFromChargingDock;
	public boolean receiveSingalFromComponents;
	public boolean playPowerOnSound ;
	public boolean waitForCleaningSingal;
	public boolean demountChargingDock;
	public boolean mountChargingDock;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IrobotRoomba connect = new MobileApp () ;
		
		

	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Roomba On ";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}


