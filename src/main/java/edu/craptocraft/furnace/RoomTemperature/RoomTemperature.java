package edu.craptocraft.furnace.RoomTemperature;

public class RoomTemperature {
    
    private static RoomTemperature instance = null;
    private double temperatureValue = 0d;

    private RoomTemperature() {}

    public static RoomTemperature getInstance() {
        if (instance == null) {
            instance = new RoomTemperature();
        }
        return instance;
    }

    public double getTemperature() {
        return this.temperatureValue;
    }

    public void setTemperature(double newTemperatureValue) {
        this.temperatureValue = newTemperatureValue;
    }

    public void changeTemperature(double temperatureChange) {
        this.temperatureValue += temperatureChange;
    }

}
