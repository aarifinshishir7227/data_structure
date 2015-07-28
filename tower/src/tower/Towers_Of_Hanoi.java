/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tower;

/**
 *
 * @author aarifin
 */
public class Towers_Of_Hanoi {
    public int towersofhonoi(int n,int x,int y,int z)
    {
        
        if(n>=1)
        {
            towersofhonoi(n-1, x, z, y);
            System.out.println("move top disk from tower  "+x+" to top of tower "+y);
            return towersofhonoi(n-1, z, y, x);
        }
        else
            return 0;
    
    }
    
}
