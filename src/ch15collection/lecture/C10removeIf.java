package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C10removeIf {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("jsp");
        set.add("spring");

        set.removeIf(e -> e.equals("css"));

        /*
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("css")) {
                iterator.remove();
            }
        }

         */
        System.out.println("set = " + set);



    }
}
