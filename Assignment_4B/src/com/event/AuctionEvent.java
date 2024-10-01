package com.event;

public interface AuctionEvent {
	void subscribe(Bidder bidder);
	void unsubscribe(Bidder bidder);
	void notifyBidders(String message);


}
