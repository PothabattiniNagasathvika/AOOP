package com.MusicPlayer;

public class LocalFileAdapter implements MusicPlayer {
	private LocalFilePlayer localFilePlayer;

    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }

public void play(String track) {
	// TODO Auto-generated method stub
	 localFilePlayer.playLocalFile(track);
	
}
}