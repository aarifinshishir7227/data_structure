/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author aarifin
 */
public class Sorting {
    public int partition(int [] a,int m,int p)
    {
        int v = a[m];
        int i = m;
        int j = p;
        while(true){
            
            while(a[i]>v && a[i] !=v)
            {
                i = i+1;
            }
            while(a[j]<v && a[j]!=v)
            {
                j = j-1;
            }
            if(i<j)
                interchange(a,i,j);
            else 
                return j;
        }
    }
    
    public void interchange(int [] a,int i,int j)
    {
        int p = a[j];
        a[j] = a[i];
        a[i] = p;
    }
    public void quicksort(int [] arr,int low,int high)
    {
         
        if(low<high)
        {
            int pivot_location = partition(arr,low,high); 
            quicksort( arr,low, pivot_location-1);
            quicksort(arr, pivot_location+1, high);
        }
        
    }
}
