/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_multiplication;

import java.util.Scanner;

/**
 *
 * @author aarifin
 */
public class Matrix_multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the matrix size..");
        int n = scan.nextInt();
        int [][] arr = new int [n][n];
        
        System.out.println("Enter first the matrix values ...");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        System.out.println(" the first matrix representation is ....");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        int [][]b = new int [n][n];
        System.out.println("Enter second the matrix values ...");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                b[i][j] = scan.nextInt();
            }
        System.out.println(" the second matrix representation is ....");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println("");
        }
        int [][] multiply = new int [n][n];
        System.out.println("After multiplication the matrix value become");
        Multiplication multi = new Multiplication();
        multi.multiplication(arr, b,multiply, n);
        
    }
    
}
