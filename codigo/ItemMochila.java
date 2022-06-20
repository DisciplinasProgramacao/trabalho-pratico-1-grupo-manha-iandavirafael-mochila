public class ItemMochila {

    private int valor;
    private int peso;
    private double razao;

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getRazao() {
        this.razao = (double) this.valor / this.peso;
        return this.razao;
    }

    public void setRazao(double razao) {
        this.razao = razao;
    }

    public String toString() {
        return "peso : " + peso + " valor: " + valor + " razao: " + this.razao;
    }

}
