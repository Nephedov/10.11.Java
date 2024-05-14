package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void trueToTheHighBorderOfSetCurrentStation() {
        Radio radio = new Radio();

        int expected = 8;
        radio.setStation(8);

        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void trueTheHighBorderOfSetCurrentStation() {
        Radio radio = new Radio();

        int expected = 9;
        radio.setStation(9);

        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void falseAcrossTheHighBorderOfSetCurrentStation() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setStation(10);

        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void trueToTheLowBorderOfSetCurrentStation() {
        Radio radio = new Radio();

        int expected = 1;
        radio.setStation(1);

        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void trueTheLowBorderOfSetCurrentStation() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setStation(0);

        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void falseAcrossTheLowBorderOfSetCurrentStation() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setStation(-1);

        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void trueToTheBorderOfNextStationTest() {
        Radio radio = new Radio();

        radio.setStation(7);
        radio.nextStation();

        int expected = 8;
        int actual = (radio.getStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueTheBorderOfNextStationTest() {
        Radio radio = new Radio();

        radio.setStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = (radio.getStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void falseAcrossTheBorderOfNextStationTest() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = (radio.getStation());

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void trueToTheBorderOfPrevStationTest() {
        Radio radio = new Radio();

        radio.setStation(2);
        radio.prevStation();

        int expected = 1;
        int actual = (radio.getStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueTheBorderOfPrevStationTest() {
        Radio radio = new Radio();

        radio.setStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = (radio.getStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void falseAcrossTheBorderOfPrevStationTest() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = (radio.getStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void toTheHighBorderNumberOfStationWithParametersTest() {
        Radio radio = new Radio(100);

        radio.setStation(98);
        int expected = 98;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void theHighBorderNumberOfStationWithParametersTest() {
        Radio radio = new Radio(100);

        radio.setStation(99);
        int expected = 99;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void acrossTheHighBorderNumberOfStationWithParametersTest() {
        Radio radio = new Radio(100);

        radio.setStation(100);
        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void toTheBorderNextStationWithParametersTest() {
        Radio radio = new Radio(100);
        radio.setStation(97);
        radio.nextStation();

        int expected = 98;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void theBorderNextStationWithParametersTest() {
        Radio radio = new Radio(100);
        radio.setStation(98);
        radio.nextStation();

        int expected = 99;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void acrossTheBorderNextStationWithParametersTest() {
        Radio radio = new Radio(100);
        radio.setStation(99);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void toTheBorderPrevStationWithParametersTest() {
        Radio radio = new Radio(100);
        radio.setStation(2);
        radio.prevStation();

        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void theBorderPrevStationWithParametersTest() {
        Radio radio = new Radio(100);
        radio.setStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void acrossTheBorderPrevStationWithParametersTest() {
        Radio radio = new Radio(100);
        radio.setStation(0);
        radio.prevStation();

        int expected = 99;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueToTheBorderOfSetHigherVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 99; i++) {
            radio.setHigherVolume();
        }

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueBorderOfSetHigherVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 100; i++) {
            radio.setHigherVolume();
        }

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void falseAcrossBorderOfSetHigherVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 101; i++) {
            radio.setHigherVolume();
        }

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueToTheBorderSetLowerVolume() {
        Radio radio = new Radio();


        radio.setHigherVolume();
        radio.setHigherVolume();

        radio.setLowerVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueTheBorderSetLowerVolume() {
        Radio radio = new Radio();


        radio.setHigherVolume();
        radio.setLowerVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void falseAcrossTheBorderSetLowerVolume() {
        Radio radio = new Radio();


        radio.setLowerVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
