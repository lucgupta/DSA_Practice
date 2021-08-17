package AuctionSystem;

import java.util.HashMap;

public class SellerService {
    private static SellerService instance = null;

    private SellerService() {

    }

    public static SellerService getInstance() {
        if(instance == null)
            instance = new SellerService();
        return instance;
    }

    private HashMap<Integer, Seller> sellers = new HashMap<>();

    public Seller addSeller(String name) {
        if(name == null) {
            System.out.println("Seller name can not be null");
            return null;
        }
        Seller seller = new Seller(IdGenerator.getId(), name);
        sellers.put(seller.getId(), seller);
        return seller;
    }

}
