package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldUnderStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldOverStation() {
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldOverLimitStation() {
        radio.setCurrentStation(11);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldVolumeOver() {
        radio.setCurrentVolume(100);
        radio.volumeUp();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeCurrentOver() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
}

    /*@Test
    //  public void shouldNotIncreaseVolume() {
    //     radio.setCurrentVolume(10);
    //     radio.increaseVolume();
    //    Assertions.assertEquals(10, radio.getCurrentVolume());
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
        Assertions.assertEquals(9, radio.getCurrentStation());*/

