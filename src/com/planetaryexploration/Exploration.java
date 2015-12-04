package com.planetaryexploration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Exploration {
	private Planet mars;
	private Rover rover1;
	private Rover rover2;
	
	public static void main(String[] args) throws IOException{
		new Exploration().start(args, new BufferedReader(new InputStreamReader(System.in)), System.out );
	}
	
	public void start(String[] args, BufferedReader in, PrintStream out) throws IOException{
		int counter = 0;
		String[] dimension;
		String[] position;
		while (true) {
	         String input = in.readLine();
	         switch (counter) {
	         	case 0:
	         		dimension = input.split(" "); 
	         		mars = new Planet(Integer.parseInt(dimension[0]), Integer.parseInt(dimension[1]));
	         		break;
	        	case 1:
	         		position = input.split(" "); 
	         		rover1 = new Rover();
	         		rover1.land(Integer.parseInt(position[0]), Integer.parseInt(position[1]), position[2], mars);
	         		break;
	        	case 2:
	         		rover1.move(input);
	         		break;
	        	case 3:
	         		position = input.split(" "); 
	         		rover2 = new Rover();
	         		rover2.land(Integer.parseInt(position[0]), Integer.parseInt(position[1]), position[2], mars);
	         		break;
	        	case 4:
	         		rover2.move(input);
	         		break;
	         }
	         counter++;
	         if (counter == 5){
	        	 out.print(rover1.getPosition()+"\n"+rover2.getPosition());
	        	 return;
	         }
	      }
	}
	
}
