/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_transpose;

import java.util.Scanner;

/**
 *
 * @author aarifin
 */
public class Matrix_transpose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the matrix size..");
        int n = scan.nextInt();
        int [][] arr = new int [n][n];
        System.out.println("Enter the matrix values ...");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        System.out.println("before transpose the matrix representation is ....");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("after transpose the matrix become ...");
        Transpose trans = new Transpose();
        trans.transpose(arr, n);
            
    }
    
}
