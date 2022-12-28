package character;

import java.util.*;

/**
 * @author jphuang
 */
public class Bracket {
    Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('(',')');
        put('[',']');
        put('{','}');
    }};

    /**
     *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 每个右括号都有一个对应的相同类型的左括号。
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Set<Character> keys = map.keySet();
        Collection<Character> values = map.values();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if(keys.contains(aChar)){
                stack.push(aChar);
            }
            if(values.contains(aChar)){
                if(stack.isEmpty()){
                    return  false;
                }
                Character pop = stack.pop();
                if(pop == null){
                    return  false ;
                }
                if(!map.get(pop).equals(aChar)){
                    return  false ;
                }
            }
        }
        return  stack.isEmpty() ;
    }
}
