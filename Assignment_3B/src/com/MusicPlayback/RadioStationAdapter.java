package com.MusicPlayback;

public class RadioStationAdapter implements MusicSource {
    private RadioStation radioStation;

    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }

    public void provideMusic(String track) {
        radioStation.playRadio(track);
    }
}
