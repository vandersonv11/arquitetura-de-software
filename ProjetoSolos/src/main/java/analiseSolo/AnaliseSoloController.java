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
public class AnaliseSoloController {
    private Amostra amostraController = new Amostra();
    private ArrayList<Ideal> idealController = new ArrayList<Ideal>();
    private ArrayList<noSolo> nosoloController = new ArrayList<noSolo>();
    
    private Elementos elemento = new Elementos();
    
    public void setNosoloController(noSolo e) {
        nosoloController.add(e);
    }
}
