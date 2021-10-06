package com.projeto.Classes;

public class Triagem {

    // Atributos
    private String idTri;
    private int idPaci;
    private boolean sintomasCovid;
    private boolean primeiraConsul;

    // Metodo Construtor
    public Triagem() {

    }

    // Metodo Construtor com Atributos
    public Triagem(String idTri, int idPaci, boolean sintomasCovid, boolean primeiraConsul) {
        this.idTri = idTri;
        this.idPaci = idPaci;
        this.sintomasCovid = sintomasCovid;
        this.primeiraConsul = primeiraConsul;
    }

    // Getters e Setters
    public String getIdTri() {
        return idTri;
    }

    public void setIdTri(String idTri) {
        this.idTri = idTri;
    }

    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

    public boolean isSintomasCovid() {
        return sintomasCovid;
    }

    public void setSintomasCovid(boolean sintomasCovid) {
        this.sintomasCovid = sintomasCovid;
    }

    public boolean isPrimeiraConsul() {
        return primeiraConsul;
    }

    public void setPrimeiraConsul(boolean primeiraConsul) {
        this.primeiraConsul = primeiraConsul;
    }
}
