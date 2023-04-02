package edu.craptocraft.furnace.Heater;

import edu.craptocraft.furnace.RoomTemperature.RoomTemperature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GasHeaterTest {
    
    private static RoomTemperature temperature = null;
    private static GasHeater gasHeater = null;

    @BeforeAll
    public static void setup_GasHeater() {
        temperature = RoomTemperature.getInstance();
        gasHeater = new GasHeater();
    }
    
    @Test
    public void test_Engage() {
        double initialTemperature = temperature.getTemperature();
        gasHeater.engage(temperature);
        double newTemperature = temperature.getTemperature();

        assertEquals(initialTemperature + 1, newTemperature, 0.0);
    }

    @Test
    public void test_Disengage() {
        double initialTemperature = temperature.getTemperature();
        gasHeater.disengage(temperature);
        double newTemperature = temperature.getTemperature();

        assertEquals(initialTemperature - 1, newTemperature, 0.0);
    }

}
