package five;

import java.util.*;
public class SortMethod {

    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int binarySearch(int[] array, int x) {
        int right = array.length - 1;
        int left = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < x) {
                left = mid + 1;
            } else if (array[mid] > x) {
                right = mid - 1;
            } else if (array[mid] == x) {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] array, int x, int left, int right) {
        int index = -1;
        if (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < x) {
                index = binarySearchRecursion(array, x, mid + 1, right);
            } else if (array[mid] > x) {
                index = binarySearchRecursion(array, x, left, mid - 1);
            } else if(array[mid] == x){
                return mid;
            }
        }
        return index;
    }

}