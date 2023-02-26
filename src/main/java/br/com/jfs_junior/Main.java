package br.com.jfs_junior;

import br.com.jfs_junior.exercicios.EstruturaDeDadosNos;
import br.com.jfs_junior.exercicios.SmartTv;

public class Main {
    public static void main(String[] args) {

        EstruturaDeDadosNos no1 = new EstruturaDeDadosNos("Dado 1");

        EstruturaDeDadosNos no2 = new EstruturaDeDadosNos("Dado 2");
        no1.setProximoNo(no2);

        EstruturaDeDadosNos no3 = new EstruturaDeDadosNos("Dado 3");
        no2.setProximoNo(no3);

        EstruturaDeDadosNos no4 = new EstruturaDeDadosNos("Dado 4");
        no3.setProximoNo(no4);

        EstruturaDeDadosNos no5 = new EstruturaDeDadosNos("Dado 5");
        no4.setProximoNo(no5);

        System.out.println(no1);

    }
}