package com.event;

public class ReserveAuction extends Auction {
    private double reservePrice;

    public ReserveAuction(String itemName, double reservePrice) {
        super(itemName);
        this.reservePrice = reservePrice;
    }

	@Override
	protected void announceItem() {
		// TODO Auto-generated method stub
		System.out.println("Starting reserve auction for  with reserve price of " + reservePrice);
         
		
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		
	}
}
