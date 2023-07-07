//package segundoteste;
//
//import java.util.Scanner;
//
//public class MainTeste {
//    public static void main(String[] args) {
//        Segundo sistemaRH = new Segundo();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite o nome do candidato para iniciar processo:");
//        String nomeCandidato = scanner.nextLine();
//        try {
//            int idCandidato = sistemaRH.iniciarProcesso(nomeCandidato);
//            System.out.println("Candidato registrado com sucesso. ID: " + idCandidato);
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//        System.out.println("Digite o nome do candidato para iniciar processo:");
//        String nomeCandidato2 = scanner.nextLine();
//        try {
//            int idCandidato2 = sistemaRH.iniciarProcesso(nomeCandidato2);
//            System.out.println("Candidato registrado com sucesso. ID: " + idCandidato2);
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//        System.out.println("Digite o ID do candidato para Marcar Entrevista:");
//        int idMarcarEntrevista = Integer.parseInt(scanner.nextLine());
//        try {
//            sistemaRH.marcarEntrevista(idMarcarEntrevista);
//            System.out.println("Entrevista marcada para o candidato.");
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//        System.out.println("Digite o ID do candidato para Marcar Entrevista:");
//        int idMarcarEntrevista2 = Integer.parseInt(scanner.nextLine());
//        try {
//            sistemaRH.marcarEntrevista(idMarcarEntrevista2);
//            System.out.println("Entrevista marcada para o candidato.");
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
////        System.out.println("Digite o ID do candidato para Desqualificar:");
////        int idDesqualificar = Integer.parseInt(scanner.nextLine());
////        try {
////            sistemaRH.desqualificarCandidato(idDesqualificar);
////            System.out.println("Candidato desqualificado com sucesso.");
////        } catch (Exception e) {
////            System.out.println("Erro: " + e.getMessage());
////        }
//
////        System.out.println("Digite o ID do candidato para Verificar:");
////        int idVerificarStatus = Integer.parseInt(scanner.nextLine());
////        try {
////            String statusCandidato = sistemaRH.verificarStatusCandidato(idVerificarStatus);
////            System.out.println("Status do candidato: " + statusCandidato);
////        } catch (Exception e) {
////            System.out.println("Erro: " + e.getMessage());
////        }
//
//        System.out.println("Digite o ID do candidato para aprovar:");
//        int idAprovarCandidato = Integer.parseInt(scanner.nextLine());
//
//        try {
//            sistemaRH.aprovarCandidato(idAprovarCandidato);
//            System.out.println("Candidato aprovado com sucesso.");
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//        System.out.println("Digite o ID do candidato para aprovar:");
//        int idAprovarCandidato2 = Integer.parseInt(scanner.nextLine());
//
//        try {
//            sistemaRH.aprovarCandidato(idAprovarCandidato2);
//            System.out.println("Candidato aprovado com sucesso.");
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//        System.out.println("Lista de candidatos aprovados:");
//        sistemaRH.obterAprovados().forEach(System.out::println);
//
//    }
//
//}
