package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("sfdad", "dasdsafa", "tretr");
//       list.stream().map(String::toUpperCase).toList().forEach(System.out::println);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 12, 20, 25, 2, 2, 2, 5, 6, 6, 7, 20);
//        integers.stream().filter(num->num%2==0).toList().forEach(System.out::println);
//        integers.stream().distinct().toList().forEach(System.out::println);

//        System.out.println(list.stream().filter(s->s.charAt(0)=='s').count());

//        list.stream().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);
//        System.out.println(integers.stream().max(Integer::compare).orElse(null));
//        System.out.println(integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null));

    }

}