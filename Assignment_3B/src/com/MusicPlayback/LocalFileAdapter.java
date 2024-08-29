package com.MusicPlayback;

public class LocalFileAdapter implements MusicSource {
    private LocalFileSource localFileSource;

   
    public LocalFileAdapter(LocalFileSource localFileSource2) {
		// TODO Auto-generated constructor stub
    	this.localFileSource = localFileSource2;
	}

	@Override
    public void provideMusic(String track) {
        localFileSource.playLocalFile(track);
    }
}
