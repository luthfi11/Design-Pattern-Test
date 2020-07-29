package factorymethod;

public class SecondStore implements OnlineShop {

    @Override
    public void orderSomething() {
        System.out.println("Order Nike Shirt");
    }

    @Override
    public void makePayment() {
        System.out.println("Make Payment to Nike Store");
    }

    @Override
    public void doShipping() {
        System.out.println("Shipping Nike Shirt to Buyer");
    }
}
