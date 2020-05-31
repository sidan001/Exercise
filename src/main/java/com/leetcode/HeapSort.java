package com.leetcode;

public class HeapSort {


    public static void main(String[] args) {
        int nums[] = {4, 10, 3, 5, 1, 2, 7, 9, 6, 8};

        buildMaxHeap(nums);
//        heapSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }




    static void heapSort(int arr[]) {
        buildMaxHeap(arr);
        int n = arr.length;

        for (int i = n -1; i >=0; i--) {
            //最后一个和第一个交换
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }

    }

    static void buildMaxHeap(int arr[]) {

        int lastNode = arr.length -1;
        int parent = (lastNode - 1) / 2;

        for (int i = parent; i >= 0 ; i--) {
            heapify(arr, i, arr.length);
        }
    }

    static void heapify(int arr[], int i, int len) {

        if (i >= len) {
            return;
        }

        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;

        int max = i;

        if (c1 < len && arr[c1] > arr[max]) {
            max = c1;
        }
        if (c2 < len && arr[c2] > arr[max]) {
            max = c2;
        }

        if (max != i) {
            swap(arr, max, i);
            heapify(arr, max, len);
        }

    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
