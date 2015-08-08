/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ralgo27;
import java.io.*;
/**
 *
 * @author disgust
 */
public class Ralgo27 {
    static int [] a;
    static int [] b;
    static int [] merge;
    static int m,n,x;
    

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("enter the array size for a ---> ");
        m = Integer.parseInt(read.readLine());
        a = new int [m];
        System.out.print("enter values  for a ---> ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = Integer.parseInt(read.readLine());
        }
        //for show 
        System.out.println("the values for array a is shown below --> ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" -> "+a[i]);
        }
        System.out.println("");
         n = Integer.parseInt(read.readLine());
        b = new int [n];
        System.out.print("enter values  for b ---> ");
        for(int i=0;i<b.length;i++)
        {
            b[i] = Integer.parseInt(read.readLine());
        }
        //for show 
        System.out.println("the values for array a is shown below --> ");
        
        
        for(int i=0;i<b.length;i++)
        {
            System.out.print(" -> "+b[i]);
        }
        // code here 
        System.out.println("");
        
         x = m + n;
        merge = new int [x];
        for(int i=0;i<a.length;i++)
        {
            merge[i] = a[i];
            
        }
        
        for(int i=0;i<b.length;i++)
        {
            merge[i+a.length] = b[i];
            
        }
        System.out.println(""+x);
        for(int i=0;i<a.length+b.length;i++)
            System.out.print(" -> "+merge[i]);
        System.out.println("\n");
        
        
    }
    
}
