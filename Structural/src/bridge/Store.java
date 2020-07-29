package bridge;

abstract class Store {
    protected Courier courier;

    Store(Courier courier) {
        this.courier = courier;
    }

    abstract void setCourier();
}
