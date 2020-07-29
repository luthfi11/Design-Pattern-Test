package bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Store arcilo = new ArciloStore(new JNE());
        arcilo.setCourier();

        Store arai = new AraiStore(new JNT());
        arai.setCourier();
    }
}
