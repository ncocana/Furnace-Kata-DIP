package edu.craptocraft.furnace;

import edu.craptocraft.furnace.Heater.GasHeater;
import edu.craptocraft.furnace.Heater.Heater;
import edu.craptocraft.furnace.RoomTemperature.Regulator;
import edu.craptocraft.furnace.RoomTemperature.RoomTemperature;
import edu.craptocraft.furnace.Thermometer.RemoteCommandSensor;
import edu.craptocraft.furnace.Thermometer.Thermometer;

public class App 
{
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        temperature = RoomTemperature.getInstance();
        // Jedi yoda = new Jedi();
        // System.out.println( "\nArrancando a Yoda: " );
        // regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        // yoda.speak();

        // Heater luke = new Jedi();
        // luke.speak(); // ups, The method speak() is undefined for the type HeaterJava
    }
}
