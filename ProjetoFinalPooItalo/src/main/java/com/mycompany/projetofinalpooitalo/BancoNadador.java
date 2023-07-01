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

public class BancoNadador {

    private Nadador n;
    private List<Nadador> bdNad = new ArrayList<Nadador>();

    public List<Nadador> getBdNad() {
        return bdNad;
    }

    public Nadador cadNad(Nadador n) {

        if (consNadRg(n) == null) {
            bdNad.add(n);
            return n;
        } else {
            return null;
        }
    }

    public Nadador ImpreBanco(Nadador n) {
        if (bdNad.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Não foi possível encontrar o banco de dados.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < bdNad.size(); i++) {
                JOptionPane.showMessageDialog(
                        null,
                        "Nome: " + bdNad.get(i).getNome()
                        + " - Sobrenome: " + bdNad.get(i).getSobrenome(),
                        "Banco",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            return null;
        }
        return null;
    }

    public static void impOnePes(Nadador n) {
        System.out.println(
                "NOME: " + n.getNome()
                + " - SOBRENOME: " + n.getSobrenome()
                + " - IDADE: " + n.getIdade()
                + " - RG: " + n.getRg()); 
    }

    public Nadador consNadRg(Nadador n) {
        for (int i = 0; i < bdNad.size(); i++) {
            if (n.getRg() == bdNad.get(i).getRg()) {
                return bdNad.get(i);
            }
        }
        return null;
    }

    public Nadador altNadRg(Nadador n) {
        for (int i = 0; i < bdNad.size(); i++) {
            if (n.getRg() == bdNad.get(i).getRg()) {
                n.setNome((JOptionPane.showInputDialog(
                        null,
                        "\nNOVO NOME!",
                        "ALTERAR NOME PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdNad.set(i, n);
                n.setSobrenome((JOptionPane.showInputDialog(
                        null,
                        "\nNOVO SOBRENOME!",
                        "ALTERAR SOBRENOME PELO RG DO ATLETA",
                        JOptionPane.INFORMATION_MESSAGE)));
                bdNad.set(i, n);
                return bdNad.get(i);
            }
        }
        return null;
    }

    public Nadador delNadRg(Nadador n) {
        n = consNadRg(n);
        if (n != null) {
            bdNad.remove(n);
            return null;
        } else {
            return n;
        }

    }

}
