/**
 * 
 */
package com.roomba.diagram;

/**
 * @author nataliacorrea
 *
 */
public class Camera extends Sensors {

		private scanRoom Camera;
		private createMap Camera;
		private detectObstacle Camera; 
		
		public IrobotRoomba () {
			Camera = new scanRoom() ;
			Camera = new createMap () ;
			Camera = new detectObstacle () ;
		
		
		
	
	
	
	
	private double pixels;
	
	public boolean scanRoom;
	public boolean createMap;
	public boolean detectObstacle;
	
	
	
}
