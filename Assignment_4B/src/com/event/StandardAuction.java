package com.event;

public class StandardAuction extends Auction {
	 public StandardAuction(String itemName) {
	        super(itemName);
	    }

	@Override
	protected void announceItem() {
		// TODO Auto-generated method stub
		 notifyBidders("The item '" + itemName + "' is now available for bidding in a standard auction.");

		
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		notifyBidders("Bidding has started for '" + itemName + "'.");

		
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		notifyBidders("Bidding has ended for '" + itemName + "'.");

		
	}


}
