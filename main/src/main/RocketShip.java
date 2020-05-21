package main;

import Exception.InsufficientFuelException;
import Exception.LandingException;

public class RocketShip {
	
	int MAX_FUEL_LEVEL = 100;

    int fuelLevel;
    int currentHeight;

    public RocketShip(int fuelLevel) {
        this.fuelLevel = fuelLevel;
        this.currentHeight = 0;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getCurrentHeight() {
        return currentHeight;
    }

    public void fuelUp(int fuelAmount) {
        fuelLevel += fuelAmount;
    }

    public void takeOff() {
    	
    	if (fuelLevel >= 20) {
    		fuelLevel -= 20;
            currentHeight += 20;
    		
    	} else {
    		throw new InsufficientFuelException("Not enough fuel!");
    		
    	}
    	
            
    }

    public void goHigher() {
        fuelLevel -= 10;
        currentHeight += 50;
    }

    public void goLower() {
        currentHeight -= 50;
    }

    public void land() {
    	
    	if (currentHeight <= 20) {
            currentHeight = 0;
    		
    	} else {
    		throw new LandingException("Too high to land!");
    		
    	}
    	
    }
    
    
    
    
    public void testFlight() {
    	
    	try {
    		takeOff();
    		
    		goHigher();
        	goLower();
        	
    	} catch (InsufficientFuelException e) {
    		System.out.println(e.getMessage());
    		
    	} catch (LandingException e) {
    		System.out.println(e.getMessage());
    		
    	} finally {
    		System.out.println("Cleaning up launch pad");
    		
    	}
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		RocketShip r = new RocketShip(19);
//		
//		r.goHigher();
//		r.land();
	}

}












