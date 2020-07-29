package mediator;

class Customer {
    private String userName;

    Customer(String userName) {
        this.userName = userName;
    }

    void sendMessage(String message) {
        Chat.showMessage(userName, message);
    }
}
