package interfaces;

import methods.SanduicheGet;
public interface SanduicheBuilder {
    SanduicheBuilder setTipoDePao(String tipoDePao);
    SanduicheBuilder setRecheio(String recheio);
    SanduicheBuilder adicionarMolho(String molho);
    SanduicheBuilder setExtra(String extra);
    SanduicheGet build();
}