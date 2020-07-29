package facade;

class GreenLightStore implements OnlineShop, FashionShop {
    private String productName;
    private String size;
    private int price;
    private String paymentMethod;
    private String availableCourier;

    GreenLightStore(String productName, String size, int price, String paymentMethod, String availableCourier) {
        this.productName = productName;
        this.size = size;
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.availableCourier = availableCourier;
    }

    @Override
    public void showSize() {
        System.out.println("Ukuran "+size);
    }

    @Override
    public void showProductName() {
        System.out.println(productName);
    }

    @Override
    public void showPrice() {
        System.out.println("Rp."+price);
    }

    @Override
    public void showPaymentMethod() {
        System.out.println("Metode pembayaran "+paymentMethod);
    }

    @Override
    public void showAvailableCourier() {
        System.out.println("Pengiriman via "+availableCourier);
        System.out.println();
    }
}
