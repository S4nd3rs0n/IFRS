package projeto;

public class Disciplina {

    private Aluno alunos[];
    private String professor;
    private String nome;
    private int ano;
    private float notas[];

    public boolean registrarNota(float nota, String nome) {
        for (int i = 0; i < notas.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equals(nome)) {
                notas[i] = nota;
                return true;
            }
        }
        return false;
    }

    public boolean novoAluno(String nome, Curso curso, int anoIngresso, long matricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                alunos[i] = new Aluno();
                alunos[i].setNome(nome);
                alunos[i].setCurso(curso);
                alunos[i].setAnoIngresso(anoIngresso);
                alunos[i].setMatricula(matricula);
                return true;
            }
        }
        return false;
    }

    public boolean alterarNota(float nota, String nome) {
        return registrarNota(nota, nome);
    }

    public boolean removerAluno(String nome) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equals(nome)) {
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public Disciplina(String professor, String nome, int ano) {
        this.professor = professor;
        this.nome = nome;
        this.ano = ano;
        this.alunos = new Aluno[30];
        this.notas = new float[30];
    }

    public Disciplina(int quantAlunos, String professor, String nome, int ano) {
        this.alunos = new Aluno[quantAlunos];
        this.notas = new float[quantAlunos];
        this.professor = professor;
        this.nome = nome;
        this.ano = ano;
    }

}
