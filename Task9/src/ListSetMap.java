import java.util.*;

public class ListSetMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<String> stringList = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        System.out.println("List start");
        list.add(2);
        list.add(1);
        list.add(2,3);
        stringList.add(String.valueOf(1));
        list2.add(4);
        System.out.println("It's list " + list);
        System.out.println("It's list2 " + list2);
        System.out.println("It's stringList " + stringList);
        System.out.println("List size = " + stringList.size());
        System.out.println("Return " + list.get(2));
        list2.addAll(list);
        System.out.println("- " + list.set(2,5)+ " New " + list);

        System.out.println("It's list2 " + list2);
        System.out.println("First index " + list2.indexOf(1));
        System.out.println("Last index " + list2.indexOf(3));

        System.out.println("It's " + list2.isEmpty());
        list2.clear();
        System.out.println("It's " + list2.isEmpty());

        list.remove(2);
        System.out.println("It's list " +list);

        System.out.println("It's " + list.contains(2));
        System.out.println("It's " + list.contains(7));

        System.out.println("Set start");
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        System.out.println("It's set " + set);
        System.out.println("List size = " + set.size());
        System.out.println("It's " + set.isEmpty());

        boolean addDuplicate = set.add(6);
        System.out.println("Add a duplicate element to the Set it's " + addDuplicate);

        set.remove(9);
        System.out.println("It's " + set.contains(9));
        for (Integer sets: set) System.out.println(sets);

        set.clear();
        System.out.println("Set is clear - " + set);

        System.out.println("Map start");
        map.put("teapot", "cup");
        map.put("kettle", "cup");
        map.put("table", "chair");
        map.put("window", "view");
        Set<Map.Entry<String, String>> setMap = map.entrySet();
        System.out.println(setMap);

        map.replace("window", "drapes");
        for (String mapValues: map.values()) System.out.println("Map values - " + mapValues);
        System.out.println("Map size = " + map.size());

        String itHas = map.get("teapot");
        System.out.println( "Teapot has a " + map.get("teapot"));
        map.containsKey("windo");
        System.out.println("It's " + map.containsKey("windo"));
        map.containsValue("cup");
        System.out.println("It's "+ map.containsValue("cup"));

        map.remove("kettle");
        System.out.println(setMap);
        map.clear();
        System.out.println("It's " + map.isEmpty());
        System.out.println("Map is clear - " + setMap);












    }
}
