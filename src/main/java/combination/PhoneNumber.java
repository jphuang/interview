package combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jphuang
 */
public class PhoneNumber {
    /**
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     * 输入：digits = "23"
     * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
     *
     * 输入：digits = "2"
     * 输出：["a","b","c"]
     *
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母
     * @param digits
     * @return
     */
    List<List<Character>>  charList =  Arrays.asList(
            Arrays.asList('a','b','c'),
            Arrays.asList('d','e','f'),
            Arrays.asList('g','h','i'),
            Arrays.asList('j','k','l'),
            Arrays.asList('m','n','o'),
            Arrays.asList('p','q','r','s'),
            Arrays.asList('t','u','v'),
            Arrays.asList('w','x','y','z')
    );
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return  new ArrayList<>();
        }
        char[] chars = digits.toCharArray();
        List<List<Character>>  list  = new ArrayList<>();
        Stream<String> objectStream = null ;
         for (char aChar : chars) {
             int index = Integer.parseInt(aChar + "");
            List<Character> e = charList.get(index - 2);
            if(objectStream == null ){
                objectStream = e.stream().map(Object::toString);
            }else {
                objectStream = objectStream.flatMap(c->e.stream().map(Object::toString).map(c::concat));
            }
        }
        return objectStream.collect(Collectors.toList());
    }

}
