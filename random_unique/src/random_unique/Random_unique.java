/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_unique;
import java.util.*;
/**
 *
 * @author anarul
 */
public class Random_unique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("please input the array size ---> ");
        int f = scan.nextInt();
        int [] arr = new int [f];
        for(int u = 0;u<arr.length;u++)
        {
            arr[u] = rand.nextInt(arr.length);
        }
        for(int c = 0;c<arr.length;c++)
        {
            System.out.println(""+arr[c]);
        }
         Set<Integer> set = new HashSet<>();
         for(int k = 0;k<arr.length;k++)
        {
            set.add(arr[k]);
        }
            System.out.println("the unique value is represented is there "+set);
            System.out.println("the total number of unique value is ---> "+set.size());
    }
    
}
