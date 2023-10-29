package methods;

import interfaces.SanduicheBuilder;

import java.util.ArrayList;
import java.util.List;

public class SubwaySanduicheBuilder implements SanduicheBuilder {
    private String tipoDePao;
    private String recheio;
    private List<String> molhos = new ArrayList<>();
    private String extra;

    //metodos setters para class SanduicheBuilder
    @Override
    public SanduicheBuilder setTipoDePao(String tipoDePao) {
        this.tipoDePao = tipoDePao;
        return this;
    }

    @Override
    public SanduicheBuilder setRecheio(String recheio) {
        this.recheio = recheio;
        return this;
    }

    @Override
    public SanduicheBuilder adicionarMolho(String molho) {
        this.molhos.add(molho);
        return this;
    }

    @Override
    public SanduicheBuilder setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    @Override
    public SanduicheGet build() {
        return new SanduicheGet(tipoDePao, recheio, molhos, extra);
    }
}