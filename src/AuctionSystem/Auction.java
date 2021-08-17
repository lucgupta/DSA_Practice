package AuctionSystem;

public class Auction {
    private String auctionId;
    private int lowestBidLimit;
    private int highestBidLimit;
    private int participationCost;
    private String sellerName;

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public Auction(String auctionId, int lowestBidLimit, int highestBidLimit, int participationCost, String sellerName) {
        this.auctionId = auctionId;
        this.lowestBidLimit = lowestBidLimit;
        this.highestBidLimit = highestBidLimit;
        this.participationCost = participationCost;
        this.sellerName = sellerName;
    }

    public int getLowestBidLimit() {
        return lowestBidLimit;
    }

    public void setLowestBidLimit(int lowestBidLimit) {
        this.lowestBidLimit = lowestBidLimit;
    }

    public int getHighestBidLimit() {
        return highestBidLimit;
    }

    public void setHighestBidLimit(int highestBidLimit) {
        this.highestBidLimit = highestBidLimit;
    }

    public int getParticipationCost() {
        return participationCost;
    }

    public void setParticipationCost(int participationCost) {
        this.participationCost = participationCost;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}