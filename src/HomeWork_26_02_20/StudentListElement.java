package HomeWork_26_02_20;

public class StudentListElement<T extends Student> {
    private StudentListElement next;
    public StudentListElement<T> getNext() {
        return next;
    }

    public void setNext(StudentListElement listElement) {
        next = listElement;
    }
}
