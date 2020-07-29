package abstractfactory;

public class OnlineShopDemo {
    public static void main(String[] args) {
        FirstStoreFactory firstStoreFactory = new FirstStoreFactory("Levis", "Jeans", "Bandung");
        OnlineShop firstStore = OnlineShopFactory.getOnlineShop(firstStoreFactory);
        System.out.println(firstStore);

        SecondStoreFactory secondStoreFactory = new SecondStoreFactory("Gucci", "Totte Bag", "Jakarta");
        OnlineShop secondStore = OnlineShopFactory.getOnlineShop(secondStoreFactory);
        System.out.println(secondStore);
    }
}
