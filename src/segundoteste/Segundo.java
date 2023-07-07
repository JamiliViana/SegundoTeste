package segundoteste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Segundo {
    private Integer nextCodCandidato;// vai permitir que os id seja sequenciail e único por candidato
    private Map<Integer, Candidato> candidatos;//cada candidato será identificado pelo seu código ou ID

    public Segundo() {
        this.nextCodCandidato = 1;
        this.candidatos = new HashMap<>();
    }

    public int iniciarProcesso(String nome) throws Exception {
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new Exception("Nome inválido");
        }
        for (Candidato candidato : candidatos.values()) {
            if (candidato.getNome().equals(nome)) {
                throw new Exception("Candidato já participa do processo.");
            }
        }
        Candidato novoCandidato = new Candidato(nextCodCandidato, nome, "Recebido");
        candidatos.put(nextCodCandidato, novoCandidato);
        return nextCodCandidato++;
    }// FUNCIONANDO

    public void marcarEntrevista(int codCandidato) throws Exception {
        Candidato verificaCandidatoExiste = candidatos.get(codCandidato);
        if (verificaCandidatoExiste == null || !verificaCandidatoExiste.getStatus().equals("Recebido")){
            throw new Exception("Candidato não encontrado");
        }
        verificaCandidatoExiste.setStatus("Qualificado");
    }// FUNCIONANDO

    public void desqualificarCandidato(int codCandidato) throws Exception {
        Candidato verificaCandidato = candidatos.get(codCandidato);
        if (verificaCandidato == null){
            throw new Exception("Candidato não encontrado");
        }else {
            candidatos.remove(codCandidato);
            verificaCandidato.setNome(null);
            verificaCandidato.setStatus(null);
            verificaCandidato.setCodCandidato(null);
        }
    }// FUNCIONANDO

    public String verificarStatusCandidato(int codCandidato) throws Exception {
        //ve se candidato existe
        Candidato verificaCandidatoExiste = candidatos.get(codCandidato);
        if (verificaCandidatoExiste == null){
            throw new Exception("Candidato não encontrado");
        }
        return verificaCandidatoExiste.getStatus();
    }// FUNCIONANDO

    public void aprovarCandidato(int codCandidato) throws Exception {
        Candidato verificaCandidatoExiste = candidatos.get(codCandidato);
        if (verificaCandidatoExiste == null || !verificaCandidatoExiste.getStatus().equals("Qualificado")){
            throw new Exception("Candidato não encontrado");
        }
        verificaCandidatoExiste.setStatus("Aprovado");
    }// FUNCIONANDO

    public List<String> obterAprovados() {
        List<String> aprovados = new ArrayList<>();
        for(Candidato candidato: candidatos.values()){
            if (candidato.getStatus().equals("Aprovado")){
                aprovados.add(candidato.getNome());
            }
        }
        return aprovados;
    }


    private Candidato getCandidatoByCod(int codCandidato) {
        for (Candidato candidato : candidatos.values()) {
            if (candidato.getCodCandidato() == codCandidato) {
                return candidato;
            }
        }
        return null;
    }

    private class Candidato {
        private Integer codCandidato;
        private String nome;
        private String status;

        public Candidato(Integer codCandidato, String nome, String status) {
            this.codCandidato = codCandidato;
            this.nome = nome;
            this.status = status;
        }

        public Integer getCodCandidato() {
            return codCandidato;
        }

        public void setCodCandidato(Integer codCandidato) {
            this.codCandidato = codCandidato;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
