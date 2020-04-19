package semestrovka;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        testMaxNum();
        testDelete();
        testInsert();
        testMerge();
        testNewList();
        testDivide();
    }

    public static void testMaxNum() {
        testMaxNum1();
        testMaxNum2();
    }

    public static void testDelete() {
        testDelete1();
        testDelete2();
        testDelete3();
        testDelete4();
        testDelete5();
    }

    public static void testInsert() {
        testInsert1();
        testInsert2();
        testInsert3();

    }

    public static void testDivide() {
        testDivide1();
        testDivide2();
        testDivide3();
        testDivide4();
    }

    public static void testNewList() {
        testNewList1();
        testNewList2();
    }

    public static void testMerge() {
        testMerge1();
        testMerge2();
        testMerge3();
        testMerge4();
    }

    public static void testMaxNum1() {
        int [] arr = new int[] {1,4,8,1,4,1,7,1,4};
        MyLinkedList2 list = new MyLinkedList2(arr);
        System.out.println(list.maxNum());
        if (list.maxNum() == 4) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testMaxNum2() {
        int [] arr = new int[] {1,4,8,7};
        MyLinkedList2 list = new MyLinkedList2(arr);
        System.out.println(list.maxNum());
        if (list.maxNum() == 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDelete2() {
        int [] arr = new int[] {1, 2, 5, 10, 15};
        int [] arrExpected = new int[] {1, 2, 5, 10};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.delete(15);
        list.writeMyLinkedList2();
        if (Arrays.equals(list.toArray(), arrExpected)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDelete1() {
        int [] arr = new int[] {1, 2, 5, 10, 15};
        int [] arrExpected = new int[] {2, 5, 10, 15};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.delete(1);
        list.writeMyLinkedList2();
        if (Arrays.equals(list.toArray(), arrExpected)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDelete3() {
        int [] arr = new int[] {1, 2, 5, 10, 15};
        int [] arrExpected = new int[] {1, 2, 10, 15};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.delete(5);
        list.writeMyLinkedList2();
        if (Arrays.equals(list.toArray(), arrExpected)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDelete4() {
        int [] arr = new int[] {1, 1, 2, 5, 10, 15};
        int [] arrExpected = new int[] {2, 5, 10, 15};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.delete(1);
        list.writeMyLinkedList2();
        if (Arrays.equals(list.toArray(), arrExpected)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDelete5() {
        int [] arr = new int[] {1, 1, 2, 5, 10, 15, 15, 15};
        int [] arrExpected = new int[] {1, 1, 2, 5, 10};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.delete(15);
        list.writeMyLinkedList2();
        if (Arrays.equals(list.toArray(), arrExpected)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testInsert1() {
        int [] arr = new int[] {1, 2, 3, 4, 5};
        int [] arrExpected = new int[] {1, 2, 3, 4, 5, 5};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.insert(5);
        list.writeMyLinkedList2();
        if (Arrays.equals(list.toArray(), arrExpected)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testInsert2() {
        int [] arr = new int[] {2, 3, 4, 7, 9};
        int [] arrExpected = new int[] {2, 3, 4, 5, 7, 9};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.insert(5);
        list.writeMyLinkedList2();
        if (Arrays.equals(list.toArray(), arrExpected)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testInsert3() {
        int [] arr = new int[] {8, 10, 33, 446, 76};
        int [] arrExpected = new int[] {0, 8, 10, 33, 76, 446};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.insert(0);
        list.writeMyLinkedList2();
        if (Arrays.equals(list.toArray(), arrExpected)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDivide1() {
        int [] arr = new int[] {0, 1, 2, 3, 6, 8, 9, 10};
        int [] arr1 = new int[] {0, 3, 6, 9};
        int [] arr2 = new int[] {1, 2, 8, 10};
        MyLinkedList2 list = new MyLinkedList2(arr);
        MyLinkedList2[] array = list.divide();
        MyLinkedList2 newList1 = array[0];
        MyLinkedList2 newList2 = array[1];
        newList1.writeMyLinkedList2();
        newList2.writeMyLinkedList2();
        if (Arrays.equals(newList1.toArray(), arr1) && Arrays.equals(newList2.toArray(), arr2)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDivide2() {
        int [] arr = new int[] {9, 1, 3, 30, 2, 10, 8};
        int [] arr1 = new int[] {3, 9, 30};
        int [] arr2 = new int[] {1, 2, 8, 10};
        MyLinkedList2 list = new MyLinkedList2(arr);
        MyLinkedList2[] array = list.divide();
        MyLinkedList2 newList1 = array[0];
        MyLinkedList2 newList2 = array[1];
        newList1.writeMyLinkedList2();
        newList2.writeMyLinkedList2();
        if (Arrays.equals(newList1.toArray(), arr1) && Arrays.equals(newList2.toArray(), arr2)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDivide3() {
        int [] arr = new int[] {8, 2, 5, 14, 19, 7, 22};
        int [] arr1 = new int[] {};
        int [] arr2 = new int[] {2, 5, 7, 8, 14, 19, 22};
        MyLinkedList2 list = new MyLinkedList2(arr);
        MyLinkedList2[] array = list.divide();
        MyLinkedList2 newList1 = array[0];
        MyLinkedList2 newList2 = array[1];
        newList1.writeMyLinkedList2();
        newList2.writeMyLinkedList2();
        if (Arrays.equals(newList1.toArray(), arr1) && Arrays.equals(newList2.toArray(), arr2)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testDivide4() {
        int [] arr = new int[] {3, 6, 33, 15, 12, 9, 21, 21};
        int [] arr1 = new int[] {3, 6, 9, 12, 15, 21, 21, 33};
        int [] arr2 = new int[] {};
        MyLinkedList2 list = new MyLinkedList2(arr);
        MyLinkedList2[] array = list.divide();
        MyLinkedList2 newList1 = array[0];
        MyLinkedList2 newList2 = array[1];
        newList1.writeMyLinkedList2();
        newList2.writeMyLinkedList2();
        if (Arrays.equals(newList1.toArray(), arr1) && Arrays.equals(newList2.toArray(), arr2)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testNewList1() {
        int [] arr = new int[] {2, 3, 5, 7 , 9};
        int [] result = new int[] {18, 18, 21, 21, 25};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.writeMyLinkedList2();
        MyLinkedList2 list1 = list.newList();
        list1.writeMyLinkedList2();
        if (Arrays.equals(list1.toArray(), result)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testNewList2() {
        int [] arr = new int[] {9, 7, 0, 3, 2};
        int [] result = new int[] {0, 0, 9, 14, 14};
        MyLinkedList2 list = new MyLinkedList2(arr);
        list.writeMyLinkedList2();
        MyLinkedList2 list1 = list.newList();
        list1.writeMyLinkedList2();
        if (Arrays.equals(list1.toArray(), result)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testMerge1() {
        int arrFirst[] = new int[] {0, 3, 6, 9, 12};
        int arrSecond[] = new int[] {0, 1, 2, 5, 7, 10, 15};
        int arrFinal[] = new int[] {0, 0, 1, 2, 3, 5, 6, 7, 9, 10, 12, 15};
        MyLinkedList2 list1 = new MyLinkedList2(arrFirst);
        MyLinkedList2 list2 = new MyLinkedList2(arrSecond);
        MyLinkedList2 listFinished = list1.merge(list2);
        listFinished.writeMyLinkedList2();
        if (Arrays.equals(listFinished.toArray(), arrFinal)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testMerge2() {
        int arrFirst[] = new int[] {1, 1, 1, 1, 1};
        int arrSecond[] = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int arrFinal[] = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        MyLinkedList2 list1 = new MyLinkedList2(arrFirst);
        MyLinkedList2 list2 = new MyLinkedList2(arrSecond);
        MyLinkedList2 listFinished = list1.merge(list2);
        listFinished.writeMyLinkedList2();
        if (Arrays.equals(listFinished.toArray(), arrFinal)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testMerge3() {
        int arrFirst[] = new int[] {1, 2, 3, 4, 5};
        int arrSecond[] = new int[] {6, 7, 8, 9, 10, 11, 12};
        int arrFinal[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        MyLinkedList2 list1 = new MyLinkedList2(arrFirst);
        MyLinkedList2 list2 = new MyLinkedList2(arrSecond);
        MyLinkedList2 listFinished = list1.merge(list2);
        listFinished.writeMyLinkedList2();
        if (Arrays.equals(listFinished.toArray(), arrFinal)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    public static void testMerge4() {
        int arrFirst[] = new int[] {6, 7, 8, 9, 10, 11, 12};
        int arrSecond[] = new int[] {0, 2, 3, 4, 5};
        int arrFinal[] = new int[] {0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        MyLinkedList2 list1 = new MyLinkedList2(arrFirst);
        MyLinkedList2 list2 = new MyLinkedList2(arrSecond);
        MyLinkedList2 listFinished = list1.merge(list2);
        listFinished.writeMyLinkedList2();
        if (Arrays.equals(listFinished.toArray(), arrFinal)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }


}
