import uz.nodir.market.model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main150922 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        int step = 1;
        while (step != 0){
            step = scannerInt.nextInt();
            System.out.println("1. ADD 2. LIST 0. EXIT");

            switch (step){
                case 1:
                    Product newProduct = new Product("Olma", 10_000D);
                    newProduct.setCount(105);
                    newProduct.setCreatedDate(new Date());
                    productList.add(newProduct);
                    break;
                case 2:
                    for (Product product: productList) {
                        long defferentDay = getLimitDay(product.getCreatedDate());
                        if (defferentDay <= 10){
                            print(product);
                        }
                    }

                    break;
            }
        }

    }
    private static long getLimitDay(Date productDate) {
        long currentTimeMillis = System.currentTimeMillis();
        long createdProductTime = productDate.getTime();


        long l = currentTimeMillis / 1000 / 60 / 60 / 24;
        long l1 = createdProductTime / 1000 / 60 / 60 / 24;

        return l - l1;
    }

    private static void print(Product product){
        System.out.println("id " + product.getId());
        System.out.println("name " + product.getName());
        System.out.println("name " + product.getId());
    }
}
