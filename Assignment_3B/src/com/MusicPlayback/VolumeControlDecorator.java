package com.MusicPlayback;

public class VolumeControlDecorator extends MusicPlaybackDecorator {
 public VolumeControlDecorator(MusicPlayback onlineStreamingPlayback) {
	// TODO Auto-generated constructor stub
	 super(onlineStreamingPlayback);
}



@Override
 public void play(String track) {
     super.play(track);
     adjustVolume();
 }

 private void adjustVolume() {
     System.out.println("Adjusting volume levels.");
 }
}

