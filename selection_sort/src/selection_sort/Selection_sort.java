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
public class Selection_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] array_value = {12,3,15,1,0,17,11,7,227,22,29,27,21,9};
        int a = array_value.length;
        SelectionSort select = new SelectionSort();
        select.selection(array_value, a);
        for(int i=0;i<a;i++)
            System.out.println(""+array_value[i]);
    }
    
}
