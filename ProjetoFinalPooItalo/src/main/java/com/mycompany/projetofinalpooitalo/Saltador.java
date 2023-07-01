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

public final class Saltador extends Atleta {

    private String categoria;
    private int altura;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void treinar(int altura) { // método sobrecarregado
        System.out.println("O atleta salta " + altura + " metros.");
    }

    public int calcularIdade() {
        throw new UnsupportedOperationException("'calcularIdade' não foi implementado.");
    }

}