package strategy;

class CreditCard implements PaymentMethod {
    private String name;
    private String cardNumber;

    CreditCard(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment(int amountPaid) {
        System.out.println("Rp." + amountPaid + " dibayar dengan kartu kredit "+cardNumber+" ("+name+")");
    }
}
