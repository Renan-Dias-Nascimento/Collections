package ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainEx02 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        lista.forEach(System.out::println);
        System.out.println("-----");


        Set<Integer> lista2 = new HashSet<>();
        lista2.add(1);
        lista2.add(5);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(8);
        lista2.add(8);

        lista2.forEach(System.out::println);

        // Lista permite a repetição dos números. Já o método Set não permite, imprimindo apenas uma vez cada número.
    }
}
