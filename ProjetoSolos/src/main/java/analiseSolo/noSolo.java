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
public class noSolo {
    
    private ArrayList<Elementos> elementosNoSolo;
    
    public noSolo(){
        elementosNoSolo = new ArrayList<>();
    }

    /**
     * @return the elementosNoSolo
     */
    public ArrayList<Elementos> getElementosNoSolo() {
        return elementosNoSolo;
    }

    /**
     * @param elementosNoSolo the elementosNoSolo to set
     */
    public void setElementosNoSolo(ArrayList<Elementos> elementosNoSolo) {
        this.elementosNoSolo = elementosNoSolo;
    }

}
