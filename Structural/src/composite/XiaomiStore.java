package composite;

class XiaomiStore implements Product {
    private String productName;
    private int price;

    public XiaomiStore(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public void showProductDetail() {
        System.out.println(productName+" Rp."+price);
    }
}
