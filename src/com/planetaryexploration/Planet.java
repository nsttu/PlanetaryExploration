package com.planetaryexploration;

import java.util.ArrayList;
import java.util.List;

public class Planet {
	private final int width;
	private final int heigth;
	private List<Rover> rovers; 
	
	public Planet(int width, int heigth) {
		this.width = width;
		this.heigth =heigth;
		rovers = new ArrayList<Rover>();
	}
	
	public void landOnPlanet(Rover rover){
		rovers.add(rover);
	}
	
	public boolean canMoveTo(int x, int y){
		if (x >= 0 && x <= this.width && y >= 0 && y <= this.heigth) {
			boolean spotAvailable = true;
			for (Rover roverInField : rovers){
				if (roverInField.getX() == x && roverInField.getY() == y){
					spotAvailable = false;
				}
			}
			return spotAvailable;
		}
		return false;
	}
}
