package ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainEx01 {

    public static void main(String[] args) {
        Map<Integer, String> loteriaDosSonhos = new HashMap<>();

        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");


        apelidos.put("João", apelidosLucas);
        apelidos.put("Miguel", apelidosMiguel);
        apelidos.put("Maria", apelidosMaria);
        apelidos.put("Lucas", apelidosLucas);


        loteriaDosSonhos.forEach((k, v) -> System.out.println("Loteria " + k + " Significado " +v));
        System.out.println("=====================================================================");
        apelidos.forEach((k, v) -> System.out.println("Nome " + k + " Apelidos " +v));
    }
}
