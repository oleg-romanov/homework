package HomeWork_26_02_20;

public class StudentList <T extends Student> {
    private StudentListElement<T> head;
    private StudentListElement<T> tale;

    public void setHead(StudentListElement object) {
        this.head = object;
    }

    public void add(StudentListElement<T> ListElement) {
        if (head == null) {
            head = ListElement;
            tale = ListElement;

        }
        tale.setNext(ListElement);
        tale = tale.getNext();
    }
}
