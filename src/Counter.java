public class Counter {
    private int count;
    Counter() {
        count = 0;
    }
    Counter(int initialValue) {
        count = initialValue;
    }

    public void increaseCount() {
        count++;
    }

    public void increaseCount(int by) {
        count = count + by;
    }

    public void decreaseCount() {
        count--;
    }

    public void decreaseCount(int by) {
        count = count - by;
    }

    public int getCount() {
        return count;
    }
}
