package singleton;

public class OnlineShopDemo {
    public static void main(String[] args) {
        OnlineShop firstStore = OnlineShop.getOnlineShop();
        OnlineShop secondStore = OnlineShop.getOnlineShop();

        firstStore.showWelcomeMessage("Nike");
        secondStore.showWelcomeMessage("Smith");
    }
}
