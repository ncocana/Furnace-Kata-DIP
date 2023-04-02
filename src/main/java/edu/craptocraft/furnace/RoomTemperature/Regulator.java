package edu.craptocraft.furnace.RoomTemperature;

import edu.craptocraft.furnace.Heater.Heater;
import edu.craptocraft.furnace.Thermometer.Thermometer;

public class Regulator {
    
    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature) {
        while (thermometer.read(temperature) < maxTemp) {
            heater.engage(temperature);
            System.out.println("Heating... Temperature: " + temperature.getTemperature());
        }

        while (thermometer.read(temperature) > minTemp) {
            heater.disengage(temperature);
            System.out.println("Resting... Temperature: " + temperature.getTemperature());
        }
    }

}
