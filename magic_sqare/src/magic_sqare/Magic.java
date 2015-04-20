/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic_sqare;

/**
 *
 * @author aarifin
 */
public class Magic {
    public void square(int n,int k,int l)
    {
        
        int [][] sqr = new int [n][n];
        int j;
        
        if(n%2==0)
        {
            System.out.print( n +" is an even number ....");
            System.out.println("");
            System.exit(0);
        }
        else
            for(int i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    sqr[i][j] =0;
                    sqr[0][(n-1)/2] = 1;                   
                }
                j=(n-1)/2;
                
                for(int key = 2;key<=n*n;key++)
                    {
                        
                        if(i>=1)
                            k = i-1;
                        else
                            k = n-1;
                        if(j>=1)
                            l = j-1;
                        else
                            l= n-1;
                        if(sqr[k][l]>=1)
                            i=(i+1)%n;
                        else
                        {
                            i=k;
                            j=l;
                        }
                        sqr[i][j] = key;
                    }
            }
        System.out.println("the magic Square is shown below");
        for(int i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(sqr[i][j]+"\t");
            }
            System.out.println("");
        }
            
        
    }
    
}
