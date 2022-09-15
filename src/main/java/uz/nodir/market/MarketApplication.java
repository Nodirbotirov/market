package uz.nodir.market;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.nodir.market.model.Product;
import uz.nodir.market.model.User;

import java.util.*;

@SpringBootApplication
public class MarketApplication {
    public static void main(String[] args) {
        Map<User, List<Product>> orders = new HashMap<>();
        List<Product> products = new ArrayList<>();

        products.add(new Product("olma", 14_000D));
        products.add(new Product("nok", 24_000D));
        products.add(new Product("uzum", 20_000D));

        User user = new User("Nodir", 23);

        orders.put(user,products);
        System.out.println(orders);

        Set<User> users = orders.keySet();

        for (User user1: users) {
            System.out.println(user1.getName()+ ": ");
            List<Product> products1 = orders.get(user1);
            int count = 0;
            for (Product product: products1) {
                System.out.println("\t" + ++count + ". " + product.getName());
            }
        }
    }

}
