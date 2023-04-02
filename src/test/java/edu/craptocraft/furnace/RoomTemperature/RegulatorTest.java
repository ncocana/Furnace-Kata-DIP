package edu.craptocraft.furnace.RoomTemperature;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.craptocraft.furnace.Heater.GasHeater;
import edu.craptocraft.furnace.Thermometer.RemoteCommandSensor;

public class RegulatorTest {
    
    @Test
    public void test_Regulate() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        GasHeater gasHeater = new GasHeater();
        RemoteCommandSensor remoteCommandSensor = new RemoteCommandSensor();
        Regulator regulator = new Regulator();

        temperature.setTemperature(10);
        regulator.regulate(remoteCommandSensor, gasHeater, 15, 21, temperature);
        double finalTemperature = temperature.getTemperature();

        assertTrue(finalTemperature >= 15 && finalTemperature <= 21);
        assertTrue(finalTemperature == 15);
    }

}
