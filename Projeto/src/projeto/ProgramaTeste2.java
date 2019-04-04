package projeto;

public class ProgramaTeste2 {

    public static void main(String[] args) {
        Professor coelho = criaProfessor("Rafael Vieira Coelho", 1804250, 3);
        
        coelho.novaArea("Programação de Computadores");
        coelho.novaArea("Redes de Computadores");
        coelho.novaArea("Segurança de Sistemas");
        
    }
    
    public static Professor criaProfessor(String nome, long siape, int areas){
        Professor coelho = new Professor();
        coelho.nome = nome;
        coelho.siape = siape;
        coelho.areas = new String[areas];
        
        return coelho;
    }
}
