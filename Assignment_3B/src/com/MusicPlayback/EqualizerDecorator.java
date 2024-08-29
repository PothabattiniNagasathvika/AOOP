package com.MusicPlayback;

public class EqualizerDecorator extends MusicPlaybackDecorator {
 public EqualizerDecorator(MusicPlayback decoratedPlayback) {
     super(decoratedPlayback);
 }

 @Override
 public void play(String track) {
     super.play(track);
     addEqualizer();
 }

 private void addEqualizer() {
     System.out.println("Applying equalizer settings.");
 }
}

