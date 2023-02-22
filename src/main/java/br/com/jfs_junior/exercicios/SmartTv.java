package br.com.jfs_junior.exercicios;

public class SmartTv {

    private boolean powerOn = false;
    private int channel = 1;
    private int volume = 20;

    public String isPowerOne() {
        return powerOn ? "Ligada" : "Desligada";
    }

    /**
     * Turn on/off SmartTv
     */
    public void setPower() {
        this.powerOn = !powerOn;
        if (powerOn) {
            System.out.println("TV Ligada!");
        } else {
            System.out.println("TV Desligada!");
        }
    }

    /**
     * Set current SmartTv Channel
     * @param value
     */
    public void setChannel(int value) {
        if(powerOn) {
            if(value < 201) {
                this.channel = value;
            } else {
                System.out.println("Canal Inválido!");
            }
        } else {
            System.out.println("SmartTv Desligada!!!");
        }
    }

    /**
     * Get current SmartTv Channel
     * @return int Channel
     */
    public void getChannel() {
        if(powerOn) {
            System.out.println("Canal: " + this.channel);
        } else {
            System.out.println("SmartTv Desligada!!!");
        }
    }

    /**
     * Set channel up
     */
    public void setChannelUp() {
        if(powerOn) {
            if(this.channel < 200) {
                this.channel++;
            }
        } else {
            System.out.println("SmartTv Desligada!!!");
        }
    }

    /**
     * Set channel down
     */
    public void setChannelDown() {
        if(powerOn) {
            if(this.channel > 1) {
                this.channel--;
            }
        } else {
            System.out.println("SmartTv Desligada!!!");
        }
    }

    /**
     * Set volume increase 5 by 5
     */
    public void setVolumeUp() {
        if(powerOn) {
            if(this.volume < 100) {
                this.volume = volume + 5;
            }
        } else {
            System.out.println("SmartTv Desligada!!!");
        }
    }

    /**
     * Set volume decrease 5 by 5
     */
    public void setVolumeDown() {
        if(powerOn) {
            if(this.volume > 0) {
                this.volume = volume - 5;
            }
        } else {
            System.out.println("SmartTv Desligada!!!");
        }
    }

    public void getStatus() {
        if(powerOn) {
            System.out.println();
            System.out.println("SmartTv está: " + (this.powerOn ? "Ligada!" : "Desligada!"));
            System.out.println("Canal Atual: " + this.channel);
            System.out.println("Volume Atual: " + this.volume + "%");
            System.out.println();
        } else {
            System.out.println("SmartTv Desligada!!!");
        }

    }
}
