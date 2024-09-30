package Models;

/**
 * Модель перевозчика
 */
public class Carrier {
    private final int id;
    private final int[] zones;
    private final long cardNumber;

    public Carrier(int id, long cardNumber, int[] zones) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.zones = zones;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getId() {
        return id;
    }

    public int[] getZones() {
        return zones;
    }
}
