/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Arrays;

/**
 *
 * @author aarifin
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr = {17,12,6,19,23,8,5,10};
        Sorting sorting = new Sorting();
        sorting.quicksort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
