import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java Developer");

        String [] names = {"ကိုကို", "ကျော်ကျော်","အောင်အောင်", "မြမြ", "နန"};

        for(String name : names ){
            if(name.equals("အောင်အောင်")){
                break;
            }
            System.out.println(name);
        }
    }
}

/***
 * Collection Framework
 * List => ArrayList, LinkedList, Vector, Stack
 * Queue => PriorityQueue, Deque, ArrayDeque
 * Set => HashSet, LinkHashSet, SortedSet, TreeSet
 */

class ArrayList1 {
    public static void main(String[] args) {
        //List Create
        List<String> names = new ArrayList<>();
        names.add("မောင်မောင်");
        names.add("အောင်အောင်");
        names.add("ကိုကို");
        names.add("ညီညီ");
        names.add("အောင်အောင်");
        System.out.println(names);
//        System.out.println("Size: " + names.size());
//        names.remove("အောင်အောင်");
//        System.out.println("Contains အောင်အောင်? " + names.contains("အောင်အောင်"));
//        names.clear();
//        System.out.println("Is empty? " + names.isEmpty());
        //UI, Backend, DBMS, Android, ios, DevOp, Testing , income

    }
}

class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2); // Allows duplicates
        System.out.println(numbers);
    }
}


class Set1 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("မောင်မောင်");
        names.add("အောင်အောင်");
        names.add("ကိုကို");
        names.add("ညီညီ");
        names.add("အောင်အောင်");
        System.out.println(names);
        for(String name : names){
            System.out.println(name);
        }
    }
}

//[ညီညီ, ကိုကို, အောင်အောင်, မောင်မောင်] Set
//[မောင်မောင်, အောင်အောင်, ကိုကို, ညီညီ, အောင်အောင်] ArrayList

class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("မောင်မောင်", 22);
        ages.put("အောင်အောင်", 21);
        ages.put("မောင်မောင်", 32);
        System.out.println(ages);
    }
}