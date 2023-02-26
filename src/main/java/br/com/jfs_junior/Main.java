package br.com.jfs_junior;

import br.com.jfs_junior.exercicios.EstruturaDeDadosNos;
import br.com.jfs_junior.exercicios.EstruturaDeDadosPilha;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        EstruturaDeDadosPilha minhaPilha = new EstruturaDeDadosPilha();

        minhaPilha.push(new EstruturaDeDadosNos("Dado1"));
        minhaPilha.push(new EstruturaDeDadosNos("Dado2"));
        minhaPilha.push(new EstruturaDeDadosNos("Dado3"));
        minhaPilha.push(new EstruturaDeDadosNos("Dado4"));
        minhaPilha.push(new EstruturaDeDadosNos("Dado5"));
        minhaPilha.push(new EstruturaDeDadosNos("Dado6"));

        minhaPilha.pop();
        minhaPilha.push(new EstruturaDeDadosNos("Dado7"));

        System.out.println(minhaPilha);
    }
}