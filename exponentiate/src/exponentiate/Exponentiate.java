/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentiate;

import java.util.Scanner;

/**
 *
 * @author aarifin
 */
public class Exponentiate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Computation calculate = new Computation();
        long xy = calculate.exponentiate(sc.nextInt(), sc.nextInt());
        System.out.println(xy);
    }
    
}
