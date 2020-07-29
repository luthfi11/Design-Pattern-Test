package factorymethod;

class OnlineShopFactory {
    OnlineShop getOnlineShop(String storeName) {
        if (storeName.equalsIgnoreCase("Adidas")) {
            return new FirstStore();
        } else if (storeName.equalsIgnoreCase("Nike")) {
            return new SecondStore();
        } else {
            return null;
        }
    }
}
