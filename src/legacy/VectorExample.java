package legacy;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();

        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));

        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement(new Double(5.45));

        System.out.println("Current capacity: " + v.capacity());

        Enumeration vEnum =v.elements();

        System.out.println("\nelements in vector:");

        while (vEnum.hasMoreElements())
            System.out.println(vEnum.nextElement());

        System.out.println();
    }
}
