package facade;

class OnlineShopKeeper {
    private CasioStore casioStore;
    private GreenLightStore greenLightStore;
    private ThreeSecondStore threeSecondStore;

    OnlineShopKeeper() {
        casioStore = new CasioStore("Casio G-Stock Digital", 1400000, "BNI/BCA/BRI", "JNE/JNT/SiCepat");
        greenLightStore = new GreenLightStore("GreenLight Shirt", "M", 120000, "BCA/BNI/Mandiri", "SiCepat/JNT/Ninja Express");
        threeSecondStore = new ThreeSecondStore("3Second Sweater", "L", 210000, "BRI/BCA/BNI/Mandiri", "SiCepat/JNT/JNE/Ninja Express");
    }

    void casioShop() {
        casioStore.showProductName();
        casioStore.showPrice();
        casioStore.showPaymentMethod();
        casioStore.showAvailableCourier();
    }

    void greenLightShop() {
        greenLightStore.showProductName();
        greenLightStore.showSize();
        greenLightStore.showPrice();
        greenLightStore.showPaymentMethod();
        greenLightStore.showAvailableCourier();
    }

    void threeSecondShop() {
        threeSecondStore.showProductName();
        threeSecondStore.showSize();
        threeSecondStore.showPrice();
        threeSecondStore.showPaymentMethod();
        threeSecondStore.showAvailableCourier();
    }
}
