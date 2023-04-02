package edu.craptocraft.furnace.Thermometer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.craptocraft.furnace.RoomTemperature.RoomTemperature;

public class RemoteCommandSensorTest {
    
    @Test
    public void test_Read() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(20);
        RemoteCommandSensor remoteCommandSensor = new RemoteCommandSensor();
        double temperatureValue = remoteCommandSensor.read(temperature);

        assertEquals(20, temperatureValue, 0.0);
    }

}
