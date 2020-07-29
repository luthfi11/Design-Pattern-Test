package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        buildStore(new FirstStore());
        System.out.println();
        buildStore(new SecondStore());
    }

    private static void buildStore(StoreBuilder storeBuilder) {
        OnlineShop onlineShop = new OnlineShop();

        onlineShop.setStoreBuilder(storeBuilder);
        onlineShop.constructStore();

        Store store = onlineShop.getStore();
        System.out.println(store.toString());
    }
}
