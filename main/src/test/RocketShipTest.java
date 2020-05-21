package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.RocketShip;

class RocketShipTest {
	
	
	@Test
	public void takeOffTest() {
		RocketShip testRocketShip = new RocketShip(50);
		testRocketShip.takeOff();
		
		assertEquals(30, testRocketShip.getFuelLevel());
		assertEquals(20, testRocketShip.getCurrentHeight());
	}
	
	
	
	
	@Test
	public void fuelUpTest() {
	    RocketShip testRocketShip = new RocketShip(50);
	    testRocketShip.fuelUp(30);
	    assertEquals(80, testRocketShip.getFuelLevel());
	}
	

}
