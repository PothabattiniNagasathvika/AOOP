package com.MusicPlayback;

public class Main {
 public static void main(String[] args) {
     // Create instances of music sources
     LocalFileSource localFileSource = new LocalFileSource();
     OnlineStreamingService onlineStreamingService = new OnlineStreamingService();
     RadioStation radioStation = new RadioStation();

     // Create adapters for each music source
     LocalFileAdapter localFileAdapter = new LocalFileAdapter(localFileSource);
     MusicSource onlineStreamingAdapter = new OnlineStreamingAdapter(onlineStreamingService);
     MusicSource radioStationAdapter = new RadioStationAdapter(radioStation);

     // Create basic music playback instances
     MusicPlayback localFilePlayback = new BasicMusicPlayback(localFileAdapter);
     MusicPlayback onlineStreamingPlayback = new BasicMusicPlayback(onlineStreamingAdapter);
     MusicPlayback radioStationPlayback = new BasicMusicPlayback(radioStationAdapter);

     // Decorate playback with additional features
     MusicPlayback equalizedLocalPlayback = new EqualizerDecorator(localFilePlayback);
     MusicPlayback volumeControlledOnlinePlayback =  (MusicPlayback) new VolumeControlDecorator(onlineStreamingPlayback);
     MusicPlayback fullyDecoratedRadioPlayback =  (MusicPlayback) new VolumeControlDecorator(new EqualizerDecorator(radioStationPlayback));

     // Demonstration
     System.out.println("Playing with equalizer on local file player:");
     equalizedLocalPlayback.play("song.mp3");

     System.out.println("\nStreaming with volume control:");
     volumeControlledOnlinePlayback.play("http://streaming.url");

     System.out.println("\nPlaying radio with equalizer and volume control:");
     fullyDecoratedRadioPlayback.play("Rock FM");
 }
}

