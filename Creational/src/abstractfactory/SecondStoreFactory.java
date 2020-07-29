package abstractfactory;

public class SecondStoreFactory implements OnlineShopAbstractFactory {
    private String storeName;
    private String orderedItem;
    private String destinationCity;

    SecondStoreFactory(String storeName, String orderedItem, String destinationCity) {
        this.storeName = storeName;
        this.orderedItem = orderedItem;
        this.destinationCity = destinationCity;
    }

    @Override
    public OnlineShop createOnlineShop() {
        return new SecondStore(storeName, orderedItem, destinationCity);
    }
}
