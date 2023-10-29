package methods;

import java.util.List;

public class SanduicheGet {
    private String tipoDePao;
    private String recheio;
    private List<String> molhos;
    private String extra;

    public SanduicheGet(String tipoDePao, String recheio, List<String> molhos, String extra) {
        this.tipoDePao = tipoDePao;
        this.recheio = recheio;
        this.molhos = molhos;
        this.extra = extra;
    }

    // Métodos getters da class sanduiche

    public String getTipoDePao() {
        return tipoDePao;
    }

    public String getRecheio() {
        return recheio;
    }

    public List<String> getMolhos() {
        return molhos;
    }

    public String getExtra() {
        return extra;
    }

    @Override
    public String toString() {
        return
                "Sanduíche \n[\ntipoDePao=" + tipoDePao
                        + ", \nrecheio=" + recheio
                        + ", \nmolhos=" + molhos
                        + ", \nextra=" + extra + "\n]";
    }
}