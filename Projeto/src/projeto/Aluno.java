package projeto;

public class Aluno {

    String nome;
    String curso;
    int anoIngresso;
    boolean ehFormado;
    long matricula;

    //getset Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getset Curso
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //getset anoIngresso
    public int getanoIngresso() {
        return anoIngresso;
    }

    public void setanoIngresso(int anoIngresso) {
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
    public long getmatricula() {
        return matricula;
    }

    public void setmatricula(long matricula) {
        this.matricula = matricula;
    }

    String verificaStatus() {
        if (!ehFormado) {
            return "O aluno ainda não completou o curso.";
        }
        return "O aluno ingressou no ano " + anoIngresso + " e se formou.";
    }

    long obtemMatricula() {
        return matricula;
    }
}
