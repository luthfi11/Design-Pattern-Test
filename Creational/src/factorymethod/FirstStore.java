package factorymethod;

public class FirstStore implements OnlineShop {

    @Override
    public void orderSomething() {
        System.out.println("Order Adidas Shoes");
    }

    @Override
    public void makePayment() {
        System.out.println("Make Payment to Adidas Store");
    }

    @Override
    public void doShipping() {
        System.out.println("Shipping Adidas Shoes to Buyer");
    }
}
