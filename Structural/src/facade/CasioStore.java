package facade;

class CasioStore implements OnlineShop {
    private String productName;
    private int price;
    private String paymentMethod;
    private String availableCourier;

    CasioStore(String productName, int price, String paymentMethod, String availableCourier) {
        this.productName = productName;
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.availableCourier = availableCourier;
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
