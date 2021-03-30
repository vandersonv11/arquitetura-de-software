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
public class Ideal{
 
    private Elementos elementoIdeal;
    private double valorElementoIdeal = 0;

    /**
     * @return the elementoIdeal
     */
    public Elementos getElementoIdeal() {
        return elementoIdeal;
    }

    /**
     * @param elementoIdeal the elementoIdeal to set
     */
    public void setElementoIdeal(Elementos elementoIdeal) {
        this.elementoIdeal = elementoIdeal;
    }

    /**
     * @return the valorElementoIdeal
     */
    public double getValorElementoIdeal() {
        return valorElementoIdeal;
    }

    /**
     * @param textura
     * @param nomeElemento
     */
    public void setValorElementoIdeal(String textura, String nomeElemento) {
        if (textura.equals("argiloso")) {
            this.valorElementoIdeal = getTextura(nomeElemento);
        } else if (textura.equals("tex.media")) {
            this.valorElementoIdeal = getTextura(nomeElemento);
        }
    }
   
    private double getTextura(String nomeElemento) {
        //modificar para switch
        if (nomeElemento.equals(elementoIdeal.getNomeElemento())) {
            return 9.0;
        } else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 0.35;
        else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 6.0;
        else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 1.5;
        else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 9.0;
        else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 0.0;
        
        if (nomeElemento.equals(elementoIdeal.getNomeElemento())) {
            return 12.0;
        } else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 0.25;
        else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 4.0;
        else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 1.0;
        else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 6.0;
        else if (nomeElemento.equals(elementoIdeal.getNomeElemento()))
            return 0.0;
        return 0;
    }
}
