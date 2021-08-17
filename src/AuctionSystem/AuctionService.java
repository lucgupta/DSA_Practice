package AuctionSystem;


import java.util.*;

public class AuctionService {
    private static AuctionService instance = null;

    private AuctionService() {

    }

    public static AuctionService getInstance() {
        if(instance == null)
            instance = new AuctionService();
        return instance;
    }

    SellerService sellerService = SellerService.getInstance();
    BuyerService buyerService = BuyerService.getInstance();

    public HashMap<String, Auction> auctionList = new HashMap<>();

    public Auction createAuction(String auctionId, int low, int high, int cost, String name) {
        Auction auction = new Auction(auctionId, low, high, cost, name);
        auctionList.put(auctionId, auction);
        return auction;
    }

    public String closeAuction(String auction) {
//        HashMap<String, Integer> hm = buyerService.bidding.entrySet()
//                                        .stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
//        buyerService.bidding.
        return " ";
    }
}