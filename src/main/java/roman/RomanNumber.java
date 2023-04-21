package roman;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jphuang
 */
public class RomanNumber {

    Map<String,Integer> map = new HashMap<String,Integer>(){{
        put("I",1);
        put("V",5);
        put("X",10);
        put("L",50);
        put("C",100);
        put("D",500);
        put("M",1000);
    }};
    public int romanToInt(String s) {
        int num =  0 ;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer n = map.get(c + "");
            num += n ;
            if( i > 0) {
                Integer m = map.get(s.charAt(i-1)+ "");
                if(m < n){
                    num -= m * 2 ;
                }
            }
        }
        return  num ;
    }
}
