package ex03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MainEx03 {
    public static void main(String[] args) {

    Set<Integer> conjunto = new HashSet<>();

    conjunto.add(1);
    conjunto.add(2);
    conjunto.add(3);
    conjunto.add(4);
    conjunto.add(5);
    conjunto.add(6);

    Prova prova = new Prova();

    System.out.println(conjunto);
    prova.somaTotal(conjunto);

    }
}
