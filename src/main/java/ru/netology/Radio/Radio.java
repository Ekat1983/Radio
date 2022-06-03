package ru.netology.Radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        int minVolume = 0;
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        int maxVolume = 10;
        int minVolume = 0;
        if (currentVolume > maxVolume | currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void increaseStation() {  //должно увеличиваться
        int maxStation = 9;
        int minStation = 0;
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        ++currentStation;
    }

    public void decreaseStation() { //следует уменьшить количество
        int maxStation = 9;
        int minStation = 0;
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        --currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        int maxStation = 9;
        int minStation = 0;
        if (currentStation > maxStation || currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }
}

