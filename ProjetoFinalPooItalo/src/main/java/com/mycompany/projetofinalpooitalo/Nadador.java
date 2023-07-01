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

public final class Nadador extends Atleta {

    private String estilo;
    private int metros;

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public void treinar(String estilo) { // método sobrecarregado
        System.out.println("O atleta nada no estilo " + estilo);
    }
    
    public int calcularIdade() {
    
        throw new UnsupportedOperationException("'calcularIdade' não foi implementado.");
    }

}