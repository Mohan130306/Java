import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map <Integer,Integer> map = new HashMap<>();
        //Inserting value in map
        map.put(1,10);
        map.put(2,15);
        map.put(3,20);
        //accessing the value
        System.out.println(map.get(2));
        //checking the value if it is present in the map
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(20));
        //removing the value from the map
        map.remove(1);
        map.remove(2,15);
        //replacing the value
        map.replace(3,20,30);
        //getting size from the map
        int size = map.size();
        //checking the map is empty
        System.out.println(map.isEmpty());
        //clearing the map
        map.clear();
    }
}
