package com.planetaryexploration;

public class Rover {
	private int x;
	private int y;
	private String facingTowards;
	private Planet planet;
	
	public Rover(){
		
	}
	
	public void land(int x, int y, String facing, Planet planet){
		if (planet.canMoveTo(x, y)) {
			this.x = x;
			this.y = y;
			this.facingTowards = facing;
			this.planet = planet;
			planet.landOnPlanet(this);
		}
	}
	public void move(String moveTo){
		for (int i = 0; i < moveTo.length(); i++) {;
			switch (moveTo.substring(i, i+1)){
				case "L":
					switch (facingTowards){
						case "N": 
							facingTowards = "W";
							break;
						case "E":
							facingTowards = "N";
							break;
						case "S":
							facingTowards = "E";
							break;
						case "W":
							facingTowards = "S";
							break;
					}
					break;
				case "R":
					switch (facingTowards){
						case "N": 
							facingTowards = "E";
							break;
						case "E":
							facingTowards = "S";
							break;
						case "S":
							facingTowards = "W";
							break;
						case "W":
							facingTowards = "N";
							break;
					}
					break;
				case "M":
					switch (facingTowards){
						case "N": 
							if (planet.canMoveTo(x, y+1)){
								y++;
							}
							break;
						case "E":
							if (planet.canMoveTo(x+1, y)){
								x++;
							}
							break;
						case "S":
							if (planet.canMoveTo(x, y-1)){
								y--;
							}
							break;
						case "W":
							if (planet.canMoveTo(x-1, y)){
								x--;
							}
							break;
					}
					break;
			}
		}
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	public String getPosition(){
		return ""+x+" "+y+" "+facingTowards;
	}
}
