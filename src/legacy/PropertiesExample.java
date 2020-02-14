package legacy;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;
        capitals.put("Illinois", "SpringField");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        states = capitals.keySet();
        Iterator itr = states.iterator();
        while (itr.hasNext()){
            str = (String)itr.next();
            System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
        }
        System.out.println();

        str = capitals.getProperty("Florida", "Not Found");
        System.out.println(" The capital of Florida ia " + str + ".");
    }
}
