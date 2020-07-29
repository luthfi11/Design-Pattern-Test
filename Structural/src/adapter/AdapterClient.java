package adapter;

public class AdapterClient {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        Vyatta vyatta = new Vyatta();

        AudioStore electronicAdapter = new ElectronicAdapter(samsung);

        System.out.println("Samsung...");
        samsung.showVideoProduct();
        samsung.showPhoneProduct();

        System.out.println("Vyatta...");
        vyatta.showAudioProduct();

        System.out.println("Adapter...");
        electronicAdapter.showAudioProduct();
    }
}
