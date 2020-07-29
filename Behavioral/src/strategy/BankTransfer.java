package strategy;

public class BankTransfer implements PaymentMethod {
    private String bankName;
    private String accountNumber;
    private String accountOwner;

    BankTransfer(String bankName, String accountNumber, String accountOwner) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
    }

    @Override
    public void makePayment(int amountPaid) {
        System.out.println("Rp." + amountPaid + " dibayar dengan transfer bank "+bankName+" - "+accountNumber+" ("+accountOwner+")");
    }
}
