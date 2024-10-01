package com.event;

import java.util.ArrayList;
import java.util.List;

public abstract class Auction implements AuctionEvent{
	private List<Bidder> bidders = new ArrayList<>();
    protected String itemName;

    public Auction(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void subscribe(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void unsubscribe(Bidder bidder) {
        bidders.remove(bidder);
    }

    @Override
    public void notifyBidders(String message) {
        for (Bidder bidder : bidders) {
            bidder.update(message);
        }
    }

    // Auction process steps
    public final void conductAuction() {
        announceItem();
        startBidding();
        endBidding();
    }

    protected abstract void announceItem();

    protected abstract void startBidding();
    
    protected abstract void endBidding();



}
