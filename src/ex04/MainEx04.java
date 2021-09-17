package ex04;

import java.nio.channels.GatheringByteChannel;
import java.security.Guard;
import java.util.ArrayList;
import java.util.List;

public class MainEx04 {
    public static void main(String[] args) {
        GuardaVolumes guardaVolumes = new GuardaVolumes();
        List<Peca> lista01 = new ArrayList<>();
        Peca peca01 = new Peca("Hering", "Blusa");
        Peca peca02 = new Peca("Stanley", "Caneca");

        lista01.add(peca01);
        lista01.add(peca02);

        guardaVolumes.guardarPecas(lista01);

        guardaVolumes.devolverPecas(1);
    }
}
