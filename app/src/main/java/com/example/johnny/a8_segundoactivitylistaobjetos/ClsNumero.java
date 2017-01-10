package com.example.johnny.a8_segundoactivitylistaobjetos;

import java.io.Serializable;

/**
 * Created by Johnny on 10/01/2017.
 */
public class ClsNumero implements Serializable {

    private int num;

    public ClsNumero() {

    }

    public ClsNumero(int num) {
        this.num= num;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }



}
