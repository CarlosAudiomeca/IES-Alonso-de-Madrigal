package com.iesam.AlonsoMadrigal.domain;

public class Docencia extends Aula{
    private Integer sillas;
    private String tipoPizarra;

    public Integer getSillas() {
        return sillas;
    }

    public void setSillas(Integer sillas) {
        this.sillas = sillas;
    }

    public String getTipoPizarra() {
        return tipoPizarra;
    }

    public void setTipoPizarra(String tipoPizarra) {
        this.tipoPizarra = tipoPizarra;
    }
}
