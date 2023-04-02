package edu.craptocraft.furnace.Heater;

import edu.craptocraft.furnace.RoomTemperature.RoomTemperature;

public class GasHeater implements Heater {

    public void engage(RoomTemperature temperature) {
        temperature.changeTemperature(1);
    }

    public void disengage(RoomTemperature temperature) {
        temperature.changeTemperature(-1);
    }
    
}
