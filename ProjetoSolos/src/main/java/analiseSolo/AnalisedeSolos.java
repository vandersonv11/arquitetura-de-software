/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analiseSolo;

import java.util.ArrayList;
import solo.Amostra;
import solo.Elementos;

/**
 *
 * @author vande
 */
public class AnalisedeSolos {
   private noSolo analiseNoSolo;
   private Ideal analiseIdeal;
   private Amostra analiseAmostra;

    public AnalisedeSolos() {
        analiseNoSolo = new noSolo();
        analiseIdeal = new Ideal();
        analiseAmostra = new Amostra();
    }

    /**
     * @return the analiseNoSolo
     */
    public noSolo getAnaliseNoSolo() {
        return analiseNoSolo;
    }

    /**
     * @param analiseNoSolo the analiseNoSolo to set
     */
    public void setAnaliseNoSolo(noSolo analiseNoSolo) {
        this.analiseNoSolo = analiseNoSolo;
    }

    /**
     * @return the analiseIdeal
     */
    public Ideal getAnaliseIdeal() {
        return analiseIdeal;
    }

    /**
     * @param analiseIdeal the analiseIdeal to set
     */
    public void setAnaliseIdeal(Ideal analiseIdeal) {
        this.analiseIdeal = analiseIdeal;
    }
   
   
}
