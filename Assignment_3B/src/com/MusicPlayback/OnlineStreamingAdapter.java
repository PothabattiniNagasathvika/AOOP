package com.MusicPlayback;

public class OnlineStreamingAdapter implements MusicSource {
    private OnlineStreamingService onlineStreamingService;

    public OnlineStreamingAdapter(OnlineStreamingService onlineStreamingService) {
        this.onlineStreamingService = onlineStreamingService;
    }

    public void provideMusic(String track) {
        onlineStreamingService.streamOnline(track);
    }
}
