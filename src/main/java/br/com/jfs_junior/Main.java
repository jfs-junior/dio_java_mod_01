package br.com.jfs_junior;

import br.com.jfs_junior.exercicios.SmartTv;

public class Main {
    public static void main(String[] args) {

        SmartTv tv = new SmartTv();
        tv.setPower();
        tv.setChannel(5);
        tv.setVolumeDown();
        tv.getStatus();
        tv.setPower();

    }
}