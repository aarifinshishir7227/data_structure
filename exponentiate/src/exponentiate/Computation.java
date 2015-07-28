/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentiate;

/**
 *
 * @author aarifin
 */
public class Computation {
    public long exponentiate(int x,int n){
        int m=n;
        long power =1;
        int z = x;
        while(m>0)
        {
            while(m%2==0)
            {
                m = m/2;
                z = z*z;
            }
            m=m-1;
            power = power *z;
        }
        return power;
    }
    
}
