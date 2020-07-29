package iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

        productList.addProduct("Sepatu Nike");
        productList.addProduct("Jaket Adidas");
        productList.addProduct("Polo Shirt Puma");

        Iterator<String> iterator = productList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
