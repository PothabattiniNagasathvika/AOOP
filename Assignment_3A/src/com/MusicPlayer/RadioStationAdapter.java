package com.MusicPlayer;

public class RadioStationAdapter implements MusicPlayer {
	private RadioStation radioStation;

    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }


	public void play(String track) {
		// TODO Auto-generated method stub
		 radioStation.playRadio(track);
		
	}

}
