package composite;

class HuaweiStore implements Product {
    private String productName;
    private int price;

    public HuaweiStore(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public void showProductDetail() {
        System.out.println(productName+" Rp."+price);
    }
}
