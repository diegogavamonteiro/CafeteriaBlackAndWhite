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
public class FabricaCapuccino extends Cafeteria{
        public  ArrayList<Ingrediente> criarIngredientes(){
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        ingredientes.add(new CafeSoluvel(100));
        ingredientes.add(new Açucar(200));
        ingredientes.add(new LeiteEmPo(100));
        ingredientes.add(new Bicarbonato(1));
        ingredientes.add(new ChocolateEmPo(50));
        ingredientes.add(new Canela(1));
        return ingredientes;
    }
    
    public Cafe criarCafe(){
        Cafe cafe = new Capuccino(this.criarIngredientes());
        
        return cafe;
    }
}
