package edu.craptocraft.furnace.RoomTemperature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTemperatureTest {
    
    @Test
    public void test_ChangeTemperature() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        double initialTemperature = temperature.getTemperature();
        temperature.changeTemperature(2.5);
        double newTemperature = temperature.getTemperature();

        assertEquals(initialTemperature + 2.5, newTemperature, 0.0);
    }

}
