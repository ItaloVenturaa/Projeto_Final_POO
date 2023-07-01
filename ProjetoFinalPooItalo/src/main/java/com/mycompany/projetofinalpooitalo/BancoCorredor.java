/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpooitalo;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ipvve
 */
//Nome: Italo Pereira Ventura -  RA: 2467259

public class BancoCorredor {

    private Corredor c;
    private List<Corredor> bdCor = new ArrayList<Corredor>();

    public List<Corredor> getBdCor() {
        return bdCor;
    }

    public Corredor cadCor(Corredor c) {

        if (consCorRG(c) == null) {
            bdCor.add(c);
            return c;
        } else {
            return null;
        }
    }

    public Corredor ImpreBanco(Corredor c) {
        if (bdCor.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Não foi possível encontrar o banco de dados.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < bdCor.size(); i++) {
                JOptionPane.showMessageDialog(
                        null,
                        "Nome: " + bdCor.get(i).getNome()
                        + " - Sobrenome: " + bdCor.get(i).getSobrenome(),
                        "Banco",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            return null;
        }
        return null;
    }

    public static void impOnePes(Corredor c) {
        System.out.println(
                "NOME: " + c.getNome()
                + " - SOBRENOME: " + c.getSobrenome()
                + " - IDADE: " + c.getIdade()
                + " - RG: " + c.getRg()); 
    }

    public Corredor consCorRG(Corredor c) {
        for (int i = 0; i < bdCor.size(); i++) {
            if (c.getRg() == bdCor.get(i).getRg()) {
                return bdCor.get(i);
            }
        }
        return null;
    }

    public Corredor altCorRg(Corredor c) {
        for (int i = 0; i < bdCor.size(); i++) {
            if (c.getRg() == bdCor.get(i).getRg()) {
                c.setNome((JOptionPane.showInputDialog(
                        null,
                        "\nNOVO NOME!",
                        "ALTERAR NOME PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdCor.set(i, c);
                
                c.setSobrenome((JOptionPane.showInputDialog(
                        null,
                        "\nNOVO SOBRENOME!",
                        "ALTERAR SOBRENOME PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdCor.set(i, c);
                
                c.getD1().setRua((JOptionPane.showInputDialog(
                        null,
                        "\nNOVO NOME DA RUA!",
                        "ALTERAR RUA PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdCor.set(i, c);
                
                c.getD1().setNumcasa(Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\nNOVO NUMERO DA CASA!",
                        "ALTERAR NUMERO DA CASA PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdCor.set(i, c);
                
                c.getD1().setIdatleta(Integer.parseInt((JOptionPane.showInputDialog(
                        null,
                        "\nNOVO ID DO ATLETA!",
                        "ALTERAR ID PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE))));
                bdCor.set(i, c);
                
                c.getD1().setTelresponsavel(Long.parseLong(JOptionPane.showInputDialog(
                        null,
                        "\nNOVO TELEFONE DO RESPONSAVEL!",
                        "ALTERAR TELEFONE DO RESPONSAVEL PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdCor.set(i, c);
                
                c.setDistancia(Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\nNOVA DISTANCIA QUE CORRE!",
                        "ALTERAR DISTANCIA PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdCor.set(i, c);
                
                c.setModalidade((JOptionPane.showInputDialog(
                        null,
                        "\nNOVA MODALIDADE!",
                        "ALTERAR MODALIDADE PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdCor.set(i, c);
                return bdCor.get(i);
            }
        }
        return null;
    }

    public Corredor delCorRg(Corredor c) {
        c = consCorRG(c);
        if (c != null) {
            bdCor.remove(c);
            return null;
        } else {
            return c;
        }

    }

}
