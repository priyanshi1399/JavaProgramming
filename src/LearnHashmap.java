import java.util.HashMap;
import java.util.Map;

public class LearnHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();//create a map with String key and Integer value
        map.put("Shekhar",1);
        map.put("Priyanshi",1);
        map.put("Ram",3);
        System.out.println(map);
        map.put("Priyanshi",2);
        System.out.println(map);
        System.out.println(map.get("Shekhar")); //to get the value
        map.remove("Ram");
        System.out.println(map);
        System.out.println(map.containsKey("Ram")); //check value is present or not
        for(String key:map.keySet()){
            System.out.println(key); //for keys
        }
        for(Integer val:map.values()){
            System.out.println(val); //for values
        }
        for(Map.Entry<String,Integer> ent:map.entrySet()){
            System.out.println(ent.getKey()+ ":"+ent.getValue());
        }
        System.out.println(map.getOrDefault("Ram",0));//if Ram exists then get value if not exists then give default valu 0
        System.out.println(map.getOrDefault("Priyanshi",1000));//but for this value already exists so it will give that value only
    }
}
