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

        System.out.println("Digite o nome do candidatoTeste:");
        String nomeCandidatoTeste = scanner.nextLine();

        try {
            int idCandidatoTeste = sistemaRH.iniciarProcesso(nomeCandidatoTeste);
            System.out.println("Candidato registrado com sucesso. ID: " + idCandidatoTeste);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Digite o ID do candidato:");
        int idMarcarEntrevista = Integer.parseInt(scanner.nextLine());

        try {
            sistemaRH.marcarEntrevista(idMarcarEntrevista);
            System.out.println("Entrevista marcada para o candidato.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Digite o ID do candidatoStatusDiferente (2):");
        int idMarcarEntrevistaDiferente = Integer.parseInt(scanner.nextLine());

        try {
            sistemaRH.marcarEntrevista(idMarcarEntrevistaDiferente);
            System.out.println("Entrevista marcada para o candidato.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
