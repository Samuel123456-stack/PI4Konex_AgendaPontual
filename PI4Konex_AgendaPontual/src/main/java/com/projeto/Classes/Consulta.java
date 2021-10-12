package com.projeto.Classes;

public class Consulta {

    // Atributos
    private int idConsulta;
    private int idAgen;
    private boolean confirmada;
    private boolean retorno;
    private String horaChegada;
    private String horaSaida;
    private String duracao;
    private boolean concluida;
    private boolean naoCompareceu;
    private boolean cancelada;
    private int idReceita;
    private int idFeed;
    private int idNot;
    private int idPag;

    // Metodo Construtor
    public Consulta() {

    }

    // Metodo Construtor com Atributos
    public Consulta(int idConsulta, int idAgen, boolean confirmada, boolean retorno, String horaChegada,
            String horaSaida, String duracao, boolean concluida, boolean naoCompareceu, boolean cancelada,
            int idReceita, int idFeed, int idNot, int idPag) {
        this.idConsulta = idConsulta;
        this.idAgen = idAgen;
        this.confirmada = confirmada;
        this.retorno = retorno;
        this.horaChegada = horaChegada;
        this.horaSaida = horaSaida;
        this.duracao = duracao;
        this.concluida = concluida;
        this.naoCompareceu = naoCompareceu;
        this.cancelada = cancelada;
        this.idReceita = idReceita;
        this.idFeed = idFeed;
        this.idNot = idNot;
        this.idPag = idPag;
    }

    // Getters e Setters
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdAgen() {
        return idAgen;
    }

    public void setIdAgen(int idAgen) {
        this.idAgen = idAgen;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public boolean isRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public boolean isNaoCompareceu() {
        return naoCompareceu;
    }

    public void setNaoCompareceu(boolean naoCompareceu) {
        this.naoCompareceu = naoCompareceu;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public int getIdFeed() {
        return idFeed;
    }

    public void setIdFeed(int idFeed) {
        this.idFeed = idFeed;
    }

    public int getIdNot() {
        return idNot;
    }

    public void setIdNot(int idNot) {
        this.idNot = idNot;
    }

    public int getIdPag() {
        return idPag;
    }

    public void setIdPag(int idPag) {
        this.idPag = idPag;
    }

}
