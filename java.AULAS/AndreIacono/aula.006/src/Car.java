public class Car {
    private String marca;
    private String modelo;
    private int ano;
    private float preco;

    Car(String marca, String modelo, int ano, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getPreco() {
        preco = (float) (this.preco + (this.preco * 0.10));
        return this.preco;
    }
}
