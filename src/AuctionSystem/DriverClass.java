package AuctionSystem;

public class DriverClass {
    public static void main(String[] args) {
        System.out.println("Auction started");
        BuyerService buyerService = BuyerService.getInstance();
        Buyer buyer1 = buyerService.addBuyer("Buyer1");
        Buyer buyer2 = buyerService.addBuyer("Buyer2");
        Buyer buyer3 = buyerService.addBuyer("Buyer3");

        SellerService sellerService = SellerService.getInstance();
        Seller seller1 = sellerService.addSeller("Seller1");

        AuctionService auctionService = AuctionService.getInstance();
        Auction auction = auctionService.createAuction("A1", 10, 50, 1, "Seller1");

        buyer1 = buyerService.createBid("Buyer1", "A1", 17);
        buyer2 = buyerService.createBid("Buyer2", "A1", 15);
        buyer2 = buyerService.updateBid("Buyer2", "A1", 19);
        buyer3 = buyerService.createBid("Buyer3", "A1", 20);
        buyerService.withdrawBid("Buyer1", "A1");

        String winner = auctionService.closeAuction("A1");

    }
}


