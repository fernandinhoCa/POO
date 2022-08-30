package poo;

/**
 *
 * @author Suporte
 */
public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    
    void imprimeDadosDoCarro(){
        System.out.println("----Carro----");
        System.out.println("Cor: "+cor);
        System.out.println("Nº de portas: "+numPortas);
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+tipo);
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    
}
