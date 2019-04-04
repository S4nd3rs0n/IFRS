package projeto;

import java.util.Scanner;

public class ProgramaTeste3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha [1] para Professor ou [2] para Aluno.");
        int opção = s.nextInt();
        System.out.println(opção);

        if (opção == 1) {
            Professor prof = new Professor();
            System.out.print("Nome: ");
            prof.nome = s.next();
            System.out.print("SIAPE: ");
            prof.siape = s.nextByte();
            System.out.print("Quantas Áreas: ");
            int area = s.nextInt();

            prof.areas = new String[area];
            System.out.println("Informe as Áreas:");
            for (int i = 0; i < area; i++) {
                prof.areas[i] = s.nextLine();
            }
        } else {
            Aluno alu = new Aluno();
            System.out.print("Nome: ");
            alu.nome = s.next();
            System.out.print("Curso: ");
            alu.curso = s.next();
            System.out.print("Matricula: ");
            alu.matricula = s.nextByte();
            System.out.println("Ingrsso: ");
            alu.anoIngresso = s.nextInt();
            alu.ehFormado = false;
        }
    }

}
