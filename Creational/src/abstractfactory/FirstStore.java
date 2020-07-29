package abstractfactory;

public class FirstStore extends OnlineShop {
    private String storeName;
    private String orderedItem;
    private String destinationCity;

    FirstStore(String storeName, String orderedItem, String destinationCity) {
        this.storeName = storeName;
        this.orderedItem = orderedItem;
        this.destinationCity = destinationCity;
    }

    @Override
    String getOrderedItem() {
        return this.orderedItem;
    }

    @Override
    String getStoreName() {
        return this.storeName;
    }

    @Override
    String getDestinationCity() {
        return this.destinationCity;
    }
}
