package timsortNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static boolean isDebug = false;

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 10000));
        }
        int[] sorted = Arrays.copyOf(arr, arr.length);

        System.out.println("Input Array:");
        printArray(arr);
        System.out.println();

        long startTimeMillis = System.currentTimeMillis();
        timSort(arr);
        long endTimeMillis = System.currentTimeMillis() - startTimeMillis;
        System.out.println("Timsort sorted Array:");
        printArray(arr);
        System.out.println("System sorted Array:");
        Arrays.sort(sorted);
        printArray(sorted);
        if(Arrays.equals(arr, sorted)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("Time for sort: " + endTimeMillis + " milliseconds");
    }

    private static void timSort(int[] arr) {
        int minRun = (arr.length > 64) ? minRun(arr.length) : arr.length;
        int currentIndex = 1;
        ArrayList<Pair> runs = new ArrayList<>();
        int nextRunStartIndex = 0;

        while (currentIndex < arr.length) {
            Pair run = new Pair(nextRunStartIndex, 0);
            while (run.size < minRun || arr[currentIndex] > arr[currentIndex - 1]) {
                if (arr[currentIndex] < arr[currentIndex - 1]) {
                    insertItemIntoRun(arr, run, currentIndex);
                }
                run.size++;
                currentIndex++;
                if (currentIndex == arr.length) {
                    run.size++;
                    currentIndex++;
                    break;
                }
            }
            nextRunStartIndex = run.index + run.size;
            runs.add(run);

            while (runs.size() > 1) {
                mergeAt(arr, runs, 0);
            }
        }
    }

    private static void insertItemIntoRun(int[] arr, Pair run, int currentIndex) {
        while (currentIndex > run.index) {
            if (arr[currentIndex] <= arr[currentIndex - 1]) {
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = temp;
                currentIndex--;
            } else {
                return;
            }
        }
    }

    private static void mergeAt(int[] arr, List<Pair> runs, int index) {
        if (isDebug) {
            System.out.println("Before merge:");
            printAllRuns(arr, runs);
            System.out.println();
        }

        Pair leftRun = runs.get(index);
        Pair rightRun = runs.get(index + 1);

        int leftCursor = leftRun.index;
        int rightCursor = rightRun.index;
        int[] temp = new int[leftRun.size + rightRun.size];
        int i = 0;
        while (i < temp.length) {
            if (leftCursor == leftRun.index + leftRun.size) {
                temp[i] = arr[rightCursor];
                i++;
                rightCursor++;
            } else if (rightCursor == rightRun.index + rightRun.size) {
                temp[i] = arr[leftCursor];
                i++;
                leftCursor++;
            } else if (arr[leftCursor] < arr[rightCursor]) {
                temp[i] = arr[leftCursor];
                i++;
                leftCursor++;
            } else {
                temp[i] = arr[rightCursor];
                i++;
                rightCursor++;
            }
        }
        i = 0;
        for(int j = leftRun.index; j < rightRun.index + rightRun.size; j++, i++) {
            arr[j] = temp[i];
        }
        runs.remove(leftRun);
        runs.remove(rightRun);
        runs.add(new Pair(leftRun.index, leftRun.size + rightRun.size));
        if (isDebug) {
            System.out.println("After merge:");
            printAllRuns(arr, runs);
            System.out.println();
        }
    }

    private static int minRun(int n) {
        int flag = 0;
        while (n >= 64) {
            flag |= n & 1;
            n >>= 1;
        }
        return n + flag;
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void printAllRuns(int[] arr, List<Pair> runs) {
        for (Pair run : runs) {
            System.out.print("[ ");
            for (int j = run.index; j < run.size + run.index; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.print("]\n");
        }
        System.out.println();
    }
}
