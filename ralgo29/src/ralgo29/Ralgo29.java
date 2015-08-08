/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ralgo29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author disgust
 */
public class Ralgo29 {
    static int [][]arr;
    static int m,n,i,j,sum=0,x=1;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("enter the row size ---> ");
        m = Integer.parseInt(read.readLine());
        System.out.print("enter the column size ---> ");
        n = Integer.parseInt(read.readLine());
        arr = new int [m][n];
        // for input 
        for(i=0;i<m;i++)
        {
            System.out.println(x++ +" NO -> row is ");
            for(j=0;j<n;j++)
            {
                arr[i][j] = Integer.parseInt(read.readLine());
            }
        }
            
        //for showing 
        System.out.println("the matrix representation is given below ---> ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print("\t"+arr[i][j]); 
            }
            System.out.println("");
        } 
        // summation of the boundary elements ;
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
            {
                if(i==j||j+i==n-1)
                {
                    sum = sum + arr[i][j];
                }
            }
        System.out.println("the summation of the matrix is ---> "+ sum);
    }
    
}
