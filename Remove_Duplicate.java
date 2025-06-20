package Array;

import java.util.Arrays;
import java.util.HashSet;

import java.util.Arrays;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int nums[] = {34, 454, 221, 5463, 4323, 876, 70, 34, 876};

        Arrays.sort(nums); // Sort the array first

        System.out.println("Duplicate elements are:");

        // Using Normal for loop
        /*
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println(nums[i]);
                
                // Skip all further duplicates of the same value
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        */
        
        // Using HashSet
        HashSet<Integer> hs = new HashSet<Integer>();
        for(Integer i : nums) {
        	if(!hs.add(i))
        	System.out.println("Duplicates are : "+i);
        }
    }
}

