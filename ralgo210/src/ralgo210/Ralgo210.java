/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ralgo210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author disgust
 */
public class Ralgo210 {
    static int m,n,i,j,x=1,sum,min_mark;
    static int [][]marks;
    static int [] avr;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("enter the total number of student  ---> ");
        m = Integer.parseInt(read.readLine());
        System.out.print("enter ,, how many class test is there  ---> ");
        n = Integer.parseInt(read.readLine());
        marks = new int [m][n];
        avr = new int [m];
        // for input 
        for(i=0;i<m;i++)
        {
            System.out.println(x++ +" NO -> row is ");
            for(j=0;j<n;j++)
            {
                marks[i][j] = Integer.parseInt(read.readLine());
            }
        }
            
        //for showing 
        System.out.println("the matrix representation is given below ---> ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print("\t"+marks[i][j]); 
            }
            System.out.println("");
        }
        for(i=0;i<m;i++)
        {
            sum = 0;
            min_mark = marks[i][1];
            for (j=0;j<n;j++)
            {
                sum = sum + marks[i][j];
                if(min_mark>marks[i][j])
                {
                    min_mark = marks[i][j];
                }
            }
            avr[i] = (sum-min_mark)/n-1;
        }
        x=1;
        for(i=0;i<m;i++)
        {
            System.out.println("class test average for roll -> "+ x++ +" is --> "+avr[i]);
        }
        
    }
    
}
