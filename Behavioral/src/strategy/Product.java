package strategy;

class Product {
    private String productName;
    private int price;

    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}
