package builder;

public class OnlineShop {
    private StoreBuilder storeBuilder;

    public void setStoreBuilder(StoreBuilder storeBuilder) {
        this.storeBuilder = storeBuilder;
    }

    Store getStore() {
        return storeBuilder.getStore();
    }

    void constructStore() {
        storeBuilder.registerStore();
        storeBuilder.buildName();
        storeBuilder.buildCity();
        storeBuilder.buildCategory();
        storeBuilder.buildRating();
    }
}
