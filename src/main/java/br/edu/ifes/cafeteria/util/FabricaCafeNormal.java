/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.util;

import br.edu.ifes.cafeteria.cdp.*;
import java.util.ArrayList;

/**
 *
 * @author DIEGOGM
 */
public class FabricaCafeNormal extends Cafeteria{
   
    public  ArrayList<Ingrediente> criarIngredientes(){
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        ingredientes.add(new CafeSoluvel(50));
        ingredientes.add(new Açucar(2));
        ingredientes.add(new Leite(100));
        return ingredientes;
    }
    
    public Cafe criarCafe(){
        Cafe cafe = new Normal(this.criarIngredientes());
        
        return cafe;
    }
}
