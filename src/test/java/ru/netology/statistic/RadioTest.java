package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio();
    @Test
    void SetStationUnderMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void ChangeStation() {
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void setMaxNumberRadio() {
        radio.setCurrentStation(9);
        int expect = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setOverMaxNumberRadio() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void nextNumberRadioIfMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expect = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void nextNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expect = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void prevNumberRadioIfMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expect = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void prevNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expect = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void shouldChangeVolume() {
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(6);
        radio.volumeDown();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume1() {
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume2() {
        radio.setCurrentVolume(-1);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

}

