/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max_value;

/**
 *
 * @author aarifin
 */
public class Max {
    public int maximum(int []arr,int n)
    {
        int result;
        result = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>result)
                result = arr[i];
        }
        return result;
    }
    
}
