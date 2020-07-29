package composite;

public class OnlineShop {
    public static void main(String[] args) {
        XiaomiStore xiaomi1 = new XiaomiStore("Redmi Note 9", 3799000);
        XiaomiStore xiaomi2 = new XiaomiStore("Mi 10", 9000000);

        Cart xiaomiCart = new Cart();
        xiaomiCart.addToCart(xiaomi1);
        xiaomiCart.addToCart(xiaomi2);

        HuaweiStore huawei1 = new HuaweiStore("P40 Pro", 9800000);
        HuaweiStore huawei2 = new HuaweiStore("Nova 7", 6800000);

        Cart huaweiCart = new Cart();
        huaweiCart.addToCart(huawei1);
        huaweiCart.addToCart(huawei2);

        Cart shopCart = new Cart();
        shopCart.addToCart(xiaomiCart);
        shopCart.addToCart(huaweiCart);
        shopCart.showProductDetail();
    }
}
