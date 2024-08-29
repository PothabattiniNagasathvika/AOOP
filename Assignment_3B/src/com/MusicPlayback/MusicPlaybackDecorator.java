package com.MusicPlayback;

//MusicPlaybackDecorator.java
public abstract class MusicPlaybackDecorator implements MusicPlayback {
 protected MusicPlayback decoratedPlayback;

 

 public MusicPlaybackDecorator( MusicPlayback decoratedPlayback) {
	// TODO Auto-generated constructor stub
	 this.decoratedPlayback = decoratedPlayback;
}

@Override
 public void play(String track) {
     decoratedPlayback.play(track);
 }
}

