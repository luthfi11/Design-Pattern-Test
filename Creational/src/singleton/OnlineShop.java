package singleton;

class OnlineShop {
    private static OnlineShop onlineShop;

    private OnlineShop() {

    }

    static synchronized OnlineShop getOnlineShop() {
        if (onlineShop == null) {
            onlineShop = new OnlineShop();
        }

        return onlineShop;
    }

    void showWelcomeMessage(String storeName) {
        System.out.println("Hallo, Selamat Datang di Toko "+storeName);
    }
}