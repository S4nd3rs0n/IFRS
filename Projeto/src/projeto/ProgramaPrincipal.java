package projeto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaPrincipal {

    private static final BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
    private static final SetorEnsino ensino = new SetorEnsino("Pâmela Perini", "Vitor Valente");

    public static void main(String[] args) throws IOException {

        int opcao;

        do {
            opcao = menu("MENU 1: \n [1] Aluno \n [2] Professor \n [3] Setor de Ensino \n [4] Sair");
            switch (opcao) {
                case 1:
                    System.out.print("Digite sua matricula: ");
                    long matricula = Long.parseLong(s.readLine());
                    Aluno[] alunos = ensino.getAlunos();
                    Aluno a = null;

                    for (int i = 0; i < alunos.length; i++) {
                        if (alunos[i] != null && alunos[i].getMatricula() == matricula) {
                            a = alunos[i];
                        }
                    }
                    if (a == null) {
                        System.out.print("Digite o nome do Aluno: ");
                        String nome = s.readLine();
                        System.out.print("Digite o nome do Curso do(a) " + nome + ": ");
                        Curso curso = new Curso(s.readLine());
                        System.out.print("Digite o ano de ingresso do(a) " + nome + ": ");
                        int anoIngresso = Integer.parseInt(s.readLine());
                        System.out.print("Aluno não formado");
                        boolean ehFormado = false;
                        a = ensino.novoAluno(nome, curso, anoIngresso, ehFormado, matricula);

                    }

                    menu_alunos("\nMENU 2: \n [1] Ver Cursos [2] Ver notas", a, ensino);

                    break;
                case 2:
                    menu_professor("MENU 2: \n [1] Dar Notas de uma disciplina [2] Alterar uma nota [3] Adicionar Área [4] Remover Área");
                    break;
                case 3:
                    menu_ensino("MENU 2: \n [1] Cadastrar Aluno [2] Cadastrar Curso [3] Adicionar Disciplina ao Curso [4] Cadastrar Professor");
            }
        } while (opcao != 4);
    }

    private static int menu(String opcoes) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(opcoes);
        String texto = br.readLine();
        int opcao = Integer.parseInt(texto);
        return opcao;
    }

    private static void menu_alunos(String opcoes, Aluno a, SetorEnsino ensino) throws IOException {
        int opcao = menu(opcoes);
        if ((opcao != 1) && (opcao != 2)) {
            System.err.println("ERROR");
        } else {
            if (opcao == 1) {
                Curso[] cursos = ensino.getCursos();
                for (int i = 0; i < cursos.length; i++) {
                    if (cursos[i] == null) {
                        System.err.println("Deu Errado!");
                    } else {
                        System.out.println(cursos[i].getNome());
                    }
                }

            }
        }

    }

    private static void menu_professor(String opcoes) throws IOException {
        int opcao = menu(opcoes);

    }

    private static void menu_ensino(String opcoes) throws IOException {
        int opcao = menu(opcoes);

    }
}
