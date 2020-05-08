package timsortNew;

public class Pair {
    int index;
    int size;

    public Pair() {
        index = 0;
        size = 0;
    }

    public Pair(int index, int size) {
        this.index = index;
        this.size = size;
    }

    public int getNextRunStartIndex() {
        return index + size;
    }

    Pair clonePair() {
        return new Pair(index, size);
    }
}
