package projeto;

public class Aluno {

    private String nome;
    private Curso curso;
    private int anoIngresso;
    private boolean ehFormado;
    private long matricula;

    //getset Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getset Curso
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    //getset anoIngresso
    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    //getset ehFormado
    public boolean getehFormado() {
        return ehFormado;
    }

    public void setehFormado(boolean ehFormado) {
        this.ehFormado = ehFormado;
    }

    //getset Matricula
    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String verificaStatus() {
        if (!ehFormado) {
            return "O aluno ainda não completou o curso.";
        }
        return "O aluno ingressou no ano " + anoIngresso + " e se formou.";
    }

    public long obtemMatricula() {
        return matricula;
    }
}
