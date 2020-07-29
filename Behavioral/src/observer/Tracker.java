package observer;

class Tracker extends Observer {

    Tracker(OrderedProduct orderedProduct) {
        super(orderedProduct);
        this.orderedProduct.attach(this);
    }

    @Override
    void update() {
        System.out.println("Paket dalam perjalanan dari "+orderedProduct.getCheckPoint());
    }
}
