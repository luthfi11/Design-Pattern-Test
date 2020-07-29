package strategy;

public class VirtualAccount implements PaymentMethod {
    private String bankName;
    private String billingNumber;

    VirtualAccount(String bankName, String billingNumber) {
        this.bankName = bankName;
        this.billingNumber = billingNumber;
    }

    @Override
    public void makePayment(int amountPaid) {
        System.out.println("Rp." + amountPaid + " dibayar dengan virtual account "+bankName+" ("+billingNumber+")");
    }
}
