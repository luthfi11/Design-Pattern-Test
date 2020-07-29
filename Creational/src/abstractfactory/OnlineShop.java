package abstractfactory;

public abstract class OnlineShop {
    abstract String getOrderedItem();
    abstract String getStoreName();
    abstract String getDestinationCity();

    @Override
    public String toString() {
        return "Pesanan "+this.getOrderedItem()+" dari toko "+this.getStoreName()+" akan dikirimkan ke "+this.getDestinationCity();
    }
}
