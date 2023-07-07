package segundoteste;

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
        //ve se nome candidato é vazio
        if (nome == null || nome.isEmpty() || nome.isBlank()) {
            throw new Exception("Nome inválido");
        }
        //ve se nome ja existe
        for (Candidato candidato : candidatos.values()) {
            if (candidato.getNome().equals(nome)) {
                throw new Exception("Candidato já participa do processo.");
            }
        }
        Candidato novoCandidato = new Candidato(nextCodCandidato,nome,"Recebido");
        candidatos.put(nextCodCandidato, novoCandidato);
        return nextCodCandidato++;
        //cria novo candidato com cód
        //muda status candidato para Recebido
        //retorna cód
    }

    public void marcarEntrevista(int codCandidato) {
        //ve se candidato existe
        //ve se candidato está com status recebido
        //muda status para "Qualificado"
    }

    public void desqualificarCandidato(int codCandidato) {
        // verifica se candidato existe
        // exclui candidato e seu nome
        //status do candidato agora é null
    }

    public String verificarStatusCandidato(int codCandidato) {
        //ve se candidato existe
        return "teste";
    }

    public void aprovarCandidato(int codCandidato) {
        // ve se candidato existe
        // ve se status candidato é "Qualificado"
        // muda status para "Aprovado"
    }

    public List<String> obterAprovados() {
        return null;
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
