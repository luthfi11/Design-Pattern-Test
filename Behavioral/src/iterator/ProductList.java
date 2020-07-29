package iterator;

import java.util.Iterator;

public class ProductList implements Iterable<String> {
    private static final int MAX_SIZE = 3;
    private int length = 0;
    private String[] list;

    ProductList() {
        list = new String[MAX_SIZE];
    }

    public void addProduct(String productName){
        if(length >= MAX_SIZE){
            System.out.println("Slot produk sudah penuh.");
        }else{
            list[length++] = productName;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new ListIterator(list, length);
    }
}
