package com.projeto.Entidades;

import java.time.LocalTime;

import javax.persistence.*;

@Entity
@Table
public class Consulta {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcons")
    private int idConsulta;

    @JoinColumn(name = "fk_agen_cons")
    private int idAgen;

    @Column(nullable = true)
    private boolean confirmada;

    @Column(nullable = true)
    private boolean retorno;

    @Column(name = "hora_chegada", nullable = true)
    private LocalTime horaChegada;

    @Column(name = "hora_saida", nullable = true)
    private LocalTime horaSaida;

    @Column(name = "duracao", nullable = true)
    private LocalTime duracao;

    @Column(name = "concluida", nullable = true)
    private boolean concluida;

    @Column(name = "naocompareceu", nullable = true)
    private boolean naoCompareceu;

    @Column(name = "cancelada", nullable = true)
    private boolean cancelada;

    @JoinColumn(name = "fk_rec_cons", nullable = true)
    private int idReceita;

    @JoinColumn(name = "fk_feed_cons", nullable = true)
    private int idFeed;

    @JoinColumn(name = "fk_not_cons", nullable = true)
    private int idNot;

    @JoinColumn(name = "fk_pag_cons", nullable = true)
    private int idPag;

    // Metodo Construtor
    public Consulta() {

    }

    // Metodo Construtor com Atributos
    public Consulta(int idConsulta, int idAgen, boolean confirmada, boolean retorno, LocalTime horaChegada,
            LocalTime horaSaida, LocalTime duracao, boolean concluida, boolean naoCompareceu, boolean cancelada,
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

    public LocalTime getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(LocalTime horaChegada) {
        this.horaChegada = horaChegada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
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
