package builder;

public class FirstStore extends StoreBuilder {

    @Override
    void buildName() {
        store.setName("Made Store");
    }

    @Override
    void buildCity() {
        store.setCity("Bali");
    }

    @Override
    void buildCategory() {
        store.setCategory("Fashion");
    }

    @Override
    void buildRating() {
        store.setRating(4.8);
    }
}
