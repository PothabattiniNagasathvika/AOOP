package com.MusicPlayer;

public class Main {
 public static void main(String[] args) {
     // Create instances of different music sources
     LocalFilePlayer localFilePlayer = new LocalFilePlayer();
     OnlineStreamingService onlineStreamingService = new OnlineStreamingService();
     RadioStation radioStation = new RadioStation();

     // Adapters for each music source
     MusicPlayer localFileAdapter = new LocalFileAdapter(localFilePlayer);
     MusicPlayer onlineStreamingAdapter = new OnlineStreamingAdapter(onlineStreamingService);
     MusicPlayer radioStationAdapter = new RadioStationAdapter(radioStation);

     // Decorators to add features
     MusicPlayer equalizedLocalPlayer = new EqualizerDecorator(localFileAdapter);
     MusicPlayer volumeControlledOnlinePlayer = new VolumeControlDecorator(onlineStreamingAdapter);
     MusicPlayer fullyDecoratedRadioPlayer = new VolumeControlDecorator(new EqualizerDecorator(radioStationAdapter));

     // Demonstration
     System.out.println("Playing with equalizer on local file player:");
     equalizedLocalPlayer.play("song.mp3");

     System.out.println("\nStreaming with volume control:");
     volumeControlledOnlinePlayer.play("http://streaming.url");

     System.out.println("\nPlaying radio with equalizer and volume control:");
     fullyDecoratedRadioPlayer.play("Rock FM");
 }
}

