package vending;

import java.util.List;
import java.util.Map;

public interface VendingMachine {
    public long selectItemAndGetPrice(Item item);
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Map<Item, List<Coin>> collectItemAndChange();
    public void reset();
}

