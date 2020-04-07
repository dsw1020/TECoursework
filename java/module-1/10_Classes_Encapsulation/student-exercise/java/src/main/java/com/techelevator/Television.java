package com.techelevator;

public class Television {
	
	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	//********************************************************************************************
	// Constructors for the class
	//*********************************************************************************************
	
	
	public Television() {
		this.isOn = false;
		this.currentChannel = 3;
		this.currentVolume = 2;
	}
	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	//********************************************************************************************
	// methods - Perform processing 
	//********************************************************************************************
	
	public void turnOff() {
		isOn = false;
	}

	public void turnOn() {
		isOn = true;
	}

	public void changeChannel(int newChannel) {
		if (isOn == true) {
			if (currentChannel >= 3 && currentChannel <= 18) {
				this.currentChannel = newChannel;
			}
		}
	}

	public void channelUp() {
		if (isOn == true) {
			if (currentChannel >= 3 && currentChannel < 18) {
				this.currentChannel = currentChannel + 1;
			}
			else this.currentChannel = 3;
		}
	}

	public void channelDown() {
		if (isOn == true) {
			if (currentChannel > 3 && currentChannel <= 18) {
				this.currentChannel = currentChannel - 1;
			}
			else this.currentChannel = 18;
		}
	}

	public void raiseVolume() {
		if (isOn == true) {
			if (currentVolume >= 0 && currentVolume <= 10) {
				this.currentVolume = currentVolume + 1;
			}
		}
	}

	public void lowerVolume() {
		if (isOn == true && currentVolume > 0) {
				this.currentVolume = currentVolume - 1;
			}
			else this.currentVolume = 0;
		}
	}


