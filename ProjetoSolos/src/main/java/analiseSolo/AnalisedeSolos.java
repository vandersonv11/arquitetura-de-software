/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analiseSolo;

import java.util.ArrayList;
import solo.Elementos;

/**
 *
 * @author vande
 */
public class AnalisedeSolos {

    private noSolo nosolo = new noSolo();
    private Ideal ideal = new Ideal();

    /**
     * @return the nosolo
     */
    public noSolo getNosolo() {
        return nosolo;
    }

    /**
     * @param nosolo the nosolo to set
     */
    public void setNosolo(noSolo nosolo) {
        this.nosolo = nosolo;
    }

    /**
     * @return the ideal
     */
    public Ideal getIdeal() {
        return ideal;
    }

    /**
     * @param ideal the ideal to set
     */
    public void setIdeal(Ideal ideal) {
        this.ideal = ideal;
    }
    
    
}
