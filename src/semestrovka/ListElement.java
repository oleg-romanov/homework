package semestrovka;

public class ListElement {
    private int value;
    private int index;
    private ListElement next;
    private ListElement prev;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getNext() {
        return next;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }

    public ListElement getPrev() {
        return prev;
    }
}
