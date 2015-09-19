/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_char_count;

import java.util.Scanner;

/**
 *
 * @author aarifin
 */
public class Counter {
     Scanner scan = new Scanner(System.in);
    private String value=scan.next();
    
    public void count()
    {
       int [] size = new int [26];
       String s = getValue();
       for(int i=0;i<s.length();i++)
       {
           char c = s.charAt(i);
           int count_value = 0;
           count_value = c - 'a';
           size[count_value]++;
       }
        for(int i=0;i<26;i++)
       {
           System.out.println(size[i]);
       }
        
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
