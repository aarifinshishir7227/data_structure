/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aarifin
 */
public class Linearsearch {

    /**
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int [] arr, int i,int j) // value interchange or swaping
    {
     int temp;
     temp = arr[i]; 
     arr[i] = arr[j];
     arr[j] = temp;
    }
    public static void take(int [] arr) //
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i-1;j<arr.length-1;j++)
            {
                if(arr[i]<arr[j]) // for ascending ordering
                {
                    swap(arr,i,j);
                }
            }
        }
        
    }
    public static boolean linearsearch(int key,int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                {
                    System.out.println("the given value is matched in the index no "+(i+1));
                   return true;
                }
            
        }
        System.out.println("value is not matched");
        return false;
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

        for(int k=0;k<arr.length;k++)
            take(arr);
        for(int k=0;k<arr.length;k++)
            System.out.print("\t"+arr[k]);
        // linear serach
        System.out.println();
        System.out.println("enter the value ,, which one do u want to search in the array --> ");
        int key = Integer.parseInt(read.readLine());
        linearsearch(key, arr);
        
        System.out.println("");
    }
    
}
