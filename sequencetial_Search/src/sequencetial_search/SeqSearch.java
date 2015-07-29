/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencetial_search;

/**
 *
 * @author aarifin
 */
public class SeqSearch {
    int seqSearch(int [] arr,int x,int n)
    {
        int i=n;
        arr[0] = x;
        while(arr[i]!=x)
        {
            i=i-1;
        }
        return i;
    }
    
}
