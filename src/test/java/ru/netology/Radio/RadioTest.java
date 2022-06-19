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

    public void shouldUnderStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldOverStation() {
        radio.setCurrentStation(10);
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
