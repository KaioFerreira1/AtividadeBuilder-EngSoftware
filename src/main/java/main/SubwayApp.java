package main;

import interfaces.SanduicheBuilder;
import methods.SanduicheGet;
import methods.SubwaySanduicheBuilder;

public class SubwayApp {
    public static void main(String[] args) {
        SanduicheBuilder builder = new SubwaySanduicheBuilder();

        SanduicheGet sanduiche = builder
                .setTipoDePao("Italiano")
                .setRecheio("Frango")
                .adicionarMolho("Maionese")
                .adicionarMolho("Ketchup")
                .setExtra("Cheddar)")
                .build();

        System.out.println(sanduiche);
    }
}