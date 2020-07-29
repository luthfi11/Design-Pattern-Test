package abstractfactory;

public class FirstStoreFactory implements OnlineShopAbstractFactory {
    private String storeName;
    private String orderedItem;
    private String destinationCity;

    FirstStoreFactory(String storeName, String orderedItem, String destinationCity) {
        this.storeName = storeName;
        this.orderedItem = orderedItem;
        this.destinationCity = destinationCity;
    }

    @Override
    public OnlineShop createOnlineShop() {
        return new FirstStore(storeName, orderedItem, destinationCity);
    }
}
