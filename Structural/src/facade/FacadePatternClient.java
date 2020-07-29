package facade;

public class FacadePatternClient {
    public static void main(String[] args) {
        OnlineShopKeeper onlineShopKeeper = new OnlineShopKeeper();

        onlineShopKeeper.casioShop();
        onlineShopKeeper.greenLightShop();
        onlineShopKeeper.threeSecondShop();
    }
}
