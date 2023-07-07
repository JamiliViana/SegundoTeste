package segundoteste;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Segundo sistemaRH = new Segundo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do candidato:");
        String nomeCandidato = scanner.nextLine();

        try {
            int idCandidato = sistemaRH.iniciarProcesso(nomeCandidato);
            System.out.println("Candidato registrado com sucesso. ID: " + idCandidato);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Digite o nome do candidato2:");
        String nomeCandidato2 = scanner.nextLine();

        try {
            int idCandidato2 = sistemaRH.iniciarProcesso(nomeCandidato2);
            System.out.println("Candidato registrado com sucesso. ID: " + idCandidato2);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Digite o nome do candidato3:");
        String nomeCandidato3 = scanner.nextLine();

        try {
            int idCandidato3 = sistemaRH.iniciarProcesso(nomeCandidato3);
            System.out.println("Candidato registrado com sucesso. ID: " + idCandidato3);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
