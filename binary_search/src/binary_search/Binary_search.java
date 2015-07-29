/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;

import java.io.*;

/**
 *
 * @author aarifin
 */
public class Binary_search {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int value = Integer.parseInt(read.readLine());
        int [] arr = {2,4,5,7,8,9,12,14,17,19,22,25,27,28,33,37};
        BSearch binarySearch = new BSearch();
        System.out.println(binarySearch.bsearch(arr, 0, arr.length, value));
        
        
    }
    
}
