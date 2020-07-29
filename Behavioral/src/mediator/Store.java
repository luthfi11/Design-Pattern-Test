package mediator;

class Store {
    private String storeName;

    Store(String storeName) {
        this.storeName = storeName;
    }

    void sendMessage(String message) {
        Chat.showMessage(storeName, message);
    }
}
