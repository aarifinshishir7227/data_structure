/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci_series;

/**
 *
 * @author aarifin
 */
public class Fibonacci {
    public void fibonacci(int n){
        if(n<=1)
            System.out.println(n);
        else
        {
            int fnm1=0,fnm2=1;
            int fn=0;
            for(int i=2;i<n;i++)
            {
                fn = fnm1+fnm2;
                fnm1=fnm2;
                fnm2=fn;
                
            }
            System.out.println(fn);
            
        }
    }
    
}
