/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.util;

import br.edu.ifes.cafeteria.cdp.*;


/**
 *
 * @author DIEGOGM
 */
public abstract class Cafeteria implements Fabrica{
    
    public static Cafe criarCafe(String nome){
        Cafe cafe;
        Fabrica fabrica;
        if(nome.equals("Capuccino")){
            fabrica = new FabricaCapuccino();
        }
        else if(nome.equals("Normal")){
            fabrica = new FabricaCafeNormal();  
        }
        else if(nome.equals("SemCafeina")){
            fabrica = new FabricaCafeSemCafeina();
        }
        else
            return null;
       
        cafe = fabrica.criarCafe();
        
        return cafe;
    }

}
