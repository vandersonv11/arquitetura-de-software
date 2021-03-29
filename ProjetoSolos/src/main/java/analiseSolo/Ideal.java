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
public class Ideal extends Elementos{

    private ArrayList<Elementos> elementosIdeal = new ArrayList<Elementos>();

    /**
     * @return the elementosIdeal
     */
    public ArrayList<Elementos> getElementosIdeal() {
        return elementosIdeal;
    }

    /**
     * @param elementosIdeal the elementosIdeal to set
     */
    public void setElementosIdeal(ArrayList<Elementos> elementosIdeal) {
        this.elementosIdeal = elementosIdeal;
    }
    
}
