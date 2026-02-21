package Part_2.Hash_Tables;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "akash");
//        map.put(2, "ahmed");
//        System.out.println(map.get(4));

//        var obj = new FirstNotRepeatedCharacter();
//        System.out.println(obj.find("a green apple"));

//        var finder = new FirstRepeatedCharacter();
//        System.out.println(finder.find("green apple"));

        System.out.println(hash("123124-Aa"));
    }

    //hash func maps key in an array range then returns an index
    static int hash(String index) {
//        return index % 100; //suppose the range of the array is 0-99


        //in terms of a string key
        int hash=0;
        for(char ch : index.toCharArray()){
            hash += ch; //implicitly converts character to numeric value
        }
        return hash % 100 ;
    }
}
