/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci_series;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aarifin
 */
public class Fibonacci_series {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Fibonacci fibo = new Fibonacci();
        fibo.fibonacci(Integer.parseInt(read.readLine()));
        
    }
    
}
