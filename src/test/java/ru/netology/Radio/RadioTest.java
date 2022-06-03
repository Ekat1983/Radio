package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNotIncreaseVolume() {
       radio.setCurrentVolume(10);
       radio.increaseVolume();
       Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {   //не следует увеличивать объем
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() { //следует уменьшить объем
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() { //следует увеличивать объем
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeUnderMinimum() { //не следует устонавливать
        radio.setCurrentVolume(-11);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeOverMaximum() { //Не следует устанавливать объем более максимального
        radio.setCurrentVolume(11);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationOverMax() {
        radio.setCurrentStation(12);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        radio.setCurrentStation(-12);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(8);
        radio.increaseStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation0() {
        radio.setCurrentStation(9);
        radio.increaseStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        radio.setCurrentStation(1);
        radio.decreaseStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void ShoulddecreasestationWhencurrent0() {
        radio.decreaseStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }
}