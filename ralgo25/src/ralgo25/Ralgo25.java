/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ralgo25;
import java.io.*;
import java.util.*;

/**
 *
 * @author disgust
 */
public class Ralgo25 {
    static int k,n,j,item;
    static int []la;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
                Scanner scan = new Scanner(System.in);
		System.out.print("enter the value how many elements do u want to take as input --->");
		n = scan.nextInt();
		la = new int [20];
		j = n;
		System.out.print("please enter the value for input ---> ");
		System.out.println("\n");
		for(int i =0;i<n;i++)
		{
			
			la[i] = scan.nextInt();
		}
		System.out.print("here show the value below ");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(la[i]+"->");
		}
		System.out.println("\n");
		System.out.print("in which position do u want to insert value ---> ");
		k = scan.nextInt();
		System.out.println("\n");
		System.out.print("which item do u want to insert ---> ");
		item = scan.nextInt();
		System.out.println("\n");
		
		while(j>=k)
		{
			la[j+1] = la[j];
			j = j-1;
			
		}
		la[k] = item;
		n = n+1;
		for(int i=0;i<n;i++)
                    System.out.print(la[i]+"->");
                System.out.println("");
           
    }
    
}
