package projeto;

public class ProgramaTeste {

    public static void main(String[] args) {
        Aluno rafael = criaAluno("Rafael Lima", "Técnico em Informática Integrado ao Ensino Médio", 2018, false, 15311338);
    }

    public static Aluno criaAluno(String nome, String curso, int anoIngresso, boolean ehFormado, long matricula) {
        Aluno rafael = new Aluno();
        rafael.nome = nome;
        rafael.curso = curso;
        rafael.anoIngresso = anoIngresso;
        rafael.ehFormado = ehFormado;
        rafael.matricula = matricula;

        return rafael;
    }
}
