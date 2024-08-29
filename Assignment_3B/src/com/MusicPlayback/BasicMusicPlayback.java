package com.MusicPlayback;

//BasicMusicPlayback.java
public class BasicMusicPlayback implements MusicPlayback {
 private MusicSource musicSource;

 public BasicMusicPlayback(MusicSource musicSource) {
     this.musicSource = musicSource;
 }

 public void play(String track) {
     musicSource.provideMusic(track);
 }
}
