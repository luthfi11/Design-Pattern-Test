package factorymethod;

public class OnlineShopDemo {
    public static void main(String[] args) {
        OnlineShopFactory onlineShopFactory = new OnlineShopFactory();
        OnlineShop adidas = onlineShopFactory.getOnlineShop("nike");

        adidas.orderSomething();
        adidas.makePayment();
        adidas.doShipping();
    }
}
