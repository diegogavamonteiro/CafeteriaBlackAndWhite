/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.application;

import br.edu.ifes.cafeteria.cdp.*;
import br.edu.ifes.cafeteria.util.*;

/**
 *
 * @author DIEGOGM
 */
public class Application {
    public static void main(String args[]){
        
        Cafe cafe = Cafeteria.criarCafe("Capuccino");
        cafe.imprimeIngredientes(cafe.getIngredientes());
        
        Cafe cafe2 = Cafeteria.criarCafe("Normal");
        cafe2.imprimeIngredientes(cafe2.getIngredientes());
        
        Cafe cafe3 = Cafeteria.criarCafe("SemCafeina");
        cafe3.imprimeIngredientes(cafe3.getIngredientes());
         
    }
   
}
