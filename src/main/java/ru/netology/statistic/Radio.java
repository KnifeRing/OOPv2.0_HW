package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (maxStation <= currentStation) {
            setCurrentStation(minStation);
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }

    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        }

    }
}
