package builder;

public class SecondStore extends StoreBuilder {

    @Override
    void buildName() {
        store.setName("Nick Store");
    }

    @Override
    void buildCity() {
        store.setCity("Bandung");
    }

    @Override
    void buildCategory() {
        store.setCategory("Electronic");
    }

    @Override
    void buildRating() {
        store.setRating(4.9);
    }
}
