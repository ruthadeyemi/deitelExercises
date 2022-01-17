package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

   // public String acName;

    @Test
    public void acCanBeTurnOnTest(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        assertFalse(lg.isOn());
        lg.turnOn();
        assertTrue(lg.isOn());
    }

    @Test
    public void acCanBeTurnedOffTest(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        lg.turnOn();
        assertTrue(lg.isOn());
        lg.turnOff();
        assertFalse(lg.isOn());
    }

    @Test
    public void acTemperatureCanBeIncreasedTest(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        lg.turnOn();
        assertTrue(lg.isOn());
        int currentTemperature = lg.getTemperature();
        assertEquals(16, lg.currentTemperature);
        lg.increaseTemperature();
        currentTemperature = lg.getTemperature();
        assertEquals(17, lg.getTemperature());
    }

    @Test
    public void acTemperatureCanBeDecreaseTest(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        lg.turnOn();
        assertTrue(lg.isOn());
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(19, lg.getTemperature());
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        assertEquals(17, lg.getTemperature());
    }

    @Test
    public void acTemperatureCantGoAbove30Test(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        lg.turnOn();
        for(int i = 0; i < 14; i++){
            lg.increaseTemperature();
        }
        assertEquals(30, lg.getTemperature());
        lg.increaseTemperature();
        assertEquals(30, lg.getTemperature());
    }

    @Test
    public void acCannotGoBelow18Test(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        assertEquals(16, lg.getTemperature());
    }

    @Test
    public void acTemperatureIsZeroWhenTurnedOff(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        lg.turnOff();
        assertFalse(lg.isOn());
        int temperature = lg.getTemperature();
        assertEquals(0, temperature);
    }

    @Test
    public void acTemperatureCannotBeIncreasedWhenOffTest(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        assertFalse(lg.isOn());
        lg.increaseTemperature();
        assertEquals(0, lg.getTemperature());
        lg.turnOn();
        assertEquals(16, lg.getTemperature());
    }

    @Test
    public void acRetainsTemperatureAfterRestartTest(){
        MyAirConditioner lg = new MyAirConditioner("lg AC");
        lg.turnOn();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(20, lg.getTemperature());
        lg.turnOff();
        lg.turnOn();
        assertEquals(20, lg.getTemperature());
    }
}
