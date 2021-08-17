package basicConcepts;

import java.util.*;
import java.util.stream.Collectors;

class Product1{
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamDemo4 {
    public static void main(String[] args) {
        List<Product1> productsList = new ArrayList<Product1>();
        //Adding Products
        productsList.add(new Product1(1,"HP Laptop",25000f));
        productsList.add(new Product1(2,"Dell Laptop",30000f));
        productsList.add(new Product1(3,"Lenevo Laptop",28000f));
        productsList.add(new Product1(5,"Apple Laptop",90000f));
        productsList.add(new Product1(4,"Sony Laptop",28000f));

        //to get data into list
        List<Float> productPriceList2 =productsList.stream()
                                                    .filter(p -> p.price < 30000)
                                                    .map(p-> p.price)
                                                    .collect(Collectors.toList());

        System.out.println(productPriceList2);

        //to get data into set
        Set<Float> productPriceList3 =productsList.stream()
                .filter(p -> p.price < 30000)
                .map(p-> p.price)
                .collect(Collectors.toSet());

        System.out.println(productPriceList3);

        //using forEach loop
        productsList.stream()
                .filter(p-> p.price < 30000)
                .forEach(product -> System.out.println(product.name));

        //sum of all the prices
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.price));
        System.out.println(totalPrice3);
    }
}