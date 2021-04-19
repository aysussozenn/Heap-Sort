
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AYSU
 */
public class HeapSort {
        public static void swap(int[] arr, int maximum, int i) {
        int temp = arr[i];
        arr[i] = arr[maximum];
        arr[maximum] = temp;

    }

    public static void max_heap(int[] arr, int size, int temp) {
        int maximum = temp;
        int left = 2 * temp;
        int right = (2 * temp) + 1;
        if (left <= size && arr[left] > arr[maximum]) {
            maximum = left;
        }
        else
            maximum=temp;
        if (right <= size && arr[right] > arr[maximum]) {
            maximum = right;
        }
        if (maximum != temp) {
            swap(arr, maximum, temp);
            max_heap(arr, size, maximum);
        }

    }

    public static void build_maxheap(int[] arr, int size) {
        for (int i = (size / 2); i >= 0; i--) {
            max_heap(arr, size - 1, i);
        }

    }

    public static int[] heap_sort(int[] arr, int size) {
        size = arr.length - 1;
        build_maxheap(arr, size);
        for (int i = size; i > 1; i--) {
            swap(arr, 0, i);
            size--;
            max_heap(arr, size, 0);
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {97,45, 79, 12, 63, 47, 16, 87, 23, 1, 6,100, 8, 78, 0,0, 4, 69, 7, 7,9,78,55,3};
        int size = arr.length;
        System.out.println("Before\n" + Arrays.toString(arr));
        arr = heap_sort(arr, size);
        System.out.println("After\n" + Arrays.toString(arr));

    }
    
}
