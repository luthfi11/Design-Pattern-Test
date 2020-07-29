package strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product1 = new Product("Jaket Navy", 200000);
        Product product2 = new Product("Celana Jeans", 260000);
        Product product3 = new Product("Tas Laptop", 160000);

        shoppingCart.addItem(product1);
        shoppingCart.pay(new VirtualAccount("BNI", "88870827773848"));

        shoppingCart.addItem(product2);
        shoppingCart.pay(new CreditCard("Ari", "0556473732"));

        shoppingCart.addItem(product3);
        shoppingCart.pay(new BankTransfer("Mandiri", "88745342", "Luthfi"));
    }
}
