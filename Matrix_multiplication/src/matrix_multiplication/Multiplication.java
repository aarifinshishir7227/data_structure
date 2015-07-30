/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_multiplication;

/**
 *
 * @author aarifin
 */
public class Multiplication {
    public void multiplication(int [][]a , int [][] b,int [][]c,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j] = 0;
                for(int k=0;k<n;k++)
                {
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
