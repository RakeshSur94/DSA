package com.nt.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        List<String> vehicle = Arrays.asList("Car","Bus","toto");
        List<String> upperCaseName=new ArrayList<>();

       /* upperCaseName=vehicle.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        for (String v:upperCaseName) {
            System.out.println(v);
        }

        vehicle.stream().map(n->n.toUpperCase()).forEach(n->{
            System.out.println(n);
        })

        */
       // vehicle.stream().map(name->name.length()).forEach(System.out::println);
        vehicle.stream().filter(name->name.length()>3).map(name->name.toUpperCase()).forEach(System.out::println);

    }
}
