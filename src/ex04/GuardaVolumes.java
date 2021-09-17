package ex04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GuardaVolumes {
    Map<Integer, List<Peca>> dicionario = new HashMap<>();
    Integer contador = 0;


    public Integer guardarPecas(List<Peca>listaDePecas){
        contador++;
        dicionario.put(contador, listaDePecas);
        System.out.println("Pedido armazendo em chave: "+contador);
        return contador;
    }

    public void mostrarPecas(){
       dicionario.forEach((k, v) -> System.out.println("Chave " +k+ " Peça: " +v));
    }

    public void mostrarPecas(Integer numero){
        System.out.println("Peça " + dicionario.get(numero));
    }

    public void devolverPecas(Integer numero){

        System.out.println("Retirando chave: "+ numero+" "+ dicionario.remove(numero) + " de Guarda Volumes.");
    }
}
