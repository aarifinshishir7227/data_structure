/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aarifin
 */
public class Sorting {

    /**
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int [] arr, int i,int j)
    {
     int temp;
     temp = arr[i]; 
     arr[i] = arr[j];
     arr[j] = temp;
    }
    public static void take(int [] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i-1;j<arr.length-1;j++)
            {
                if(arr[i]<arr[j])
                {
                    swap(arr,i,j);
                }
            }
        }
        
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the array size --> ");
        int n = Integer.parseInt(read.readLine());
        int [] arr = new int [n];
        System.out.println("enter the array input --> ");
        for(int k=0;k<arr.length;k++)
            arr[k] = Integer.parseInt(read.readLine());
        
        int i = 0,j = 0;
        for(int k=0;k<arr.length;k++)
            take(arr);
        for(int k=0;k<arr.length;k++)
            System.out.print("\t"+arr[k]);
        System.out.println("");
    }
    
}
