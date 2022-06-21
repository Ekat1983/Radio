package ru.netology.Radio;

public class Radio {


    private int id;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
}


     /*   private int currentStation;
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
        this.currentStation = currentStation;*/






