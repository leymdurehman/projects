package com.techelevator;

public class Television {

	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	//turns off TV.
    public void turnOff() {
    	
    	this.isOn = false;
    	
    }
    //turns tv on and
    //resets channel to 3
    //and vol lvl to 2
    public void turnOn() {
    	this.isOn = true;
    	this.currentChannel = 3;
    	this.currentVolume = 2;
    }
    
    //changes the current channel only
   // if its on to the value
   // ofnewChannel as lng as its between 3 and 18

    public void changeChannel(int newChannel) {
    	if	(this.isOn && newChannel >=3 && newChannel <=18)  {
    		
    		this.currentChannel = newChannel;
    	}
    	
    }
    public void channelUp() {
    	if	(this.isOn) {
    		
    		this.currentChannel++;
    			if(this.currentChannel >18) {
    				this.currentChannel = 3;
    			}
    	}	
    	  	
    }
    
  
    
    public void channelDown() {
    	if (this.isOn) {
    		
    		this.currentChannel = this.currentChannel - 1;
    		if(this.currentChannel < 3) {
    			this.currentChannel = 18;
    			
    		}
    		
    		
    		
    		
    	}
    	
    	
    }
    public void raiseVolume() {
    	if(this.isOn && this.currentVolume < 10) {
    		this.currentVolume++;
    		
    	}
    	
    	
    	
    	
    }
    public void lowerVolume() {
    	
    	
    	if(this.isOn && this.currentVolume > 0) {
		
    		this.currentVolume--;
		}
    
    
    }
	
	
	
	
	
	
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
	
}
