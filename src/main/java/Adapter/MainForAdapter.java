package Adapter;

public class MainForAdapter {
    public static void main(String[] args) {
        CardReader cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUSBCable();
    }
}
