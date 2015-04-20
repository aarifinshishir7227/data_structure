/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic_sqare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aarifin
 */
public class Magic_sqare {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter odd value for magic Square ... otherwise program would be terminated ....");
        Magic modhu = new Magic();
        modhu.square(Integer.parseInt(read.readLine()), 0, 0);
        
    }
    
}
