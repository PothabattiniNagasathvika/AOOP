package com.MusicPlayer;

public class EqualizerDecorator extends MusicPlayerDecorator {
 public EqualizerDecorator(MusicPlayer decoratedPlayer) {
     super(decoratedPlayer);
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

