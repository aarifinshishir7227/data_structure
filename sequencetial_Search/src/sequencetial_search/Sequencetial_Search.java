/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencetial_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aarifin
 */
public class Sequencetial_Search {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = {2,4,5,7,8,9,12,14,17,19,22,25,27,28,33,37};
        SeqSearch sqs = new SeqSearch();
        
        System.out.println(sqs.seqSearch(arr, 4, arr.length-1));
        
    }
    
}
