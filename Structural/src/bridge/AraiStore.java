package bridge;

public class AraiStore extends Store {

    public AraiStore(Courier courier) {
        super(courier);
    }

    @Override
    void setCourier() {
        System.out.print("Arai Store menggunakan jasa kurir ");
        courier.setCourier();
    }
}
