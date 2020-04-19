package semestrovka;

public class MyLinkedList2 {
    private ListElement head;
    private int length;

    public MyLinkedList2(int[] arr) {
        sortArray(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    public int[] sortArray(int[] arr, int low, int high) {
        if (arr.length == 0) {
            return arr;
        }
        if (low >= high) {
            return arr;
        }
        int middle = low + (high - low) / 2;
        int opora = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }
            while (arr[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            sortArray(arr, low, j);
        }
        if (high > i) {
            sortArray(arr, i, high);
        }
        return arr;
    }

    public MyLinkedList2() {
    }

    public void setHead(ListElement head) {
        head.setIndex(0);
        this.head = head;
    }

    public ListElement getHead() {
        return head;
    }

    public void add(int value) {
        ListElement element = new ListElement();
        if (head != null) {
            ListElement elem = head;
            while (elem.getNext() != null) {
                elem = elem.getNext();
            }
            element.setValue(value);
            element.setIndex(elem.getIndex() + 1);
            elem.setNext(element);
            element.setPrev(elem);
            length++;
        } else {
            element.setValue(value);
            setHead(element);
            length++;
        }
    }

    public void insert(int k) {
        ListElement element = new ListElement();
        element.setValue(k);
        if (head == null) {
            setHead(element);
            length++;
            return;
        }
        ListElement elem = head;
        if (elem.getValue() >= k) {
            setHead(element);
            element.setNext(elem);
            elem.setPrev(element);
        } else {
            while (elem.getValue() < k && elem.getNext() != null) {
                elem = elem.getNext();
            }
            if (elem.getValue() < element.getValue()) {
                element.setNext(elem.getNext());
                element.setPrev(elem);
                elem.setNext(element);
            } else {
                elem.getPrev().setNext(element);
                element.setPrev(elem.getPrev());
                element.setNext(elem);
                elem.setPrev(element);
            }
        }
        length++;
    }

    public int maxNum() {
        int max = Integer.MIN_VALUE;
        int k = 1;
        ListElement elem = head;
        while (elem != null) {
            if (elem.getNext() != null) {
                if (elem.getValue() == elem.getNext().getValue()) {
                    k++;
                    if (k > max) {
                        max = k;
                    }
                } else {
                    k = 1;
                }
            }
            elem = elem.getNext();
        }
        if (max == Integer.MIN_VALUE) {
            max = 0;
        }
        return max;
    }

    public void delete(int k) {
        ListElement elem = head;
        ListElement element;
        int c = 0;
        while (elem != null) {
            if (elem.getValue() == k && elem == head) {
                setHead(elem.getNext());
                c++;
                length--;
            } else if (elem.getValue() == k && elem.getNext() == null) {
                elem.getPrev().setNext(null);
                elem.setPrev(null);
                c++;
                length--;
            } else if (elem.getValue() == k && elem.getNext() != null) {
                element = elem.getPrev();
                element.setNext(elem.getNext());
                elem.getNext().setPrev(element);
                c++;
                length--;
            } else if(c != 0) {
               return;
            }
            elem = elem.getNext();
        }
    }

    public MyLinkedList2 merge(MyLinkedList2 ll2) {
        MyLinkedList2 list = new MyLinkedList2();
        ListElement ll2element = ll2.getHead();
        ListElement element = head;
        while (element != null && ll2element != null) {
            if (element.getValue() < ll2element.getValue()) {
                list.add(element.getValue());
                element = element.getNext();
            } else {
                list.add(ll2element.getValue());
                ll2element = ll2element.getNext();
            }
        }

        while (element != null) {
            list.add(element.getValue());
            element = element.getNext();
        }
        while (ll2element != null) {
            list.add(ll2element.getValue());
            ll2element = ll2element.getNext();
        }
        return list;
    }

    public int[] toArray() {
        int[] arr = new int[length];
        int i = 0;
        ListElement elem = head;
        while (elem != null) {
            arr[i] = elem.getValue();
            elem = elem.getNext();
            i++;
        }
        return arr;
    }

    public MyLinkedList2[] divide() {
        MyLinkedList2[] arr = new MyLinkedList2[2];
        ListElement elem = head;
        MyLinkedList2 list1 = new MyLinkedList2();
        MyLinkedList2 list2 = new MyLinkedList2();
        arr[0] = list1;
        arr[1] = list2;
        while (elem != null) {
            if (elem.getValue() % 3 == 0) {
                list1.add(elem.getValue());
            } else {
                list2.add(elem.getValue());
            }
            elem = elem.getNext();
        }
        return arr;
    }

    public void writeMyLinkedList2() {
        //System.out.println("MyLinkedList2 :");
        ListElement element = head;
        while (element != null) {
            System.out.print(element.getValue());
            System.out.print(' ');
            element = element.getNext();
        }
        System.out.println();
    }

    public MyLinkedList2 newList() {
        ListElement elem = head;
        int size = length - 1;
        MyLinkedList2 newList = new MyLinkedList2();
        while (elem != null) {
            newList.insert(elem.getValue() * elementByIndex(size - elem.getIndex()).getValue());
            elem = elem.getNext();
        }
        return newList;
    }

    public ListElement elementByIndex(int index) {
        ListElement elem = head;
        while (elem != null) {
            if (elem.getIndex() == index) {
                return elem;
            }
            elem = elem.getNext();
        }
        return null;
    }
}
