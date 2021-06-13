package Adapter;

public class CardReader implements USB{
    MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUSBCable() {
        this.memoryCard.insert();
        this.memoryCard.transferData();
    }
}
