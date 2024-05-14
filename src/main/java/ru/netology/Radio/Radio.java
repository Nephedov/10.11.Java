package ru.netology.Radio;

public class Radio {
    private int numberOfStations = 10;
    private int maxStation = numberOfStations - 1;
    private int minStation = 0;
    private int currentStation;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int newNumberOfStation) {
        this.numberOfStations = newNumberOfStation;
    }


    public void setStation(int newStation) {
        if (newStation >= 0 & newStation < this.numberOfStations) {
            currentStation = newStation;
        }
    }


    public void nextStation() {
        this.maxStation = this.numberOfStations - 1;
        if (currentStation >= maxStation) {
            currentStation = 0;
            return;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        this.maxStation = numberOfStations - 1;
        if (currentStation <= 0) {
            currentStation = maxStation;
            return;
        } else {
            currentStation--;
        }
    }

    public int getStation() {
        return currentStation;
    }


    public void setHigherVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void setLowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}



