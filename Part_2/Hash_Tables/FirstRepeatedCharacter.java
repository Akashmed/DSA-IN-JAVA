package Part_2.Hash_Tables;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    Set<Character> set = new HashSet<>();

    public char find(String str){
        var chars = str.toCharArray();

        for(char ch: chars){
          if(set.contains(ch)){
              return ch;
          }

          set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
