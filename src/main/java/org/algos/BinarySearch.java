package org.algos;

public class BinarySearch {

    /**
     * Given an array of integers nums which is sorted in ascending order,
     * and an integer target, write a function to search target in nums.
     * If target exists, then return its index. Otherwise, return -1.
     * @param nums array of integers
     * @param target type integer
     * @return Integer
     */
    public int search(int[] nums, int target) {
        int low = 0; int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    /**
     * Given a sorted array of distinct integers and a target value,
     * return the index if the target is found. If not, return the index where
     * it would be if it were inserted in order.
     */
    public int searchInsert(int[] nums, int target) {
        int low = 0; int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                low = mid + 1;
            else high = mid - 1;
        }
        return high + 1;
    }

    /**
     * You are given an array of characters letters that is sorted in non-decreasing order,
     * and a character target. There are at least two different characters in letters.
     *
     * Return the smallest character in letters that is lexicographically greater than target.
     * If such a character does not exist, return the first character in letters.
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;
        if(target >= letters[high]){
            return letters[0];
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letters[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return letters[low];
    }

}
