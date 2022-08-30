
package poo;

/**
 *
 * @author Suporte
 */
public class Barco {
    
    String cor;
    String tamanho;
    String material;
    double comprimento;
    
    void imprimeDadosDoBarco(){
    
        System.out.println("----Barco----");       
        System.out.println("Cor: "+cor);
        System.out.println("Tamanho: "+tamanho);
        System.out.println("Material: "+material);
        System.out.println("Comprimento: "+comprimento);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
