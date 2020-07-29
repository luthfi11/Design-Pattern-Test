package adapter;

public class Samsung implements ElectronicStore {

    @Override
    public void showPhoneProduct() {
        System.out.println("Samsung S20 Ultra");
    }

    @Override
    public void showVideoProduct() {
        System.out.println("Samsung Crystal UHD");
    }
}
