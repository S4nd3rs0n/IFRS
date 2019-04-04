package projeto;

public class ProgramaTeste1 {

    public static void main(String[] args) {
        Aluno rafal = criaAluno("Maria Santana", "Análise e Desenvolvimento de Sistemas (ADS)", 2019, false, 25200229);
    }

    public static Aluno criaAluno(String nome, String curso, int anoIngresso, boolean ehFormado, long matricula) {
        Aluno maria = new Aluno();
        maria.nome = nome;
        maria.curso = curso;
        maria.anoIngresso = anoIngresso;
        maria.ehFormado = ehFormado;
        maria.matricula = matricula;

        return maria;
    }

}
