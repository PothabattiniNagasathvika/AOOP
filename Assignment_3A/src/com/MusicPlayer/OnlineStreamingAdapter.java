package com.MusicPlayer;

public class OnlineStreamingAdapter implements MusicPlayer {
	private OnlineStreamingService onlineStreamingService;

    public OnlineStreamingAdapter(OnlineStreamingService onlineStreamingService) {
        this.onlineStreamingService = onlineStreamingService;
    }

	public void play(String track) {
		// TODO Auto-generated method stub
		 onlineStreamingService.streamOnline(track);
		
	}

}
