package twosum;
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:

import java.util.Arrays;
import java.util.HashMap;

// Given nums = [2, 7, 11, 15], target = 9,
// Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
public class TwoSum {

    public static void main(String[] args) {

        int[] array = {2, 7, 10, 15, 19, 30, 45};
        int[] array1 = {5, 2, 88, 5, 9, 11, 20};

        int[] answer = twoSum3(array, 45);
        System.out.println(Arrays.toString(answer));


    };

    //
    static int[] twoSum(int arr[], int target) {

        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }

            }

        }
        return result;
    }


    static int[] twoSum1(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int[] result = new int[2];

        while (arr[low] < arr[high]) {
            System.out.println(arr[low] + " , " + arr[high]);

            if (arr[low] + arr[high] == target) {

                result[0] = low;
                result[1] = high;
                return result;
            }

            if (arr[low] + arr[high] < target) {

                low++;
            } else {
                high--;
            }


        }

        return result;

    }



    static int[] twoSum2(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int[] result = new int[2];

        while (arr[low] < arr[high]) {
            System.out.println(arr[low] + " , " + arr[high]);

            if (arr[low] + arr[high] == target) {

                result[0] = low;
                result[1] = high;
                return result;
            }

            if (arr[low] + arr[high] < target) {

                low++;
            } else {
                high--;
            }


        }

        return result;

    }

    static int[] twoSum3(int arr[], int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];


        for (int i = 0; i < arr.length ; i++) {
            int complement = target - arr[i];
            if(hashMap.containsKey(complement)){

                result[0] = hashMap.get(complement);
                result[1]= i;

                return result;
            }
            hashMap.put(arr[i], i);

        }
        return result;

    }
}

