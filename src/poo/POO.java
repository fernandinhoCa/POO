package poo;

/**
 *
 * @author Suporte
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Carro meuCarro = new Carro();
       
       meuCarro.setCor("Preto");
       meuCarro.setNumPortas(4);
       meuCarro.setPlaca("XXX-0000");
       meuCarro.setTipo("Chevete");             
        
        
        Pessoa pes = new Pessoa();
        
        pes.setNome("Fernando");
        pes.setCorDoCabelo("Castanho");
        pes.setBiotipo("Magro");
        pes.setIdade(25);
        
        
        Barco meuBarco = new Barco();
        
        meuBarco.setCor("Marrom");
        meuBarco.setTamanho("Médio");
        meuBarco.setMaterial("Madeira");
        meuBarco.setComprimento(1.4);
    }
    
}
