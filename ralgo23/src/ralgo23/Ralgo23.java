/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ralgo23;
import java.io.*;

/**
 *
 * @author disgust
 */
public class Ralgo23 {
    static int [] arr;
    static int elements,sum=0;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("how many value do u want to take as input ---> ");
        elements = Integer.parseInt(read.readLine());
        arr = new int [elements];
        System.out.print("enter the values ---> ");
        for(int i=0;i<arr.length;i++)
            arr[i] = Integer.parseInt(read.readLine());
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]%2==0) {
                sum = sum + arr[x];
            } else {
            }
            
        }
        System.out.println("summation is ---> "+sum);
    }
    
}
