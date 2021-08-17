package AuctionSystem;

import java.util.HashMap;

public class BuyerService {
    private static BuyerService instance = null;

    private BuyerService() {

    }

    public static BuyerService getInstance() {
        if(instance == null)
            instance = new BuyerService();
        return instance;
    }

    AuctionService auctionService = AuctionService.getInstance();

    private HashMap<String, Buyer> buyers = new HashMap<>();
    public HashMap<String, Integer> bidding = new HashMap<>();

    public Buyer addBuyer(String name) {
        if(name == null) {
            System.out.println("Buyer name can not be null");
            return null;
        }
        Buyer buyer = new Buyer(IdGenerator.getId(), name);
        buyers.put(name, buyer);
        return buyer;
    }

    public Buyer createBid(String buyer, String auction, int amount) {
        String name = buyer;
        Buyer b = buyers.get(name);
        if(b == null)
            System.out.println("Buyer with name" + buyer + " is not present");
        if(auctionService.auctionList.get(auction) == null)
            System.out.println("auction with " + auction + " is not present");

        bidding.put(buyer, amount);
        return b;
    }

    public Buyer updateBid(String name, String auction, int amount) {
        Buyer buyer = buyers.get(name);
        if(buyer != null) {
            bidding.put(name, amount);
        }
        return buyer;
    }

    public void withdrawBid(String name, String auction) {
        Buyer buyer = buyers.get(name);
        if(buyer != null) {
            buyers.remove(name);
        }
    }

}
