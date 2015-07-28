/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max_value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aarifin
 */
public class Max_value {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        int [] arr = new int [n];
        for(int j=0;j<arr.length;j++)
        {
            arr[j] = Integer.parseInt(read.readLine());
        }
        Max max_value = new Max();
        max_value.maximum(arr, n);
    }
    
}
