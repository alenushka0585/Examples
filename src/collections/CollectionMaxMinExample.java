package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionMaxMinExample {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("red", "green", "blue");
        System.out.println(Collections.max(collection));
        System.out.println(Collections.min(collection));
    }
}
