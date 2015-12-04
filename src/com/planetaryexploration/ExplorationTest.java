package com.planetaryexploration;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import org.junit.Before;
import org.junit.Test;

public class ExplorationTest {	
	private final ByteArrayOutputStream outline1 = new ByteArrayOutputStream();
	
	@Before
	public final void resetOutputStreams() {
		outline1.reset();
	} 
	
	@Test
	public void makePlanetAndExplore() throws IOException {
		String line1 = "5 5\n";
	    String line2 = "1 2 N\n";
	    String line3 = "LMLMLMLMM\n";
	    String line4 = "3 3 E\n";
	    String line5 = "MMRMMRMRRM\n";
	 	    
		BufferedReader in = new BufferedReader(new StringReader(
		         line1 + line2 + line3 + line4 + line5
		));

		new Exploration().start(null, in, new PrintStream(outline1));
		assertEquals("1 3 N\n5 1 E", outline1.toString());
	}

}
