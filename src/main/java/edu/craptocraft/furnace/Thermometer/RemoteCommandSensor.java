package edu.craptocraft.furnace.Thermometer;

import edu.craptocraft.furnace.RoomTemperature.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
    
}
