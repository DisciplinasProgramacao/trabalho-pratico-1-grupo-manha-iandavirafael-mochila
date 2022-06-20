import java.util.ArrayList;
import java.util.List;

public class mochila {
    public static final int CAPACIDADE_MAX = 10;
    private int pesoAtualMochila;
    private int valorAtualMochila;
    private List<ItemMochila> listaDeitens;
    private int capacidadeAlteravel;

    public boolean adicionar(ItemMochila item) {
        if (item.getPeso() + this.pesoAtualMochila <= this.capacidadeAlteravel) {
            this.pesoAtualMochila += item.getPeso();
            this.valorAtualMochila += item.getValor();
            listaDeitens.add(item);
            return true;
        } else {
            return false;
        }

    }

    public mochila() {
        this.pesoAtualMochila = 0;
        this.valorAtualMochila = 0;
        this.listaDeitens = new ArrayList<ItemMochila>();
    }

    public mochila(int capacidadeAlteravel) {
        this.pesoAtualMochila = 0;
        this.valorAtualMochila = 0;
        this.listaDeitens = new ArrayList<ItemMochila>();
        this.capacidadeAlteravel = capacidadeAlteravel;
    }

    public List<ItemMochila> getListaDeItens() {
        return this.listaDeitens;
    }

    public int getPesoAtual() {
        return this.pesoAtualMochila;
    }

    public int getValorAtual() {
        return this.valorAtualMochila;
    }

}
