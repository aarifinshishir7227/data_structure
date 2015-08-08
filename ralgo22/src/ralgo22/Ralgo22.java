/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ralgo22;
import java.util.*;
/**
 *
 * @author disgust
 */
public class Ralgo22 {
    static int [] arr;
    static int found,elements,item,location;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("how many elements do you want to take as input ---> ");
        elements = scan.nextInt();
        found = 0;
        arr = new int [elements];
        for(int x =0 ;x<arr.length;x++)
            arr[x] = scan.nextInt();
        System.out.println("which value do u want to search ---> ");
        item = scan.nextInt();
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]==item)
            {
                location = x;
                found = 1;
                break;
            }
                
        }
        if(found == 1)
        {
            System.out.println("search item is found and its location is ---> "+location);
        }
        else
            System.out.println("search item is not found ");
    }
    
}
