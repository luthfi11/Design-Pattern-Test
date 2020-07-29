package observer;

abstract class Observer {
    OrderedProduct orderedProduct;

    Observer(OrderedProduct orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    abstract void update();
}
