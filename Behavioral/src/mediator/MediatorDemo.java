package mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Store store = new Store("Visval");
        Customer customer = new Customer("Luthfi");

        store.sendMessage("Hallo, selamat datang di toko kami!");
        customer.sendMessage("Hallo, tas laptop ada?");
        store.sendMessage("Tas laptop sedang kosong kak. Mungkin bisa lihat katalog kami yang lain.");
        customer.sendMessage("Oke terima kasih, saya cari yang lain dulu");
    }
}
