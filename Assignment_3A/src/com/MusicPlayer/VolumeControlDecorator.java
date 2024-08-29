package com.MusicPlayer;

public class VolumeControlDecorator extends MusicPlayerDecorator {
 public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
     super(decoratedPlayer);
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

