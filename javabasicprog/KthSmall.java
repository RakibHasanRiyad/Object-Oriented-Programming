/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasicprog;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class KthSmall {

    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(k + " smallest elements of the said array are:");
        ////Sorting
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
