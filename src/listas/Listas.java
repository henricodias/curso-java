package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2,"Henrico");

        //list.remove("Anna");
        //list.remove(1);

        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------");
        //mostrar o índice do objeto na lista

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Henrico: " + list.indexOf("Henrico"));

        System.out.println("----------");
        //mostrar os nomes que começam com a letra "A"

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("----------");
        //mostrar o 1º elemento que começa com a letra "A"

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}