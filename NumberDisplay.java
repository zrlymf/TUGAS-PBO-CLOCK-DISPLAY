public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int max) {
        limit = max;
        value = 0;
    }

    public void increment() {
        value = (value + 1) % limit;
    }

    public int getValue() {
        return value;
    }

    public String getDisplayValue() {
        return String.format("%02d", value); // Format dengan dua digit
    }

    // Tambahkan metode ini
    public void setValue(int newValue) {
        if (newValue >= 0 && newValue < limit) {
            value = newValue;
        }
    }
}
