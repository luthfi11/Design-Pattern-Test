package adapter;

public class ElectronicAdapter implements AudioStore {
    private ElectronicStore electronicStore;

    ElectronicAdapter(ElectronicStore electronicStore) {
        this.electronicStore = electronicStore;
    }

    @Override
    public void showAudioProduct() {
        electronicStore.showPhoneProduct();
    }
}
