/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection_sort;

/**
 *
 * @author aarifin
 */
public class SelectionSort {
    public void selection(int [] arr,int n)
    {
        int j;
        for(int i=0;i<n;i++)
        {
           j=i;
           for(int k = i+1;k<n;k++)
           {
               if(arr[k]<arr[j])
                   j=k;
               
           }
           int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
        }
    }
    
}
