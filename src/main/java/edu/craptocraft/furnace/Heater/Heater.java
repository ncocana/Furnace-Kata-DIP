package edu.craptocraft.furnace.Heater;

import edu.craptocraft.furnace.RoomTemperature.RoomTemperature;

public interface Heater {
    
    void engage(RoomTemperature temperature);
	void disengage(RoomTemperature temperature);
    
}
