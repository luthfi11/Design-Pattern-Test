package builder;

abstract class StoreBuilder {
    Store store;

    Store getStore() {
        return store;
    }

    void registerStore() {
        store = new Store();
    }

    abstract void buildName();
    abstract void buildCity();
    abstract void buildCategory();
    abstract void buildRating();
}
