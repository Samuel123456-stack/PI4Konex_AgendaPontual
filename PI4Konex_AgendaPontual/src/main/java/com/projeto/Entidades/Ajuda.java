package com.projeto.Entidades;


import javax.persistence.*;

@Entity
@Table(name = "ajuda")
public class Ajuda {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idaju")
    private int idAjuda;

    @Column(name = "dtsolic", nullable = true, columnDefinition = "DATE")
    private String dataSolic;

    @Column(nullable = true, length = 20)
    private String assunto;

    @Column(nullable = true)
    private String mensagem;

    // Metodo Construtor
    public Ajuda() {

    }

    // Metodo Construtor com Atributos
    public Ajuda(int idAjuda, String dataSolic, String assunto, String mensagem) {
        this.idAjuda = idAjuda;
        this.dataSolic = dataSolic;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public int getIdAjuda() {
        return idAjuda;
    }

    public void setIdAjuda(int idAjuda) {
        this.idAjuda = idAjuda;
    }

    public String getDataSolic() {
        return dataSolic;
    }

    public void setDataSolic(String dataSolic) {
        this.dataSolic = dataSolic;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
