package Unit_2;

import java.util.*;
import java.util.stream.Collectors;

public class Java_Filter_Product {
    public static void main(String[] args) {
        List<Product> product_list = new ArrayList<>();
        product_list.add(new Product(1, "Acer", 51000));
        product_list.add(new Product(2, "Asus", 65000));
        product_list.add(new Product(3, "HP", 48000));
        product_list.add(new Product(4, "Dell", 90000));

        List<Double> new_list = product_list.stream().
                filter(p -> p.price > 40000).
                map(p -> p.price).
                collect(Collectors.toList());

        System.out.println(new_list);
    }
}
