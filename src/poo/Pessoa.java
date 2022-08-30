package poo;

/**
 *
 * @author Suporte
 */
public class Pessoa {
    String nome;
    String corDoCabelo;
    String biotipo;
    int idade;
    
    void imprimeDadosDaPessoa(){
    
        System.out.println("----Pessoa----");
        System.out.println("Nome: "+nome);
        System.out.println("Cor do cabelo: "+corDoCabelo);
        System.out.println("Biotipo: "+biotipo);
        System.out.println("Idade: "+idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
