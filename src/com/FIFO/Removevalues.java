package com.FIFO;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Removevalues{
public static void main(String[] args) {
	
	
	Map<String, String> myMap = new TreeMap<String, String>();
	myMap.put("Key 1", "TestVal1");
	myMap.put("Key 2", "TestVal2");
	myMap.put("Key 3", "TestVal1");
    myMap.put("Key 4", "TestVal2");
    myMap.put("Key 5", "TestVal2");
    
    myMap.put("Key 6", "TestVal3");
    System.out.println("Intial : " + myMap);
    Set<String> mySet = new HashSet<String>();

    for (Iterator itr = myMap.entrySet().iterator(); itr.hasNext();)
    {
        Map.Entry<String, String> entrySet = (Map.Entry) itr.next();

        String value = entrySet.getValue();

        if (!mySet.add(value))
        {
            itr.remove();               
        }
        
    }
    System.out.println("Final Map : " + myMap);

}

}