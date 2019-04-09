package projeto;

public class SetorEnsino {

    private Curso cursos[];
    private Professor professores[];
    private Aluno alunos[];
    private String diretor;
    private String coordenador;

    public boolean novoProfessor(String nome, long siape) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] == null) {
                professores[i] = new Professor();
                professores[i].setSiape(siape);
                professores[i].setNome(nome);
                return true;
            }
        }
        return false;
    }
    public Aluno novoAluno(String nome, Curso curso, int anoIngresso, boolean ehFormado, long matricula){
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = new Aluno();
                alunos[i].setNome(nome);
                alunos[i].setCurso(curso);
                alunos[i].setAnoIngresso(anoIngresso);
                alunos[i].setehFormado(ehFormado);
                alunos[i].setMatricula(matricula);
                return alunos[i];
            }
        }
        return null;
    }

    public boolean demitirProfessor(long siape) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null && professores[i].getSiape() == siape) {
                professores[i] = null;
                return true;
            }
        }
        return false;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public SetorEnsino(Curso[] cursos, Professor[] professores, String diretor, String coordenador) {
        this.cursos = cursos;
        this.professores = professores;
        this.diretor = diretor;
        this.coordenador = coordenador;
    }

    public SetorEnsino(String diretor, String coordenador) {
        this.diretor = diretor;
        this.coordenador = coordenador;
    }

}
