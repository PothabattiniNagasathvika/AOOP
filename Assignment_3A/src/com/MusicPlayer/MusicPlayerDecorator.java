package com.MusicPlayer;

public abstract class MusicPlayerDecorator implements MusicPlayer {
 protected MusicPlayer decoratedPlayer;

 public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
     this.decoratedPlayer = decoratedPlayer;
 }

 public void play(String track) {
     decoratedPlayer.play(track);
 }
}

