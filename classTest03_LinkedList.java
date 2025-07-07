package com.nt;

import java.util.*;

public class classTest03_LinkedList 
{

    public static void main(String[] args)
    {
        LinkedHashSet<Object> ll = new LinkedHashSet<>();

        System.out.println("Initial size: " + ll.size());
        System.out.println("Initial set: " + ll);
        System.out.println();

        ll.add("a");
        ll.add("b");
        ll.add(5);
        ll.add(6.7);
        ll.add('p');
        ll.add(true);
        ll.add(null);
        ll.add(new Object());
        ll.add("a"); // duplicate
        ll.add(5);   // duplicate
        ll.add(null); // duplicate
        ll.add(new Object());

        System.out.println("After adding elements:");
        System.out.println(ll);
        System.out.println("Size: " + ll.size());
        System.out.println();

        System.out.println("Contains checks:");
        System.out.println(ll.contains("a"));  
        System.out.println(ll.contains(5));     
        System.out.println(ll.contains(null));  
        System.out.println(ll.contains(new String("a")));  
        System.out.println(ll.contains(new Integer(5)));   
        System.out.println(ll.contains(new Object()));  
        System.out.println();

        // Convert to List for index-based operations
        List<Object> list = new ArrayList<>(ll);
        System.out.println("Converted to List: " + list);

        System.out.println("Index-based access:");
        System.out.println("Index 0: " + list.get(0));
        System.out.println("Index 4: " + list.get(4));
        if (list.size() > 10) {
            System.out.println("Index 10: " + list.get(10));
        } else {
            System.out.println("Index 10: Out of bounds");
        }

        System.out.println("\nIterating over list:");
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}
