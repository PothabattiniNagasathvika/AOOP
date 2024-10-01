package com.event;

public class AuctionSystem {
	public static void main(String[] args) {
        // Create bidders
        Bidder bidder1 = new ConcreteBidder("Bidder 1");
        Bidder bidder2 = new ConcreteBidder("Bidder 2");
        Bidder bidder3 = new ConcreteBidder("Bidder 3");

        // Create and configure a standard auction
        Auction standardAuction = new StandardAuction("Painting");
        standardAuction.subscribe(bidder1);
        standardAuction.subscribe(bidder2);

        // Conduct the standard auction
        System.out.println("Conducting Standard Auction:");
        standardAuction.conductAuction();

        System.out.println();

        // Create and configure a reserve auction
        Auction reserveAuction = new ReserveAuction("Antique Vase", 500.0);
        reserveAuction.subscribe(bidder1);
        reserveAuction.subscribe(bidder3);

        // Conduct the reserve auction
        System.out.println("Conducting Reserve Auction:");
        reserveAuction.conductAuction();
    }


}
