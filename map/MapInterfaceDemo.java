package com.nt.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {
    public static void main(String[] args) {

        Map<Integer,String>map=new HashMap<>();
        map.put(123,"Rakesh");
        map.put(124,"Suresh");
        map.put(125,"Tapan");
        map.put(126,"Mondal");
        //
       /* System.out.println(map.keySet());
        System.out.println(map.remove(124));
        System.out.println(map.entrySet());*/
        System.out.println(map.values());
        for(int i:map.keySet()){
            System.out.println(i);
        }
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        Set s=map.entrySet();
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        }

}
