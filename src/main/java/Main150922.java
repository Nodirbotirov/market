import uz.nodir.market.model.Product;
import uz.nodir.market.model.ProductState;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main150922 {
    static List<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        int step = 1;
        while (step != 0){
            System.out.println("1. ADD 2. LIST 0. EXIT");
            step = scannerInt.nextInt();

            switch (step){
                case 1:
                    Product newProduct = new Product();
                    newProduct.setId();
                    System.out.println("enter name");
                    newProduct.setName(scannerStr.nextLine());
                    System.out.println("enter count");
                    newProduct.setCount(scannerInt.nextInt());
                    System.out.println("enter price");
                    newProduct.setPrice(scannerInt.nextDouble());
                    newProduct.setCount(105);
                    newProduct.setCreatedDate(new Date());
                    newProduct.setStateId(ProductState.FRESH.getStateId());
                    productList.add(newProduct);
                    break;
                case 2:
                    limitOfProduct();
                    print();

                    break;
            }
        }

    }
    private static long getLimitDay(Date productDate) {
        long currentTimeMillis = System.currentTimeMillis();
        long createdProductTime = productDate.getTime();


        long l = currentTimeMillis / 1000 / 60; //minute
        long l1 = createdProductTime / 1000 / 60;

        return l - l1;
    }

    private static void print(){
        for (Product product: productList) {
            System.out.println("id " + product.getId());
            System.out.println("name " + product.getName());
            System.out.println("price " + product.getPrice());
            System.out.println("count " + product.getCount());
            System.out.println("state " + product.getState());
        }
    }

    private static void limitOfProduct(){
        for (Product product: productList) {
            long differentDay = getLimitDay(product.getCreatedDate());
            if (differentDay >= ProductState.DANGER.getStateId()) {
                product.setStateId(ProductState.DANGER.getStateId());
            } else if (differentDay >= ProductState.WARNING.getStateId()) {
                product.setStateId(ProductState.WARNING.getStateId());
            }
        }
    }
}
