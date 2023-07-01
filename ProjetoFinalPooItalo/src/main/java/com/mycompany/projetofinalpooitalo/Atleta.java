/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetofinalpooitalo;

/**
 *
 * @author ipvve
 */
//Nome: Italo Pereira Ventura -  RA: 2467259

public abstract class Atleta implements CalcIdade{

    private String nome;
    private String sobrenome;
    private int idade;
    private int rg;

    private Delegacao d1 = new Delegacao();

    public Atleta(Delegacao d1) {
        this.d1 = d1;
    }

    public Atleta() {
        nome = "";
        sobrenome = "";
        idade = 0;
        rg = 0;
    }

    //calculo da idade
    public int CalculoIdade() {
        int idade = (2023-getIdade());
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getRg(){
        return rg;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   
    public Delegacao getD1() {
        return d1;
    }

    public final void setD1(Delegacao d1) {
        this.d1 = d1;
    }

}