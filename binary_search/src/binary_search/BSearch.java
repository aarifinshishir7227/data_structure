/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;

/**
 *
 * @author aarifin
 */
public class BSearch {
    public int bsearch(int [] array,int low,int high,int value){
        if(low > high)
            return -1;
        int middle = (low+high)/2;
        if(array[middle]==value)
            return middle;
        if(array[middle]<value)
            return bsearch(array,middle+1,high,value);
        else
           return bsearch(array,low,middle-1,value); 
    }
    
}
