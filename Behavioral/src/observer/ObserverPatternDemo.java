package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        OrderedProduct orderedProduct = new OrderedProduct();

        new Tracker(orderedProduct);

        orderedProduct.setCheckPoint("Jakarta");
        orderedProduct.setCheckPoint("Bekasi");
        orderedProduct.setCheckPoint("Bandung");
    }
}
