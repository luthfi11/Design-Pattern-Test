package abstractfactory;

public class OnlineShopFactory {
    static OnlineShop getOnlineShop(OnlineShopAbstractFactory factory) {
        return factory.createOnlineShop();
    }
}
