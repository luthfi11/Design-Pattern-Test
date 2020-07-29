package strategy;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    void addItem(Product product){
        this.products.add(product);
    }

    private int calculateTotal(){
        int total = 0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

    void pay(PaymentMethod paymentMethod){
        int amount = calculateTotal();
        paymentMethod.makePayment(amount);
    }
}
