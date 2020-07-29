package bridge;

public class ArciloStore extends Store {

    public ArciloStore(Courier courier) {
        super(courier);
    }

    @Override
    void setCourier() {
        System.out.print("Arcilo Store menggunakan jasa kurir ");
        courier.setCourier();
    }
}
