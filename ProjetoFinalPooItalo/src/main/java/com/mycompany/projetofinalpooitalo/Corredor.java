/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpooitalo;

/**
 *
 * @author ipvve
 */
//Nome: Italo Pereira Ventura -  RA: 2467259

public final class Corredor extends Atleta {

    private String modalidade;
    private int distancia;

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public void treinar(int distancia, String modalidade) { // método sobrecarregado
        System.out.println("O atleta corre em uma distancia de " + distancia + " metros na modalidade " + modalidade);
    }
  
    public int calcularIdade() {
        throw new UnsupportedOperationException("'calcularIdade' não foi implementado.");
    }

}