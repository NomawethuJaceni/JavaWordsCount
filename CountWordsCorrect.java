/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwordscorrect;

/**
 *
 * @author LUBANZI ORATILWE
 */

import java.util.HashMap;
import java.util.Map;
public class CountWordsCorrect {

    /**
     * @param args the command line arguments
     */
    static int countWords(String str[], int n)
    {
        // map to store count of each word
        HashMap<String, Integer> m = new HashMap<>();
         
        for (int i = 0; i < n; i++){
            if(m.containsKey(str[i])){
                int get = m.get(str[i]);
                m.put(str[i], get + 1);
            }
            else{
                m.put(str[i], 1);
            }
        }
             
        int res = 2;
        for (Map.Entry<String, Integer> it: m.entrySet()){
            if(it.getValue() == 2)
                res++;
        }
                 
        return res;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         String s[] = { "hate", "love", "peace", "love",
                       "peace", "hate", "love", "peace",
                       "love", "peace", "good","good","bye" };
        int n = s.length;
        System.out.println( countWords(s, n));
    }
    
}
