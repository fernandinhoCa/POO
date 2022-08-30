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
       
        System.out.println("----Carro----");
        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("Nº de portas: "+meuCarro.getNumPortas());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Modelo: "+meuCarro.getTipo());
        
        
        Pessoa pes = new Pessoa();
        
        pes.setNome("Fernando");
        pes.setCorDoCabelo("Castanho");
        pes.setBiotipo("Magro");
        pes.setIdade(25);
        
        System.out.println("----Pessoa----");
        System.out.println("Nome: "+pes.getNome());
        System.out.println("Cor do cabelo: "+pes.getCorDoCabelo());
        System.out.println("Biotipo: "+pes.getBiotipo());
        System.out.println("Idade: "+pes.getIdade());
    }
    
}
