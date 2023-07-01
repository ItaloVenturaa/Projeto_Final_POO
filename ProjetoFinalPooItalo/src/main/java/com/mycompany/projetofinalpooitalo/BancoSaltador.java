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

public class BancoSaltador {

    private Saltador s;
    private List<Saltador> bdSal = new ArrayList<Saltador>();

    public List<Saltador> getBdSal() {
        return bdSal;
    }

    public Saltador cadSal(Saltador s) {

        if (consSalRg(s) == null) {
            bdSal.add(s);
            return s;
        } else {
            return null;
        }
    }

    public Saltador ImpreBanco(Saltador s) {
        if (bdSal.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Não foi possível encontrar o banco de dados.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < bdSal.size(); i++) {
                JOptionPane.showMessageDialog(
                        null,
                        "Nome: " + bdSal.get(i).getNome()
                        + " - Sobrenome: " + bdSal.get(i).getSobrenome(),
                        "Banco",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            return null;
        }
        return null;
    }

    public static void impOnePes(Saltador s) {
        System.out.println(
                "NOME: " + s.getNome()
                + " - SOBRENOME: " + s.getSobrenome()
                + " - IDADE: " + s.getIdade()
                + " - RG: " + s.getRg()); 
    }

    public Saltador consSalRg(Saltador s) {
        for (int i = 0; i < bdSal.size(); i++) {
            if (s.getRg() == bdSal.get(i).getRg()) {
                return bdSal.get(i);
            }
        }
        return null;
    }

    public Saltador altSalRg(Saltador s) {
        for (int i = 0; i < bdSal.size(); i++) {
            if (s.getRg() == bdSal.get(i).getRg()) {
                s.setNome((JOptionPane.showInputDialog(
                        null,
                        "\nNOVO NOME!",
                        "ALTERAR NOME PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdSal.set(i, s);
                s.setSobrenome((JOptionPane.showInputDialog(
                        null,
                        "\nNOVO SOBRENOME!",
                        "ALTERAR SOBRENOME PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdSal.set(i, s);
                return bdSal.get(i);
            }
        }
        return null;
    }

    public Saltador delSalRg(Saltador s) {
        s = consSalRg(s);
        if (s != null) {
            bdSal.remove(s);
            return null;
        } else {
            return s;
        }

    }

}
