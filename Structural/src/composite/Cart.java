package composite;

import java.util.ArrayList;
import java.util.List;

class Cart implements Product {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void showProductDetail() {
        for (Product product : productList) {
            product.showProductDetail();
        }
    }

    void addToCart(Product product) {
        productList.add(product);
    }

    void removeFromCart(Product product) {
        productList.remove(product);
    }
}
