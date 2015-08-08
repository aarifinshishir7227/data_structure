/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ralgo26;
import java.util.*;
/**
 *
 * @author disgust
 */
public class Ralgo26 {
    static int [] la;
    static int item,k,j,n;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
                for(j=k;j<n-1;j++)
		{
			la[j] = la[j+1];	
		}
		
		n = n-1;
		for(int i=0;i<n;i++)
                    System.out.print(la[i]+"->");
                System.out.println("");
    }
    
}
